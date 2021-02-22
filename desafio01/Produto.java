package desafio01;

public class Produto {
    private String nome;
    private Double valor;
    private int tipo;

    Produto() {    }

    public Produto(String nome, Double valor, int tipo) {
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
