package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.Funcionario;
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
public class FuncionarioDAO {

    private Connection con;
    private PreparedStatement ps;

    public Object inserir(Funcionario func) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into funcionario(nome, sobrenome, cpf, rg, endereco, bairro, cidade, cep, celular, telres, email, cargo, observacao) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, func.getNome());
            ps.setString(2, func.getSobrenome());
            ps.setString(3, func.getCpf());
            ps.setString(4, func.getRg());
            ps.setString(5, func.getEndereco());
            ps.setString(6, func.getBairro());
            ps.setString(7, func.getCidade());
            ps.setString(8, func.getCep());
            ps.setString(9, func.getCelular());
            ps.setString(10, func.getTelRes());
            ps.setString(11, func.getEmail());
            ps.setString(12, func.getObservacao());
            ps.setString(13, func.getCargo());
            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String Excluir(int idfuncionario) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from funcionario where idfuncionario=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idfuncionario);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public Funcionario editarTabela(int id) {

        List<Funcionario> clientes = listar();
        for (Funcionario f1 : clientes) {
            if (f1.getId() == id) {
                return f1;
            }
        }
        return null;

    }

    public List<Funcionario> listar() {

        try {
            List<Funcionario> funcionarios;
            funcionarios = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from funcionario";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Funcionario func = new Funcionario();
                func.setId(rs.getInt(1));
                func.setNome(rs.getString(2));
                func.setSobrenome(rs.getString(3));
                func.setCpf(rs.getString(4));
                func.setRg(rs.getString(5));
                func.setEndereco(rs.getString(6));
                func.setBairro(rs.getString(7));
                func.setCidade(rs.getString(8));
                func.setCep(rs.getString(9));
                func.setCelular(rs.getString(10));
                func.setTelRes(rs.getString(11));
                func.setEmail(rs.getString(12));
                func.setObservacao(rs.getString(13));
                func.setCargo(rs.getString(14));
                funcionarios.add(func);
            }
            return funcionarios;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String altera(Funcionario fun, int idfuncionario) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update funcionario set nome=?, sobrenome=?, cpf=?, rg=?, endereco=?, bairro=?, cidade=?, cep=?, celular=?, telres=?, email=?, observacao=?, cargo=? where idfuncionario=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, fun.getNome());
            ps.setString(2, fun.getSobrenome());
            ps.setString(3, fun.getCpf());
            ps.setString(4, fun.getRg());
            ps.setString(5, fun.getEndereco());
            ps.setString(6, fun.getBairro());
            ps.setString(7, fun.getCidade());
            ps.setString(8, fun.getCep());
            ps.setString(9, fun.getCelular());
            ps.setString(10, fun.getTelRes());
            ps.setString(11, fun.getEmail());
            ps.setString(12, fun.getObservacao());
            ps.setString(13, fun.getCargo());
            ps.setInt(14, idfuncionario);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }


    public List<String> buscaCargo() {

        try {
            List<String> cargos = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select nome from cargo";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome;
                nome = rs.getString(1);
                cargos.add(nome);
            }
            return cargos;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

    }

}
