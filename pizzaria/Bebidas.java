package pizzaria;

public class Bebidas {

    private Bebidas lista[] = new Bebidas[9];
    //atributos
    private String nome;
    private double valor;
    private int quan;

    //getters and setters
    public Bebidas[] getLista() {
        return this.lista;
    }

    public void setLista(Bebidas[] lista) {
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

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //construtores
    public Bebidas(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Bebidas() {
        this.nome = null;
        this.valor = 0;
        this.quantidade = 0;
    }

    //metodos
    public void addBebida() {

    }
}
