package pizzaria;

public class Pizzas {

    //atributos
    private String nome;
    private double valor;
    private boolean montar;
    private boolean borda;
    private int quantidade;
    private Ingredientes infoIngredientes;

    //getters and setters
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

    public boolean isMontar() {
        return this.montar;
    }

    public void setMontar(boolean montar) {
        this.montar = montar;
    }

    public boolean isBorda() {
        return this.borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Ingredientes getInfoIngredientes() {
        return this.infoIngredientes;
    }

    public void setInfoIngredientes(Ingredientes infoIngredientes) {
        this.infoIngredientes = infoIngredientes;
    }

    //construtores
    public Pizzas(String nome, double valor, boolean montar, boolean borda, int quantidade, Ingredientes infoIngredientes) {
        this.nome = nome;
        this.valor = valor;
        this.montar = montar;
        this.borda = borda;
        this.quantidade = quantidade;
        this.infoIngredientes = infoIngredientes;
    }

    public Pizzas() {
        this.nome = null;
        this.valor = 0;
        this.montar = false;
        this.borda = false;
        this.quantidade = 0;
        this.infoIngredientes = null;
    }

    //metodos
}
