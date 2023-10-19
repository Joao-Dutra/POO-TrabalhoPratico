package pizzaria;

public class Ingredientes {

    private Ingredientes lista[] = new Ingredientes[16];
    //atributos
    private String nome;
    private double valor;
    private boolean quantExtra;

    //getters and setters
    public Ingredientes[] getLista() {
        return this.lista;
    }

    public void setLista(Ingredientes[] lista) {
        this.lista = lista;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isQuantExtra() {
        return this.quantExtra;
    }

    public void setQuantExtra(boolean quantExtra) {
        this.quantExtra = quantExtra;
    }

    //construtores
    public Ingredientes(String nome, double valor, boolean quantExtra) {
        this.nome = nome;
        this.valor = valor;
        this.quantExtra = quantExtra;
    }

    public Ingredientes() {
        this.nome = null;
        this.valor = 0;
        this.quantExtra = false;
    }
    //metodos

}
