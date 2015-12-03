
package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class FormasPagamento {

    private int id;
    private String formaPagamento;

    public FormasPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public FormasPagamento() {
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
     @Override
    public String toString() {
        return formaPagamento; //To change body of generated methods, choose Tools | Templates.
    }

}
