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
       
        Ingredientes MolhoDeTomate = new Ingredientes("Molho de Tomate", 2.50, false);
        listaIngredientes.add(MolhoDeTomate);
        Ingredientes Mussarela = new Ingredientes("Mussarela", 2.50, false);
        listaIngredientes.add(Mussarela);
        Ingredientes ManjericaoFresco = new Ingredientes("Manjeric�o Fresco", 2.00, false);
        listaIngredientes.add(ManjericaoFresco);
        Ingredientes Pepperoni = new Ingredientes("Pepperoni", 3.00, false);
        listaIngredientes.add(Pepperoni);
        Ingredientes Gorgonzola = new Ingredientes("Gorgonzola", 3.00, false);
        listaIngredientes.add(Gorgonzola);
        Ingredientes Parmesao = new Ingredientes("Parmes�o", 3.00, false);
        listaIngredientes.add(Parmesao);
        Ingredientes Provolone = new Ingredientes("Provolone", 3.00, false);
        listaIngredientes.add(Provolone);
        Ingredientes CalabresaFatiada = new Ingredientes("Calabresa Fatiada", 2.00, false);
        listaIngredientes.add(CalabresaFatiada);
        Ingredientes Cebola = new Ingredientes("Cebola", 2.00, false);
        listaIngredientes.add(Cebola);
        Ingredientes Pimentoes = new Ingredientes("Piment�es", 2.00, false);
        listaIngredientes.add(Pimentoes);
        Ingredientes AzeitonasPretas = new Ingredientes("Azeitonas Pretas", 2.00, false);
        listaIngredientes.add(AzeitonasPretas);
        Ingredientes FrangoDesfiado = new Ingredientes("Frango Desfiado", 3.00, false);
        listaIngredientes.add(FrangoDesfiado);
        Ingredientes Catupiry = new Ingredientes("Catupiry", 3.00, false);
        listaIngredientes.add(Catupiry);
        Ingredientes Milho = new Ingredientes("Milho", 2.00, false);
        listaIngredientes.add(Milho);
        Ingredientes CarneSecaDesfiada = new Ingredientes("Carne-Seca Desfiada", 3.00, false);
        listaIngredientes.add(CarneSecaDesfiada);
        Ingredientes CebolaRoxa = new Ingredientes("Cebola Roxa", 2.00, false);
        listaIngredientes.add(CebolaRoxa);
        
        
        Bebidas AguaMineral = new Bebidas("�gua Mineral (500ml)", 3.50, "500ml");
        listaBebidas.add(AguaMineral);
        Bebidas Refrigerante = new Bebidas("Refrigerante (6000ml)", 4.50, "6000ml");
        listaBebidas.add(Refrigerante);
        Bebidas SucoNatural = new Bebidas("Suco Natural (600ml)", 4.00, "600ml");
        listaBebidas.add(SucoNatural);
        Bebidas VinhoTaca = new Bebidas("Vinho (Ta�a)", 9.00, "Taca");
        listaBebidas.add(VinhoTaca);
        
        Pizzas Teste = new Pizzas();
        Teste.addPizzas(listaPizzas,"Margarida",1,"Pequena",false);
        Teste.addIngredientesPizza(FrangoDesfiado, 0);
        Teste.addIngredientesPizza(Catupiry, 1);
                                   
        System.out.println(Pizzas.getListaPizzas(listaPizzas));
        System.out.println(Teste.getInginseridos());
        
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
                x.addBebidasPedido(VinhoTaca);
                x.addBebidasPedido(AguaMineral);
                x.addPizzasPedido(Teste);
                
                break;
            case 2:
                break;
        }
        
    }
}
