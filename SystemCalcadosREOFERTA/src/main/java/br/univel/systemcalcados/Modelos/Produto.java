package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class Produto {

    private int id;
    private String nome;
    private String marca;
    private int tamanho;
    private String cor;
    private double valorCusto;
    private double margemLucro;
    private int qntProdutoEstoque;
    private double valorVenda;
    private String descricao;

    public Produto(String nome, String marca, int tamanho, String cor, double valorCusto, double margemLucro, int qntProdutoEstoque, double valorVenda, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.valorCusto = valorCusto;
        this.margemLucro = margemLucro;
        this.qntProdutoEstoque = qntProdutoEstoque;
        this.valorVenda = valorVenda;
        this.descricao = descricao;
    }

    public Produto() {
    }

    public Produto(String nome, String marca, int tamanho, String cor, String descricao, double valorcusto, double valorvenda, double margemlucro, int qntprodutoestoque) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public int getQntProdutoEstoque() {
        return qntProdutoEstoque;
    }

    public void setQntProdutoEstoque(int qntProdutoEstoque) {
        this.qntProdutoEstoque = qntProdutoEstoque;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
}
