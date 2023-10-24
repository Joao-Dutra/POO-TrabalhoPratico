package pizzaria;

import java.util.ArrayList;
import static pizzaria.Pizzaria.entrada;
import static pizzaria.Pizzaria.listaPizzas;

public class Pedidos {

    //atributos
    private ArrayList<Bebidas> listaBebidasPedido = new ArrayList<Bebidas>();
    private ArrayList<Pizzas> listaPizzasPedido = new ArrayList<Pizzas>();
    private double gorjeta;

    //construtor
    public Pedidos() {
        this.gorjeta = 0;
    }
  
    //metodos
    public void addPizzasPedido(Pizzas pizzasadicionada) {
        listaPizzasPedido.add(pizzasadicionada);
    }

    public void addBebidasPedido(Bebidas bebidasadicionada) {
        listaBebidasPedido.add(bebidasadicionada);
    }

    // FAZER INDEX POSIÇÃO E CUIDADO COM O INDEX + 1
    public void removerPizzasPedido(int index) {
        index += 1;

        if (index >= 0 && index < listaPizzasPedido.size()) {
            listaPizzasPedido.remove(index);
        } else {
            System.out.println("A pizza especificada ja foi removida ou posicao indicada invalida!");
        }
    }

    public void removerBebidaPedido(int index) {
        index += 1;

        if (index >= 0 && index < listaBebidasPedido.size()) {
            listaBebidasPedido.remove(index);
        } else {
            System.out.println("A bebida especificada ja foi removida ou posicao indicada invalida!");
        }
    }

    public void exibirPedido(){
        for (int index = 0; index < listaPizzasPedido.size(); index++) {
            System.out.println(listaPizzasPedido.get(index));
        }
        for (int index = 0; index < listaBebidasPedido.size(); index++) {
            System.out.println(listaBebidasPedido.get(index));
        }
    }
    
    public void exibirPedidoEspecificoPizza(int index) {
        if (index >= 0 && index < listaPizzasPedido.size()) {
            System.out.println(listaPizzasPedido.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }
    
    public void exibirPedidoEspecificoBebidas(int index) {
        if (index >= 0 && index < listaBebidasPedido.size()) {
            System.out.println(listaBebidasPedido.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }
    
    public String toString(int index) {
        String saida;
        saida = listaPizzasPedido.get(index).getNome() + "................................" + listaPizzasPedido.get(index).getValor() + "\n" + listaBebidasPedido.get(index).getNome() + "................................" + listaBebidasPedido.get(index).getValor() + "\n";
        return saida;
    }

    public void darGorjeta(double gorjeta){
        this.gorjeta += gorjeta;
    }
    
    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }
    //staticos
    //AJUSTAR ESSAS PERGUNTAS AI
    public static void pizzasPredefinidas(int comando){
        switch (comando) {
                    case 1:
                        System.out.println("Digite o tamanho (1 - Pequena,2 - Media ou 3 - Grande) da Pizza Margherita voce ira querer e a quantidade de Pizzas Margheritas que voce ira querer : ");
                        int qTamanho = entrada.nextInt();
                        String tamanho1 = "";
                        switch(qTamanho){
                            case 1 : tamanho1 = "Pequena";
                            break;
                            case 2 : tamanho1 = "Media";
                            break;
                            case 3 : tamanho1 = "Grande";
                        }
                            
                        System.out.println("");
                        int quantidade1 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (S || N) ");
                        char qBorda1 = entrada.next().charAt(0);
                        boolean borda1;
                        if (qBorda1 == 'S') {
                            borda1 = true;
                        } else {
                            borda1 = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita", quantidade1, tamanho1, borda1, listaPizzas);
                        break;
                    case 2:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Pepperoni voce ira querer :");
                        String tamanho2 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Pepperoni que voce ira querer : ");
                        int quantidade2 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda2 = entrada.nextLine();
                        boolean borda2;
                        if (qBorda2 == "Sim") {
                            borda2 = true;
                        } else {
                            borda2 = false;
                        }
                        Pizzas Pepperoni = new Pizzas("Pepperoni", quantidade2, tamanho2, borda2, listaPizzas);
                        break;
                    case 3:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Calabresa voce ira querer :");
                        String tamanho3 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Pepperoni que voce ira querer : ");
                        int quantidade3 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda3 = entrada.nextLine();
                        boolean borda3;
                        if (qBorda3 == "Sim") {
                            borda3 = true;
                        } else {
                            borda3 = false;
                        }
                        Pizzas Calabresa = new Pizzas("Calabresa", quantidade3, tamanho3, borda3, listaPizzas);
                        break;
                    case 4:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Vegetariana voce ira querer :");
                        String tamanho4 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Vegetariana que voce ira querer : ");
                        int quantidade4 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda4 = entrada.nextLine();
                        boolean borda4;
                        if (qBorda4 == "Sim") {
                            borda4 = true;
                        } else {
                            borda4 = false;
                        }
                        Pizzas Vegetariana = new Pizzas("Vegetariana", quantidade4, tamanho4, borda4, listaPizzas);
                        break;
                    case 5:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Pepperoni voce ira querer :");
                        String tamanho5 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Pepperoni que voce ira querer : ");
                        int quantidade5 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda5 = entrada.nextLine();
                        boolean borda5;
                        if (qBorda5 == "Sim") {
                            borda5 = true;
                        } else {
                            borda5 = false;
                        }
                        Pizzas FrangoComCatupiry = new Pizzas("Frango com Catupiry", quantidade5, tamanho5, borda5, listaPizzas);
                        break;
                    case 6:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Brasileira voce ira querer :");
                        String tamanho6 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Brasileira que voce ira querer : ");
                        int quantidade6 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda6 = entrada.nextLine();
                        boolean borda6;
                        if (qBorda6 == "Sim") {
                            borda6 = true;
                        } else {
                            borda6 = false;
                        }
                        Pizzas Brasileira = new Pizzas("Brasileira", quantidade6, tamanho6, borda6, listaPizzas);
                        break;
                    case 7:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizzas Quatro queijos voce ira querer :");
                        String tamanho7 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Quatro queijos que voce ira querer : ");
                        int quantidade7 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda7 = entrada.nextLine();
                        boolean borda7;
                        if (qBorda7 == "Sim") {
                            borda7 = true;
                        } else {
                            borda7 = false;
                        }
                        Pizzas QuatroQueijos = new Pizzas("Quatro Queijos", quantidade7, tamanho7, borda7, listaPizzas);
                        break;
                    case 8:
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza do Chef voce ira querer :");
                        String tamanho8 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizza do Chef que voce ira querer : ");
                        int quantidade8 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda8 = entrada.nextLine();
                        boolean borda8;
                        if (qBorda8 == "Sim") {
                            borda8 = true;
                        } else {
                            borda8 = false;
                        }
                        Pizzas PizzaDoChef = new Pizzas("Pizza do Chef", quantidade8, tamanho8, borda8, listaPizzas);
                        break;
                    case 9:
                        System.out.println("Digite o nome da pizza que voce ira criar : ");
                        String nome = entrada.nextLine();
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza que voce ira montar :");
                        String tamanho9 = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas que voce mesmo montou para levar : ");
                        int quantidade9 = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        String qBorda9 = entrada.nextLine();
                        boolean borda9;
                        if (qBorda9 == "Sim") {
                            borda9 = true;
                        } else {
                            borda9 = false;
                        }
                        Pizzas Montada = new Pizzas(nome, quantidade9, tamanho9, borda9, listaPizzas);
                        break;
                }
    }
}


