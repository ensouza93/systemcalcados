package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.Produto;
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
public class ProdutoDAO {

    private Connection con;
    private PreparedStatement ps;

    public String inserirProduto(Produto produto) {
        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into produto(nome, marca, tamanho, cor, descricao, valorcusto, valorvenda, margemlucro, qntprodutoestoque) values (?,?,?,?,?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getMarca());
            ps.setInt(3, produto.getTamanho());
            ps.setString(4, produto.getCor());
            ps.setString(5, produto.getDescricao());
            ps.setDouble(6, produto.getValorCusto());
            ps.setDouble(7, produto.getValorVenda());
            ps.setDouble(8, produto.getMargemLucro());
            ps.setInt(9, produto.getQntProdutoEstoque());
            ps.executeUpdate();
            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Produto> listarProduto() {
        try {
            List<Produto> produtos;
            produtos = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from produto";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt(1));
                produto.setNome(rs.getString(2));
                produto.setMarca(rs.getString(3));
                produto.setTamanho(rs.getInt(4));
                produto.setCor(rs.getString(5));
                produto.setDescricao(rs.getString(6));
                produto.setValorCusto(rs.getDouble(7));
                produto.setValorVenda(rs.getDouble(8));
                produto.setMargemLucro(rs.getDouble(9));
                produto.setQntProdutoEstoque(rs.getInt(10));
                produtos.add(produto);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String altera(Produto produto, int idproduto) {
        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update produto set nome=?, marca=?, tamanho=?, cor=?, descricao=?, valorcusto=?, valorvenda=?, margemlucro=?, qntprodutoestoque=? where idproduto=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, produto.getNome());
            ps.setString(2, produto.getMarca());
            ps.setInt(3, produto.getTamanho());
            ps.setString(4, produto.getCor());
            ps.setString(5, produto.getDescricao());
            ps.setDouble(6, produto.getValorCusto());
            ps.setDouble(7, produto.getValorVenda());
            ps.setDouble(8, produto.getMargemLucro());
            ps.setInt(9, produto.getQntProdutoEstoque());
            ps.setInt(10, idproduto);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }
    }

    public String Excluir(int idproduto) {
        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from produto where idproduto=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, idproduto);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }
    }

    public Produto editarTabela(int id) {
        List<Produto> produtos = listarProduto();
        for (Produto p : produtos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

}
