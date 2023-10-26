package pizzaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Ingredientes {

    private static final DecimalFormat df = new DecimalFormat("#0.00");

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

    //metodos
    public void removerIngrediente(ArrayList<Ingredientes> listaIngredientes, int index) {
        if (index >= 0 && index < listaIngredientes.size()) {
            listaIngredientes.remove(index);
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public String toString() {
        String saida;
        saida = this.nome + " -  R$" + df.format(this.valor);
        return saida;
    }

    //staticos
    public static Ingredientes getIngrediente(ArrayList<Ingredientes> listaIngredientes, int index) {
        Ingredientes saida = null;
        if (index >= 0 && index < listaIngredientes.size()) {
            saida = listaIngredientes.get(index);
        } else if (index == -2) {
            System.out.print("");
        } else {
            System.out.println("O indice especificado e invalido!");
        }
        return saida;
    }

    public static void getListaIngredientes(ArrayList<Ingredientes> listaIngredientes) {
        for (int index = 0; index < listaIngredientes.size(); index++) {
            System.out.println(index + 1 + ". " + listaIngredientes.get(index));
        }
    }
}
