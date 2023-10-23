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
        Ingredientes ManjericaoFresco = new Ingredientes("Manjericão Fresco", 2.00, false);
        listaIngredientes.add(ManjericaoFresco);
        Ingredientes Pepperoni = new Ingredientes("Pepperoni", 3.00, false);
        listaIngredientes.add(Pepperoni);
        Ingredientes Gorgonzola = new Ingredientes("Gorgonzola", 3.00, false);
        listaIngredientes.add(Gorgonzola);
        Ingredientes Parmesao = new Ingredientes("Parmesão", 3.00, false);
        listaIngredientes.add(Parmesao);
        Ingredientes Provolone = new Ingredientes("Provolone", 3.00, false);
        listaIngredientes.add(Provolone);
        Ingredientes CalabresaFatiada = new Ingredientes("Calabresa Fatiada", 2.00, false);
        listaIngredientes.add(CalabresaFatiada);
        Ingredientes Cebola = new Ingredientes("Cebola", 2.00, false);
        listaIngredientes.add(Cebola);
        Ingredientes Pimentoes = new Ingredientes("Pimentões", 2.00, false);
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
        
        
        Bebidas AguaMineral = new Bebidas("Água Mineral (500ml)", 3.50, "500ml");
        listaBebidas.add(AguaMineral);
        Bebidas Refrigerante = new Bebidas("Refrigerante (6000ml)", 4.50, "6000ml");
        listaBebidas.add(Refrigerante);
        Bebidas SucoNatural = new Bebidas("Suco Natural (600ml)", 4.00, "600ml");
        listaBebidas.add(SucoNatural);
        Bebidas VinhoTaca = new Bebidas("Vinho (Taça)", 9.00, "Taca");
        listaBebidas.add(VinhoTaca);
        //resolver isso ai abaixo
        Pizzas Teste = new Pizzas();
        Teste.addPizzas(listaPizzas,"Margarida",1,"Pequena",false);
        Teste.addIngredientesPizza(FrangoDesfiado, 0);
        Teste.addIngredientesPizza(Catupiry, 1);
                                          
        
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
                        + "     Manjericão fresco, Mussarela.\n"
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
                        + "     Cogumelos, Pimentões, Cebola, Azeitonas pretas, \n"
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
                        + "     Gorgonzola, Parmesão, Provolone, Mussarela.\n"
                        + "\n"
                        + "  8. Pizza do Chef:\n"
                        + "     P R$46 - M R$61 - G R$76: \n"
                        + "     Pepperoni, Cogumelos, Pimentões, Cebola roxa, \n"
                        + "     Azeitonas pretas, Mussarela.\n"
                        + "     \n"
                        + "     ---------------------------------------------------\n\n "
                        + "  Digite o numero correspondente de alguma pizza para solicitala!\n"
                        + "     ------------------------ OU -----------------------\n"
                        + "   Digite 9 para montar sua propria pizza com até 7 ingredientes!");
                comando = entrada.nextInt();
                break;
            case 2:
                break;
        }

    }
}
