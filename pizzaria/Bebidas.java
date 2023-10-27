package pizzaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bebidas {

    private static final DecimalFormat df = new DecimalFormat("#0.00");

    //atributos
    private String nome;
    private double valor;
    private String tamanho;

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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    //construtores

    public Bebidas(String nome, double valor, String tamanho, ArrayList<Bebidas> listaBebidas) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = valor;
        switch (this.tamanho) {
            case "Pequena":
                this.valor = valor;
                break;
            case "Media":
                this.valor = valor + 3;
                break;
            case "Grande":
                this.valor = valor + 7;
                break;
        }
        listaBebidas.add(this);
    }

    public Bebidas() {
        this.nome = null;
        this.valor = 0;
        this.tamanho = null;
    }

    //metodos
    public String toString() {
        String saida;
        saida = this.nome + " -  R$" + df.format(this.valor) + " - " + this.tamanho;
        return saida;
    }

    //staticos
    public static void getBebidas(ArrayList<Bebidas> listaBebidas, int index) {
        if (index >= 0 && index < listaBebidas.size()) {
            System.out.println(listaBebidas.get(index));
        } else if (index == -1) {
            System.out.print("");
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }

    public static void getListaBebidas(ArrayList<Bebidas> listaBebidas) {
        for (int index = 0; index < listaBebidas.size(); index++) {
            System.out.println(listaBebidas.get(index));
        }
    }
}
