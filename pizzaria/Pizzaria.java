package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();
    static ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
    static ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();
    public static void main(String[] args) {
       
        
        System.out.println("|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n" +
                           "|\\\\\\\\                                                                                      \\\\\\\\|\n" +
                           "|\\\\\\\\                                Excellence Pizzaria                                   \\\\\\\\|\n" +
                           "|\\\\\\\\                                                                                      \\\\\\\\|\n" +
                           "|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|    1 - Se deseja pegar uma mesa.                                                             |\n" +
                           "|                                                                                              |\n" +
                           "|    2 - Se deseja pedir uma pizza via delivery.                                               |\n" +     
                           "|                                                                                              |\n" +                
                           "|    3 - Se deseja acessar o painel de administrador.                                          |\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |");
        int comando = 0;
        comando = entrada.nextInt();

        switch (comando) {
            case 1:
                Pedidos x = new Pedidos();
                System.out.println("Você recebeu um cardapio de um carismatico garçom : ");
                
                break;
            case 2:
                break;
    }
        
    }
}
