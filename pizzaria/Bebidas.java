package pizzaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Bebidas {

    private static final DecimalFormat df = new DecimalFormat("#0.00");

    //atributos
    private String nome;
    private double valor;
    private String tamanho;
    private int quantidade;

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //construtores
    public Bebidas(String nome, double valor, String tamanho, int quantidade, ArrayList<Bebidas> listaBebidas) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.valor = 0;
        this.quantidade = quantidade;

        calcularValorTotal(valor);
        listaBebidas.add(this);
    }

    public Bebidas() {
        this.nome = null;
        this.valor = 0;
        this.tamanho = null;
    }

    //metodos
    private void calcularValorTotal(double valorBase) {
        switch (tamanho) {
            case "Pequena":
                this.valor = valorBase;
                break;
            case "Media":
                this.valor = valorBase + 3;
                break;
            case "Grande":
                this.valor = valorBase + 7;
                break;
        }
        if (quantidade > 1) {
            this.valor *= quantidade;
        }
    }

    public String toString() {
        String saida = "";

        saida += this.nome + " R$" + df.format(this.valor) + " - Tamanho : " + this.tamanho + " Quantidade : " + this.quantidade;

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
            System.out.println((index + 1) + ". " + listaBebidas.get(index));
        }
    }

    public static void exibirCardapioBebidas() {
        System.out.println("----------------------------------------------------"
                + "\n > Bebidas\n"
                + "(Informado os valores minimos, tamanhos maiores possuem acrescimos)\n"
                + "\n"
                + "1 - Agua Mineral(500ml)............................3,50\n"
                + "2 - Refrigerante(600ml)............................4,50\n"
                + "3 - Suco Natural (600ml)...........................6,00\n"
                + "4 - Vinho(Taca)....................................9,00\n"
                + "\n"
                + "---------------------------------------------------");
    }

}
