package pizzaria;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Pizzas {

    private static final DecimalFormat df = new DecimalFormat("#0.00");

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

    //construtores    
    public Pizzas(String nome, int quantidade, String tamanho, boolean borda, ArrayList<Pizzas> listaPizzas) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.borda = borda;
        this.quantidade = quantidade;
        this.inginseridos = new Ingredientes[7];

        calcularValorTotal();
        listaPizzas.add(this);
    }

    public Pizzas() {
        this.nome = null;
        this.valor = 0;
        this.quantidade = 0;
        this.tamanho = null;
        this.borda = false;
        this.inginseridos = new Ingredientes[7];
    }

    //metodos
    private void calcularValorTotal() {
        this.valor = 0;

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

        for (Ingredientes ingrediente : inginseridos) {
            if (ingrediente != null) {
                this.valor += ingrediente.getValor();
            }
        }
        if (!borda) {
            this.valor -= 3;
        }
        if (quantidade > 1) {
            this.valor *= quantidade;
        }
    }

    public void addValorPizzaPredefinida(double valor) {
        this.valor += valor;
    }

    private boolean mensagemExibida = false;
    //Concertar isso
    public void addIngredientesPizza(Ingredientes ingredienteadicionado) {
        int index = 0;
        while (index < inginseridos.length) {
            if (inginseridos[index] == null) {
                inginseridos[index] = ingredienteadicionado;
                calcularValorTotal();
                return;
            }
            index++;
        }
        if (!mensagemExibida) {
            System.out.println("Ingrediente não adicionado: O limite de ingredientes foi atingido!");
            mensagemExibida = true;
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

    public String toString() {
        String saida = "";

        saida += this.nome + " R$" + df.format(this.valor ) + " - Tamanho : " + this.tamanho + " Quantidade : " + this.quantidade;

        return saida;
    }

    //COLOCAR AS BARRINHAS ATE EM BAIXO
    //staticos
    public static void getListaPizzas(ArrayList<Pizzas> listaPizzas) {

        for (int index = 0; index < listaPizzas.size(); index++) {
            System.out.println((index + 1) + ". " + listaPizzas.get(index));

        }
    }

    public static void exibirCardapioPizzas() {
        System.out.println(""
                + "\n"
                + "                       EXCELLENCE MENU\n"
                + "\n"
                + "      ---------------------------------------------------\n"
                + "\n"
                + "              \n"
                + "\n"
                + "                           PIZZAS\n"
                + "\n"
                + "  1. Margherita:\n"
                + "     P R$37 - M R$52 - G R$67: \n"
                + "     Manjericao fresco, Mussarela.\n"
                + "\n"
                + "  2. Pepperoni:\n"
                + "     P R$38 - M R$53 - G R$68:\n"
                + "     Pepperoni, Mussarela.\n"
                + "\n"
                + "  3. Calabresa:\n"
                + "     P R$40 - M R$55 - G R$70:\n"
                + "     Calabresa fatiada, Cebola, Mussarela.\n"
                + "\n"
                + "  4. Vegetariana:\n"
                + "     P R$43 - M R$58 - G 73: \n"
                + "     Cogumelos, Pimentoes, Cebola, Azeitonas pretas, \n"
                + "     Mussarela.\n"
                + "\n"
                + "  5. Frango com Catupiry:\n"
                + "     P R$43 - M R$58 - G R$73:\n"
                + "     Frango desfiado, Catupiry, Milho, Mussarela.\n"
                + "\n"
                + "  6. Pizza Brasileira:\n"
                + "     P R$43 - M R$58 - G R$73: \n"
                + "     Carne-seca desfiada, Cebola roxa, Catupiry,\n"
                + "     Mussarela.\n"
                + "\n"
                + "  7. Quatro Queijos:\n"
                + "     P R$44 - M R$59 - G R$74: \n"
                + "     Gorgonzola, Parmesao, Provolone, Mussarela.\n"
                + "\n"
                + "  8. Pizza do Chef:\n"
                + "     P R$46 - M R$61 - G R$76: \n"
                + "     Pepperoni, Cogumelos, Pimentoees, Cebola roxa, \n"
                + "     Azeitonas pretas, Mussarela.\n"
                + "     \n"              
                + "  9. Crie sua propria Pizza!:\n"
                + "     Com ate 7 ingredientes. \n"
                + "     ---------------------------------------------------\n\n ");
    }

}
