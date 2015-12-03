package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class ContasReceber {

    private int id;
    private String NomeCliente;
    private double valor;
    private String vencimento;

    public ContasReceber() {
    }

    public ContasReceber(String NomeCliente, double valor, String vencimento) {
        this.NomeCliente = NomeCliente;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public ContasReceber(String nome, String vencimento, double valor) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
}