package br.univel.systemcalcados.DAO;

import br.univel.systemcalcados.Modelos.Cliente;
import br.univel.systemcalcados.Modelos.CondicoesPagamento;
import br.univel.systemcalcados.Modelos.FormasPagamento;
import br.univel.systemcalcados.Modelos.NovaVenda;
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
public class NovaVendaDAO {

    private Connection con;
    private PreparedStatement ps;

    public Object inserir(NovaVenda nv1) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "insert into nova_venda(cliente_idcliente, forma_pagamento_idforma_pagamento, condicao_pagamento_idcondicao_pagamento, produto_idproduto, precototal, quantidade, valorproduto) values (?,?,?,?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setInt(1, nv1.getCliente().getId());
            ps.setInt(2, nv1.getForma_pgto().getId());
            ps.setInt(3, nv1.getCondicao_pgto().getId());
            ps.setInt(4, nv1.getProduto().getId());
            ps.setDouble(5, nv1.getPrecoTotal());
            ps.setInt(6, nv1.getQuantidade());
            ps.setDouble(7, nv1.getValorProduto());
            ps.executeUpdate();

            return "Cadastrado com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Cadastrar";
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public List<Cliente> buscaCliente() {

        try {
            List<Cliente> clientes = new ArrayList<Cliente>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from cliente";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                c.setId(id);
                c.setNome(nome);
                clientes.add(c);

            }
            return clientes;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

    }

    public List<Produto> buscaProduto() {

        try {
            List<Produto> produtos = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from produto";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Produto p = new Produto();
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                p.setId(id);
                p.setNome(nome);
                produtos.add(p);
            }
            return produtos;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
    }

    public List<String> buscaValorProduto() {

        try {
            List<String> valorproduto = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select valorvenda from produto";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome;
                nome = rs.getString(1);
                valorproduto.add(nome);
            }
            return valorproduto;
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
    }

    public Object altera(NovaVenda nv, int id) {

        try {
            con = ConexaoDAO.criarConexao();
            String sql = "update nova_venda set cliente=?, produto=?, quantidade=?, forma_pgto=?, condicao_pgto=?, precototal=?, valorproduto=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, nv.getCliente().getId());
            ps.setInt(2, nv.getProduto().getId());
            ps.setInt(3, nv.getQuantidade());
            ps.setInt(4, nv.getForma_pgto().getId());
            ps.setInt(5, nv.getCondicao_pgto().getId());
            ps.setDouble(6, nv.getPrecoTotal());
            ps.setDouble(7, nv.getValorProduto());
            ps.setInt(8, id);
            ps.execute();
            ps.close();
            con.close();
            return "Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Erro ao Alterar";
        }

    }

    public NovaVenda editarTabela(int id) {

        List<NovaVenda> nova_venda = listar();
        for (NovaVenda nv1 : nova_venda) {
            if (nv1.getId() == id) {
                return nv1;
            }
        }
        return null;

    }

    public List<NovaVenda> listar() {

        try {
            List<NovaVenda> nova_venda;
            nova_venda = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from nova_venda";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NovaVenda nv1 = new NovaVenda();
             //   nv1.setCliente(rs.getCliente(1).getId());
                //  nv1.setProduto(rs.getString(3));
                nv1.setQuantidade(rs.getInt(4));
             //   nv1.setForma_pgto(rs.getString(5));
                //    nv1.setCondicao_pgto(rs.getString(6));
                nv1.setPrecoTotal(rs.getDouble(7));
                nv1.setValorProduto(rs.getDouble(8));
                nova_venda.add(nv1);
            }
            return nova_venda;
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Object Excluir(int id) {

        try {

            con = ConexaoDAO.criarConexao();
            String sql = "delete from nova_venda where id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            ps.close();
            con.close();
            return "Deletado Com Sucesso";
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return "Falha ao Deletar";
        }

    }

    public double buscaPreco(String preco) {
        try {
            double retorna = 0;
            con = ConexaoDAO.criarConexao();
            String sql = "select preco from produto where nome = '" + preco + "'";
//            ps.setString(1, cidade);
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                //     double preco;
                //        preco = rs.getDouble(1);
                //         retorna = preco;
            }
            return retorna;
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        }
    }

    public List<FormasPagamento> buscaForma() {
        try {
            List<FormasPagamento> formapagamento = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from forma_pagamento";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                FormasPagamento f = new FormasPagamento();
                int id = rs.getInt(1);
                String nome = rs.getString(2);
                f.setId(id);
                f.setFormaPagamento(nome);
                formapagamento.add(f);
            }
            return formapagamento;
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
    }

    public List<CondicoesPagamento> buscaCond() {
        try {
            List<CondicoesPagamento> condicaopagamento = new ArrayList<>();
            con = ConexaoDAO.criarConexao();
            String sql = "select * from condicao_pagamento";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CondicoesPagamento cp = new CondicoesPagamento();
                int id = rs.getInt(1);
                String condicao = rs.getString(2);
                cp.setId(id);
                cp.setCondicao(condicao);
                condicaopagamento.add(cp);
            }
            return condicaopagamento;
        } catch (SQLException ex) {
            Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                con.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(NovaVendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
    }

}
