package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();
    static ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
    static ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();
    static ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

    public static void main(String[] args) {

        Ingredientes MolhoDeTomate = new Ingredientes("Molho de Tomate", 2.50, listaIngredientes);
        Ingredientes Mussarela = new Ingredientes("Mussarela", 2.50, listaIngredientes);
        Ingredientes ManjericaoFresco = new Ingredientes("Manjericao Fresco", 2.00, listaIngredientes);
        Ingredientes Peperoni = new Ingredientes("Pepperoni", 3.00, listaIngredientes);
        Ingredientes Gorgonzola = new Ingredientes("Gorgonzola", 3.00, listaIngredientes);
        Ingredientes Parmesao = new Ingredientes("Parmesao", 3.00, listaIngredientes);
        Ingredientes Provolone = new Ingredientes("Provolone", 3.00, listaIngredientes);
        Ingredientes CalabresaFatiada = new Ingredientes("Calabresa Fatiada", 2.00, listaIngredientes);
        Ingredientes Cebola = new Ingredientes("Cebola", 2.00, listaIngredientes);
        Ingredientes Pimentoes = new Ingredientes("Pimentoes", 2.00, listaIngredientes);
        Ingredientes AzeitonasPretas = new Ingredientes("Azeitonas Pretas", 2.00, listaIngredientes);
        Ingredientes FrangoDesfiado = new Ingredientes("Frango Desfiado", 3.00, listaIngredientes);
        Ingredientes Catupiry = new Ingredientes("Catupiry", 3.00, listaIngredientes);
        Ingredientes Milho = new Ingredientes("Milho", 2.00, listaIngredientes);
        Ingredientes CarneSecaDesfiada = new Ingredientes("Carne-Seca Desfiada", 3.00, listaIngredientes);
        Ingredientes CebolaRoxa = new Ingredientes("Cebola Roxa", 2.00, listaIngredientes);

        Bebidas AguaMineral = new Bebidas("Agua Mineral ", 3.50, "Pequena", listaBebidas);
        Bebidas Refrigerante = new Bebidas("Refrigerante ", 4.50, "Pequena", listaBebidas);
        Bebidas SucoNatural = new Bebidas("Suco Natural ", 4.00, "Pequena", listaBebidas);
        Bebidas VinhoTaca = new Bebidas("Vinho ", 9.00, "Media", listaBebidas);

        Clientes.exibirInterface();
        int comando = 0;
        comando = entrada.nextInt();
        //botar um while para repetir ação até confirmar pedido!
        switch (comando) {
            case 1:
                Pizzas.exibirCardapioPizzas();
                comando = entrada.nextInt();
                Pedidos.pizzasPredefinidas(comando);
                break;
            case 2:
                break;
        }

    }
}
