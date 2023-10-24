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
       
        Ingredientes MolhoDeTomate = new Ingredientes("Molho de Tomate", 2.50,listaIngredientes);
        Ingredientes Mussarela = new Ingredientes("Mussarela", 2.50,listaIngredientes);
        Ingredientes ManjericaoFresco = new Ingredientes("Manjericao Fresco", 2.00,listaIngredientes);
        Ingredientes Pepperoni = new Ingredientes("Pepperoni", 3.00,listaIngredientes);
        Ingredientes Gorgonzola = new Ingredientes("Gorgonzola", 3.00,listaIngredientes);
        Ingredientes Parmesao = new Ingredientes("Parmesao", 3.00,listaIngredientes);
        Ingredientes Provolone = new Ingredientes("Provolone", 3.00,listaIngredientes);
        Ingredientes CalabresaFatiada = new Ingredientes("Calabresa Fatiada", 2.00,listaIngredientes);
        Ingredientes Cebola = new Ingredientes("Cebola", 2.00,listaIngredientes);
        Ingredientes Pimentoes = new Ingredientes("Pimentoes", 2.00,listaIngredientes);
        Ingredientes AzeitonasPretas = new Ingredientes("Azeitonas Pretas", 2.00,listaIngredientes);
        Ingredientes FrangoDesfiado = new Ingredientes("Frango Desfiado", 3.00,listaIngredientes);
        Ingredientes Catupiry = new Ingredientes("Catupiry", 3.00,listaIngredientes);
        Ingredientes Milho = new Ingredientes("Milho", 2.00,listaIngredientes);
        Ingredientes CarneSecaDesfiada = new Ingredientes("Carne-Seca Desfiada", 3.00,listaIngredientes);
        Ingredientes CebolaRoxa = new Ingredientes("Cebola Roxa", 2.00,listaIngredientes);
        
        
        Bebidas AguaMineral = new Bebidas("Agua Mineral ", 3.50, "Pequena",listaBebidas);
        Bebidas Refrigerante = new Bebidas("Refrigerante ", 4.50, "Pequena",listaBebidas);
        Bebidas SucoNatural = new Bebidas("Suco Natural ", 4.00, "Pequena",listaBebidas);
        Bebidas VinhoTaca = new Bebidas("Vinho ", 9.00, "Media",listaBebidas);
                      
        
        System.out.println("|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n" +
                           "|\\\\\\\\                                                                                      \\\\\\\\|\n" +
                           "|\\\\\\\\                                Excellence Pizzaria                                   \\\\\\\\|\n" +
                           "|\\\\\\\\                                                                                      \\\\\\\\|\n" +
                           "|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n" +
                           "|                                                                                              |\n" +
                           "|                                                                                              |\n" +
                           "|    1 - Se deseja pedir uma pizza.                                                            |\n" +
                           "|                                                                                              |\n" +
                           "|    2 - Se deseja acessar o painel de administrador.                                          |\n" +     
                           "|                                                                                              |\n" +                
                           "|                                                                                              |\n" +
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
                        + "  Digite 9 para montar sua propria pizza com ate 7 ingredientes!");
                comando = entrada.nextInt();
                switch(comando){
                    case 1:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        break;
                    case 2:
                       String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;
                    case 3:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;
                    case 4:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;                                                                                              
                    case 5:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;                        
                    case 6:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;                        
                    case 7:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;                        
                    case 8:
                        String tamanho,qBorda;
                        int quantidade;
                        boolean borda;
                        System.out.println("Digite o tamanho (Pequena,Media ou Grande) da Pizza Margherita voce ira querer :");
                        tamanho = entrada.nextLine();
                        System.out.println("Digite a quantidade de Pizzas Margheritas que voce ira querer : ");
                        quantidade = entrada.nextInt();
                        System.out.println("Voce prefere que suas pizzas tenham borda? (Sim || Nao) ");
                        qBorda = entrada.nextLine();
                        if (qBorda == "Sim") {
                            borda = true;
                        }else{
                            borda = false;
                        }
                        Pizzas Margherita = new Pizzas("Margherita",quantidade,"Pequena",borda,listaPizzas);
                        
                        break;                        
                    case 9:
                        break;                        
                       
                                                                                                                                                
                }
                break;
            case 2:
                break;
        }

    }
}
