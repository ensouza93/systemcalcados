package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.ContasPagar;
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
public class ContasPagarDAO {

    private Connection con;
    private PreparedStatement ps;

    public String inserir(ContasPagar conta) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into contas_pagar(titulo, valor, vencimento) values (?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, conta.getTitulo());
            ps.setDouble(2, conta.getValor());
            ps.setString(3, conta.getVencimento());
            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String Excluir(int idcontas_pagar) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from contas_pagar where idcontas_pagar=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idcontas_pagar);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public ContasPagar editarTabela(int id) {

        List<ContasPagar> contas = listar();
        for (ContasPagar c1 : contas) {
            if (c1.getId() == id) {
                return c1;
            }
        }
        return null;

    }

    public List<ContasPagar> listar() {

        try {
            List<ContasPagar> contas;
            contas = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from contas_pagar";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ContasPagar conta = new ContasPagar();
                conta.setId(rs.getInt(1));
                conta.setTitulo(rs.getString(2));
                conta.setValor(rs.getDouble(3));
                conta.setVencimento(rs.getString(4));
                contas.add(conta);
            }
            return contas;
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String altera(ContasPagar conta, int idcontas_pagar) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update contas_pagar set titulo=?, valor=?, vencimento=? where idcontas_pagar=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, conta.getTitulo());
            ps.setDouble(2, conta.getValor());
            ps.setString(3, conta.getVencimento());
            ps.setInt(4, idcontas_pagar);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ContasPagarDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }

}
