package br.univel.systemcalcados.Modelos;

/**
 *
 * @author WebSystem
 */
public class CondicoesPagamento {

    private int id;
    private String condicao;

    public CondicoesPagamento(String condicao) {
        this.condicao = condicao;
    }

    public CondicoesPagamento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    @Override
    public String toString() {
        return id+" - "+condicao; //To change body of generated methods, choose Tools | Templates.
    }

}
