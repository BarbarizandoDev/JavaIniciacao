
package atividade4;


abstract class Imposto {
    private String descricao;

    public Imposto(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularImposto();

    public String getDescricao() {
        return descricao;
    }
}
