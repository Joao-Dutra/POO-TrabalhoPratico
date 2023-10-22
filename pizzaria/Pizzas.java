package pizzaria;

import java.util.ArrayList;

public class Pizzas {

    //atributos
    private String nome;
    private double valor;
    private String tamanho;
    private int quantidade;
    private boolean borda;
    private Ingredientes inginseridos[] = new Ingredientes [7];

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
 // fazer uma variavel q controla o index dos ingredientes
    public void addIngredientesPizza(Ingredientes ingredienteadicionado,int index){
        if (index >= 0 && index < inginseridos.length) {
            inginseridos[index] = ingredienteadicionado;
        } else {
            System.out.println("O limite de ingredientes foi atingido!");
        }
    }
 // ficar esperto com o index + 1 por informar posicao   
    public void removerIngredientesPizza(int index){
        index += 1;
        if(inginseridos[index] == null || index < 0 && index > inginseridos.length){
            System.out.println("Ingrediente informado já foi removido ou posição informada não existe!");
        }else{
            inginseridos[index] = null;
        }
    }

    public void getIngredientesInseridos(){
        for (int index = 0; index < inginseridos.length; index++) {
            System.out.println(inginseridos[index]);
        }
    }
    
    
    public void setBorda(boolean borda) {
        this.borda = borda;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    //metodos
    public void addPizzas(ArrayList<Pizzas> listaPizzas) {
        Pizzas aux = new Pizzas(this.nome, this.valor, this.quantidade, this.tamanho, this.borda);
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
    
    //Fazer na main a logica de adicionar valor total de acordo com o ingrediente (valor ingrediente ) selecionado;

    public Pizzas() {
        this.nome = null;
        this.valor = 0;
        this.quantidade = 0;
        this.tamanho = null;
        this.borda = false;
    }
}
