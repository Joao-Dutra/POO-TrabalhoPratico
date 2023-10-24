package pizzaria;

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

    //metodos
    private void addIngrediente(ArrayList<Ingredientes> listaIngredientes) {
        listaIngredientes.add(this);
    }

    public void removerIngrediente(ArrayList<Ingredientes> listaIngredientes, int index) {
        if (index >= 0 && index < listaIngredientes.size()) {
            listaIngredientes.remove(index);
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public static void getIngrediente(ArrayList<Ingredientes> listaIngredientes, int index) {
        if (index >= 0 && index < listaIngredientes.size()) {
            System.out.println(listaIngredientes.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }
    
    public static void getListaIngredientes(ArrayList<Ingredientes> listaIngredientes){
        for (int index = 0; index < listaIngredientes.size(); index++) {
            System.out.println( index+1 + ". " + listaIngredientes.get(index));
        }
    }
    
    public String toString(){
        String saida;
        saida = this.nome + " -  R$" + this.valor;      
        return saida;        
    }
    /* 
    Ideia para botar estoque... 
    implementar mais pra frente?!
    */
    
    //construtores

    public Ingredientes(String nome, double valor,ArrayList<Ingredientes> listaIngredientes) {
        this.nome = nome;
        listaIngredientes.add(this);
    }

    public Ingredientes() {
        this.nome = null;
        this.valor = 0;
    }
}
