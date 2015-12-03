package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.CondicoesPagamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author WebSystem
 */
public class CondicoesPagamentoDAO {

    private Connection con;
    private PreparedStatement ps;

    public Object inserir(CondicoesPagamento id) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into condicao_pagamento(condicaopagamento) values (?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, id.getCondicao());
            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(CondicoesPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CondicoesPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String Excluir(int idcondicao_pagamento) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from condicao_pagamento where idcondicao_pagamento=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idcondicao_pagamento);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(CondicoesPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public CondicoesPagamento editarTabela(int id) {

        List<CondicoesPagamento> pagamentos = listar();
        for (CondicoesPagamento c1 : pagamentos) {
            if (c1.getId() == id) {
                return c1;
            }
        }
        return null;

    }

    public List<CondicoesPagamento> listar() {

        try {

            List<CondicoesPagamento> pagamentos;
            pagamentos = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from condicao_pagamento";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CondicoesPagamento cond = new CondicoesPagamento();
                cond.setId(rs.getInt(1));
                cond.setCondicao(rs.getString(2));
                pagamentos.add(cond);
            }
            return pagamentos;
        } catch (SQLException ex) {
            Logger.getLogger(CondicoesPagamento.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CondicoesPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String altera(CondicoesPagamento condiP, int id) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update condicao_pagamento set condicaopagamento=? where idcondicao_pagamento=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, condiP.getCondicao());
            ps.setInt(2, id);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(CondicoesPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }

}
