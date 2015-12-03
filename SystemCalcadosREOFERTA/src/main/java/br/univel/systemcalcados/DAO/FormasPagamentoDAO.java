package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.FormasPagamento;
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
public class FormasPagamentoDAO {

    private Connection con;
    private PreparedStatement ps;

    public Object inserir(FormasPagamento id) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into forma_pagamento(formapagamento) values (?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, id.getFormaPagamento());
            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String Excluir(int idforma_pagamento) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from forma_pagamento where idforma_pagamento=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idforma_pagamento);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public FormasPagamento editarTabela(int id) {

        List<FormasPagamento> pagamentos = listar();
        for (FormasPagamento c1 : pagamentos) {
            if (c1.getId() == id) {
                return c1;
            }
        }
        return null;

    }

    public List<FormasPagamento> listar() {
        try {

            List<FormasPagamento> pagamentos;
            pagamentos = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from forma_pagamento";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FormasPagamento cond = new FormasPagamento();
                cond.setId(rs.getInt(1));
                cond.setFormaPagamento(rs.getString(2));
                pagamentos.add(cond);
            }
            return pagamentos;
        } catch (SQLException ex) {
            Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String altera(FormasPagamento formaP, int idforma_pagamento) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update forma_pagamento set formapagamento=? where idforma_pagamento=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, formaP.getFormaPagamento());
            ps.setInt(2, idforma_pagamento);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FormasPagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }
    
   

}
