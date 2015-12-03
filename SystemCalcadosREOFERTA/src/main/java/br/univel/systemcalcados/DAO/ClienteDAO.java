package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.Cliente;
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
public class ClienteDAO {
private final String CAMPO_CPF = "cpf";
    
    private Connection con;
    private PreparedStatement ps;

    public Object inserir(Cliente cliente) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into Cliente (nome,"
                                               + " sobrenome, "
                                               + "endereco, bairro, cidade, "+ CAMPO_CPF + ", rg, telres, telcelular, email, refpessoala_nomecompleto, reftrabalhoa_nomeempresa, reftrabalhoa_rendasalarial, reftraballhoa_temposervico, observacao, cep, refpessoalb_nomecompleto, refpessoaa_telefone, refpessoala_celular, refpessoalb_telefone, refpessoalb_celular, reftrabalhoa_telefone) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getSobrenome());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getBairro());
            ps.setString(5, cliente.getCidade());
            ps.setString(6, cliente.getCpf());
            ps.setString(7, cliente.getRg());
            ps.setString(8, cliente.getTelRes());
            ps.setString(9, cliente.getTelCelular());
            ps.setString(10, cliente.getEmail());
            ps.setString(11, cliente.getRefPessoalA_NomeCompleto());
            ps.setString(12, cliente.getRefTrabalhoA_NomeEmpresa());
            ps.setString(13, cliente.getRefTrabalhoA_RendaSalarial());
            ps.setString(14, cliente.getRefTraballhoA_TempoServico());
            ps.setString(15, cliente.getObservacao());
            ps.setString(16, cliente.getCep());
            ps.setString(17, cliente.getRefPessoalB_NomeCompleto());
            ps.setString(18, cliente.getRefPessoalA_Telefone());
            ps.setString(19, cliente.getRefPessoalA_Celular());
            ps.setString(20, cliente.getRefPessoalB_Telefone());
            ps.setString(21, cliente.getRefPessoalB_Celular());
            ps.setString(22, cliente.getRefTrabalhoA_Telefone());

            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

//    public List<String> buscaSigla() {
//
//        try {
//            List<String> estados = new ArrayList<>();
//            con = Conexao.criarConexao();
//            String sql = "select sigla from estado";
//            ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String sigla;
//                sigla = rs.getString(1);
//                estados.add(sigla);
//            }
//            return estados;
//        } catch (SQLException ex) {
//            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        } finally {
//            try {
//                con.close();
//                ps.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
//                return null;
//            }
//        }
//
//    }
//    public List<String> buscaCidade(String param) {
//        try {
//
//            List<String> cidades = new ArrayList<>();
//            con = Conexao.criarConexao();
//            String sql = "select nome from cidade where siglaestado = ?";
//            ps = con.prepareStatement(sql);
//            ps.setString(1, param);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String nome;
//                nome = rs.getString(1);
//                cidades.add(nome);
//
//            }
//            return cidades;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//
//        } finally {
//
//            try {
//                con.close();
//                ps.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
//                return null;
//
//            }
//        }
//
//    }
//    public List<String> buscaVeiculo() {
//
//        try {
//            List<String> veiculos = new ArrayList<>();
//            con = Conexao.criarConexao();
//            String sql = "select nome from veiculo";
//            ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String nome;
//                nome = rs.getString(1);
//                veiculos.add(nome);
//
//            }
//            return veiculos;
//
//        } catch (SQLException ex) {
//            Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//
//        } finally {
//
//            try {
//                con.close();
//                ps.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(VeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
//                return null;
//
//            }
//        }
//
//    }
//    public List<String> buscaCor_Veiculo() {
//
//        try {
//            List<String> cor_veiculo = new ArrayList<>();
//            con = Conexao.criarConexao();
//            String sql = "select nome from cor_veiculo";
//            ps = con.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String nome;
//                nome = rs.getString(1);
//                cor_veiculo.add(nome);
//            }
//            return cor_veiculo;
//        } catch (SQLException ex) {
//            Logger.getLogger(CorVeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        } finally {
//
//            try {
//                con.close();
//                ps.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CorVeiculoDAO.class.getName()).log(Level.SEVERE, null, ex);
//                return null;
//
//            }
//        }
//
//    }
    public String Excluir(int id) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from cliente where cod=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public Cliente editarTabela(int id) {

        List<Cliente> clientes = listar();
        for (Cliente c1 : clientes) {
            if (c1.getId() == id) {
                return c1;
            }
        }
        return null;

    }

    public List<Cliente> listar() {

        try {
            List<Cliente> clientes;
            clientes = new ArrayList <>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from cliente";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt(1));
                cliente.setNome(rs.getString(2));
                cliente.setSobrenome(rs.getString(3));
                cliente.setEndereco(rs.getString(4));
                cliente.setBairro(rs.getString(5));
                cliente.setCidade(rs.getString(6));
                cliente.setCpf(rs.getString(7));
                cliente.setRg(rs.getString(8));
                cliente.setTelRes(rs.getString(9));
                cliente.setTelCelular(rs.getString(10));
                cliente.setEmail(rs.getString(11));
                cliente.setRefPessoalA_NomeCompleto(rs.getString(12));
                cliente.setRefTrabalhoA_NomeEmpresa(rs.getString(13));
                cliente.setRefTrabalhoA_RendaSalarial(rs.getString(14));
                cliente.setRefTraballhoA_TempoServico(rs.getString(15));
                cliente.setObservacao(rs.getString(16));
                cliente.setCep(rs.getString(17));
                cliente.setRefPessoalB_NomeCompleto(rs.getString(18));
                cliente.setRefPessoalA_Telefone(rs.getString(19));
                cliente.setRefPessoalA_Celular(rs.getString(20));
                cliente.setRefPessoalB_Telefone(rs.getString(21));
                cliente.setRefPessoalB_Celular(rs.getString(22));
                cliente.setRefTrabalhoA_Telefone(rs.getString(23));
           
                clientes.add(cliente);
            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public String altera(Cliente cli, int id) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update cliente set nome=?, sobrenome=?, endereco=?, bairro=?, cidade=?, cpf=?, rg=?, telres=?, telcelular=?, email=?, refpessoala_nomecompleto=?, reftrabalhoa_nomeempresa=?, reftrabalhoa_rendasalarial=?, reftraballhoa_temposervico=?, observacao=?, cep=?, refpessoalb_nomecompleto=?, refpessoaa_telefone=?, refpessoala_celular=?, refpessoalb_telefone=?, refpessoalb_celular=?, reftrabalhoa_telefone=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNome());
            ps.setString(2, cli.getSobrenome());
            ps.setString(3, cli.getEndereco());
            ps.setString(4, cli.getBairro());
            ps.setString(5, cli.getCidade());
            ps.setString(6, cli.getCpf());
            ps.setString(7, cli.getRg());
            ps.setString(8, cli.getTelRes());
            ps.setString(9, cli.getTelCelular());
            ps.setString(10, cli.getEmail());
            ps.setString(11, cli.getRefPessoalA_NomeCompleto());
            ps.setString(12, cli.getRefTrabalhoA_NomeEmpresa());
            ps.setString(13, cli.getRefTrabalhoA_RendaSalarial());
            ps.setString(14, cli.getRefTraballhoA_TempoServico());
            ps.setString(15, cli.getObservacao());
            ps.setString(16, cli.getCep());
            ps.setString(17, cli.getRefPessoalB_NomeCompleto());
            ps.setString(18, cli.getRefPessoalA_Telefone());
            ps.setString(19, cli.getRefPessoalA_Celular());
            ps.setString(20, cli.getRefPessoalB_Telefone());
            ps.setString(21, cli.getRefPessoalB_Celular());
            ps.setString(22, cli.getRefTrabalhoA_Telefone());

            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }

}
