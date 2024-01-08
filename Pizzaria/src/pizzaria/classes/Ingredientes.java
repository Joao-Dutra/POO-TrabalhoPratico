package pizzaria.classes;

import java.util.ArrayList;

public class Ingredientes {

    //atributos
    private String nome;
    private double valor;

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //construtores

    public Ingredientes(String nome, double valor, ArrayList<Ingredientes> listaIngredientes) {
        this.nome = nome;
        this.valor = valor;
        listaIngredientes.add(this);
    }

    public Ingredientes() {
        this.nome = null;
        this.valor = 0;
    }
}
