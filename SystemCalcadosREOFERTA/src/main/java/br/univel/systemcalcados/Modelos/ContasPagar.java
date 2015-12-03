
package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class ContasPagar {
    
    private int id;
    private String titulo;
    private double valor;
    private String vencimento;

    
    public ContasPagar(String titulo, double valor, String vencimento) {
        this.titulo = titulo;
        this.valor = valor;
        this.vencimento = vencimento;
    }

    public ContasPagar() {
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
