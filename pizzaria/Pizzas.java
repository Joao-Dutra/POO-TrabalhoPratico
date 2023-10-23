package pizzaria;

import java.util.ArrayList;

public class Pizzas {

    //atributos
    private String nome;
    private double valor;
    private String tamanho;
    private int quantidade;
    private boolean borda;
    private Ingredientes inginseridos[] = new Ingredientes[7];

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

    public Ingredientes[] getInginseridos() {
        return inginseridos;
    }

    public void setInginseridos(Ingredientes[] inginseridos) {
        this.inginseridos = inginseridos;
    }

    //metodos
    public void addPizzas(ArrayList<Pizzas> listaPizzas, String nome, int quantidade, String tamanho, boolean borda) {
        Pizzas aux = new Pizzas(nome, quantidade, tamanho, borda);
        listaPizzas.add(aux);
    }

    public void removerPizzas(ArrayList<Pizzas> listaPizzas, int index) {
        if (index >= 0 && index < listaPizzas.size()) {
            listaPizzas.remove(index);
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public static void getPizzas(ArrayList<Pizzas> listaPizzas, int index) {
        if (index >= 0 && index < listaPizzas.size()) {
            System.out.println((index+1) + ". " +listaPizzas.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public static String getListaPizzas(ArrayList<Pizzas> listaPizzas) {
        String saida = "";

        for (int index = 0; index < listaPizzas.size(); index++) {
            saida += (index+1) + ". " +listaPizzas.get(index);
        }

        return saida;
    }
    // fazer uma variavel q controla o index dos ingredientes

    public void addIngredientesPizza(Ingredientes ingredienteadicionado, int index) {
        if (index >= 0 && index < inginseridos.length) {
            inginseridos[index] = ingredienteadicionado;
            this.valor += ingredienteadicionado.getValor();
        } else {
            System.out.println("O limite de ingredientes foi atingido!");
        }
    }
    // ficar esperto com o index + 1 por informar posicao   

    public void removerIngredientesPizza(int index) {
        index -= 1;
        if (inginseridos[index] == null || index < 0 && index > inginseridos.length) {
            System.out.println("Ingrediente informado ja foi removido ou posicao informada nao existe!");
        } else {
            inginseridos[index] = null;
            this.valor -= inginseridos[index].getValor();
        }
    }

    public void getListaIngredientesInseridos() {
        for (int index = 0; index < inginseridos.length; index++) {
            if (inginseridos[index] == null) {
                System.out.println("Espaco Vazio");
            } else {
                System.out.println(inginseridos[index]);
            }
        }
    }

    public void getIngredientesInseridos(int index) {
        if (inginseridos[index] == null) {
            System.out.println("Espaco Vazio");
        } else {
            System.out.println(inginseridos[index]);
        }
    }

    public String toString() {
        String saida = "";

        saida += this.nome;

        return saida;
    }

    /*
    Ideia para botar estoque... 
    implementar mais pra frente?!
     */
    //construtores    
    public Pizzas(String nome, int quantidade, String tamanho, boolean borda) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.borda = borda;
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

        if (quantidade > 1) {
            this.valor *= quantidade;
        }
        if (borda) {
            this.valor += 5;
        }
        this.inginseridos = new Ingredientes[7];
    }

    public Pizzas() {
        this.nome = null;
        this.valor = 0;
        this.quantidade = 0;
        this.tamanho = null;
        this.borda = false;
        this.inginseridos = new Ingredientes[7];
    }
}
