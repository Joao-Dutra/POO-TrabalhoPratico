package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();
    private static ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
    private static ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();
    private static ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

    public static void main(String[] args) {

        String[] ingredientesNomes = {
            "Molho de Tomate", "Mussarela", "Manjericao Fresco",
            "Pepperoni", "Gorgonzola", "Parmesao",
            "Provolone", "Calabresa Fatiada", "Cebola",
            "Pimentoes", "Azeitonas Pretas", "Frango Desfiado",
            "Catupiry", "Milho", "Carne-Seca Desfiada",
            "Cebola Roxa"
        };

        double[] ingredientesPrecos = {
            2.50, 2.50, 2.00, 3.00, 3.00, 3.00, 3.00, 2.00,
            2.00, 2.00, 2.00, 3.00, 3.00, 2.00, 3.00, 2.00
        };

        for (int i = 0; i < ingredientesNomes.length; i++) {
            Ingredientes ingrediente = new Ingredientes(ingredientesNomes[i], ingredientesPrecos[i], listaIngredientes);
        }

        Ingredientes.getListaIngredientes(listaIngredientes);
        Clientes.exibirInterface();
        int comando = 0;
        comando = entrada.nextInt();
        switch (comando) {
            case 1:
                Pedidos x = new Pedidos();
                boolean continuarPedidos = true;
                while (continuarPedidos) {
                Pizzas.exibirCardapioPizzas();
                System.out.println("Digite o numero correspondente a pizza que voce ira pedir,ou "
                                 + "Digite 9 para criar sua propria pizza com ate 7 ingredientes :");
                comando = entrada.nextInt();
                System.out.print("Digite o tamanho (1 - Pequena, 2 - M�dia ou 3 - Grande) : ");
                int qTamanho = entrada.nextInt();
                String tamanho = qTamanho == 1 ? "Pequena" : (qTamanho == 2 ? "M�dia" : "Grande");
                System.out.print("Digite a quantidade de Pizzas :");              
                int quantidade = entrada.nextInt();
                System.out.print("Prefere que suas pizzas tenham borda? (S ou N): ");
                char qBorda = entrada.next().charAt(0);
                boolean borda = (qBorda == 'S' || qBorda == 's');

                switch (comando) {
                    case 1:
                        Pizzas Margherita = new Pizzas("Margherita", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 2:
                        Pizzas Pepperoni = new Pizzas("Pepperoni", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 3:
                        Pizzas Calabresa = new Pizzas("Calabresa", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 4:
                        Pizzas Vegetariana = new Pizzas("Vegetariana", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 5:
                        Pizzas FrangoComCatupiry = new Pizzas("Frango com Catupiry", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 6:
                        Pizzas Brasileira = new Pizzas("Brasileira", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 7:
                        Pizzas QuatroQueijos = new Pizzas("Quatro Queijos", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 8:
                        Pizzas PizzaDoChef = new Pizzas("Pizza do Chef", quantidade, tamanho, borda, listaPizzas);
                        break;
                    case 9:
                        System.out.print("Digite o nome da pizza que voc� ir� criar: ");
                        entrada.nextLine(); //Perguntar para a Suelen
                        String nome = entrada.nextLine();
                        Pizzas Montada = new Pizzas(nome, quantidade, tamanho, borda, listaPizzas);
                        break;
                }
                 System.out.println("Deseja pedir mais pizzas? (S ou N): ");
                 char continuar = entrada.next().charAt(0);
                 continuarPedidos = (continuar == 'S' || continuar == 's');
        }
                 
                break;
            case 2:
                break;
        }

    }
}
