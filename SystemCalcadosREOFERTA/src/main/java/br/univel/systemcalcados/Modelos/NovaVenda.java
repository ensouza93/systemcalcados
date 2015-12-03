package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class NovaVenda {

    private int id;
    private Cliente cliente;
    private Produto produto;
    private int quantidade;
    private double precoTotal;
    private double valorProduto;
    private FormasPagamento forma_pgto;
    private CondicoesPagamento condicao_pgto;

    public NovaVenda(Cliente cliente, Produto produto, int quantidade, double precoTotal, double valorProduto, FormasPagamento forma_pgto, CondicoesPagamento condicao_pgto) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precoTotal;
        this.valorProduto = valorProduto;
        this.forma_pgto = forma_pgto;
        this.condicao_pgto = condicao_pgto;
    }

    public NovaVenda() {
    }

    public NovaVenda(Cliente cliente, FormasPagamento formapagamento, CondicoesPagamento condicaopagamento, Produto produto, double precototal, int quantidade, double valorproduto) {
    this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoTotal = precototal;
        this.valorProduto = valorproduto;
        this.forma_pgto = formapagamento;
        this.condicao_pgto = condicaopagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public FormasPagamento getForma_pgto() {
        return forma_pgto;
    }

    public void setForma_pgto(FormasPagamento forma_pgto) {
        this.forma_pgto = forma_pgto;
    }

    public CondicoesPagamento getCondicao_pgto() {
        return condicao_pgto;
    }

    public void setCondicao_pgto(CondicoesPagamento condicao_pgto) {
        this.condicao_pgto = condicao_pgto;
    }

}
