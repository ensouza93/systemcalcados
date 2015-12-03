package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.ContasReceber;
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
public class ContasReceberDAO {

    private Connection con;
    private PreparedStatement ps;

    public String inserir(ContasReceber receber) {
        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into contas_receber (nomecliente, valor, vencimento) values (?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, receber.getNomeCliente());
            ps.setDouble(2, receber.getValor());
            ps.setString(3, receber.getVencimento());

            ps.executeUpdate();
            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<ContasReceber> listar() {
        try {
            List<ContasReceber> contasReceber;
            contasReceber = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from contas_receber";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ContasReceber con = new ContasReceber();
                con.setId(rs.getInt(1));
                con.setNomeCliente(rs.getString(2));
                con.setValor(rs.getDouble(3));
                con.setVencimento(rs.getString(4));

                contasReceber.add(con);
            }
            return contasReceber;
        } catch (SQLException ex) {
            Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String altera(ContasReceber contasReceber, int idcontas_receber) {
        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update contas_receber set nomecliente=?, valor=?, vencimento=?  where idcontas_receber=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, contasReceber.getNomeCliente());
            ps.setDouble(2, contasReceber.getValor());
            ps.setString(3, contasReceber.getVencimento());

            ps.setInt(4, idcontas_receber);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }
    }

    public String Excluir(int idcontas_receber) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from contas_receber where idcontas_receber=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idcontas_receber);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasReceberDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public ContasReceber editarTabela(int idcontas_receber) {
        List<ContasReceber> contasRecebers = listar();
        for (ContasReceber cr : contasRecebers) {
            if (cr.getId() == idcontas_receber) {
                return cr;
            }
        }
        return null;
    }

}
