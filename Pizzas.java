package pizzaria2;

import java.util.ArrayList;

public class Pizzas {

    //atributos
    private String nome;
    private double valor;
    private String tamanho;
    private int quantidade;
    private boolean borda;

    //getter and setters
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean isBorda() {
        return borda;
    }

    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //metodos
    public void addPizzas(String nome, double valor, int quantidade, String tamanho, boolean borda, ArrayList<Pizzas> listaPizzas) {
        Pizzas aux = new Pizzas(nome, valor, quantidade, tamanho, borda);
        listaPizzas.add(aux);
    }

    public void removerPizzas(ArrayList<Pizzas> listaPizzas, int index) {
        if (index >= 0 && index < listaPizzas.size()) {
            listaPizzas.remove(index);
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public void getPizzas(ArrayList<Pizzas> listaPizzas, int index) {
        if (index >= 0 && index < listaPizzas.size()) {
            System.out.println(listaPizzas.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public void getListaPizzas(ArrayList<Pizzas> listaPizzas) {
        for (int index = 0; index < listaPizzas.size(); index++) {
            System.out.println(listaPizzas.get(index));
        }
    }

    /* 
    Ideia para botar estoque... 
    implementar mais pra frente?!
     */
    //construtores
    public Pizzas(String nome, double valor, int quantidade, String tamanho,boolean borda) {
        this.nome = nome;
        switch (tamanho) {
            case "Pequena":
                this.valor = 30;
                break;
            case "Media":
                this.valor = 45;
                break;
            case "Grande":
                this.valor = 60;
                break;
        }
        if (quantidade != 1) {
            this.valor = this.valor * quantidade;
        }
        if(borda){
            this.valor += 5;
        }
    }

    public Pizzas() {
        this.nome = null;
        this.valor = 0;
        this.quantidade = 0;
        this.tamanho = null;
        this.borda = false;
    }
}
