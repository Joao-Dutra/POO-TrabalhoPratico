package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {
    //Scanner e Listas onde se encontra os objetos
    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();
    private static ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
    private static ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();
    private static ArrayList<Funcionarios> listaFuncionarios = new ArrayList<Funcionarios>();

    public static void main(String[] args) {
        //Vetor com nome dos ingredientes
        String[] ingredientesNomes = {
            "Molho de Tomate", "Mussarela", "Manjericao Fresco",
            "Pepperoni", "Gorgonzola", "Parmesao",
            "Provolone", "Calabresa Fatiada", "Cebola",
            "Pimentoes", "Azeitonas Pretas", "Frango Desfiado",
            "Catupiry", "Milho", "Carne-Seca Desfiada",
            "Cebola Roxa"
        };
        //Vetor com preco dos ingredientes
        double[] ingredientesPrecos = {
            2.50, 2.50, 2.00, 3.00, 3.00, 3.00, 3.00, 2.00,
            2.00, 2.00, 2.00, 3.00, 3.00, 2.00, 3.00, 2.00
        };
        //Inicializacao dos ingredientes
        for (int i = 0; i < ingredientesNomes.length; i++) {
            Ingredientes ingrediente = new Ingredientes(ingredientesNomes[i], ingredientesPrecos[i], listaIngredientes);
        }
        //Chamada da interface do usuario que se localiza na classe Gerente
        Gerente.exibirInterface();
        //Inicializacao de uma var que controla o switch
        int comando = 0;
        System.out.print("                                               ");
        comando = entrada.nextInt();
        //Switch de escolha entre pedir pizza e interface do gerente
        switch (comando) {
            //Caso 1 :  pedir pizza
            case 1:
                //Inicializao de uma var que controla o while
                boolean continuarPedidos = true;
                //While que controla o fim do pedido das pizzas
                while (continuarPedidos) {
                    //Chamada da interface do cardapio de pizzas que se localiza na classe Pizzas
                    Pizzas.exibirCardapioPizzas();
                    System.out.println("Digite o numero correspondente a pizza que voce ira pedir,Ou\n"
                                      +"Digite 9 para criar sua propria pizza com ate 7 ingredientes : ");
                    //Reaproveitamento da var comando para escolher a opcao das pizzas
                    comando = entrada.nextInt();
                    System.out.println("Digite o tamanho (1 - Pequena, 2 - Media ou 3 - Grande) : ");
                    //Inicializao de uma var tipo int que controla o tamanho da pizza
                    int qTamanho = entrada.nextInt();
                    //Logica para "converter" uma var do tipo int para as escolhas do tipo String em relacao ao tamanho
                    String tamanho = qTamanho == 1 ? "Pequena" : (qTamanho == 2 ? "Media" : "Grande");
                    System.out.println("Digite a quantidade de Pizzas :");
                    //Inicializao de uma var para escolher a quantidade de pizzas
                    int quantidade = entrada.nextInt();
                    System.out.println("Prefere que suas pizzas tenham borda? (S ou N) : ");
                    //Inicializacao de uma var tipo char q pergunta se as pizzas terao borda ou nao
                    char qBorda = entrada.next().charAt(0);
                    //Logica para "converter" uma var do tipo char para as escolhas do tipo Boolean em relacao a borda
                    boolean borda = (qBorda == 'S' || qBorda == 's');
                    //2° Switch para selecao das pizzas
                    switch (comando) {
                        case 1:
                            //construtor de Pizza pegando as informacoes acima e enviando para a construcao da tal
                            Pizzas Margherita = new Pizzas("Margherita", quantidade, tamanho, borda, listaPizzas);
                            //Chamada de metodo para adicao do valor total dos ingredientes ao valor base da pizza
                            Margherita.addValorPizzaPredefinida(7);
                            break;
                        case 2:
                            Pizzas Pepperoni = new Pizzas("Pepperoni", quantidade, tamanho, borda, listaPizzas);
                            Pepperoni.addValorPizzaPredefinida(8);
                            break;
                        case 3:
                            Pizzas Calabresa = new Pizzas("Calabresa", quantidade, tamanho, borda, listaPizzas);
                            Calabresa.addValorPizzaPredefinida(10);
                            break;
                        case 4:
                            Pizzas Vegetariana = new Pizzas("Vegetariana", quantidade, tamanho, borda, listaPizzas);
                            Vegetariana.addValorPizzaPredefinida(13);
                            break;
                        case 5:
                            Pizzas FrangoComCatupiry = new Pizzas("Frango com Catupiry", quantidade, tamanho, borda, listaPizzas);
                            FrangoComCatupiry.addValorPizzaPredefinida(13);
                            break;
                        case 6:
                            Pizzas Brasileira = new Pizzas("Brasileira", quantidade, tamanho, borda, listaPizzas);
                            Brasileira.addValorPizzaPredefinida(13);
                            break;
                        case 7:
                            Pizzas QuatroQueijos = new Pizzas("Quatro Queijos", quantidade, tamanho, borda, listaPizzas);
                            QuatroQueijos.addValorPizzaPredefinida(14);
                            break;
                        case 8:
                            Pizzas PizzaDoChef = new Pizzas("Pizza do Chef", quantidade, tamanho, borda, listaPizzas);
                            PizzaDoChef.addValorPizzaPredefinida(16);
                            break;
                        case 9:
                            System.out.print("Digite o nome da pizza que voce ira criar : ");
                            entrada.nextLine(); //Perguntar para a Suelen
                            //Inicializacao de uma var para perguntar nome da pizza que vai ser criada
                            String nome = entrada.nextLine();
                            Pizzas Montada = new Pizzas(nome, quantidade, tamanho, borda, listaPizzas);
                            System.out.println("Agora escolha ate 7 ingredientes para voce adicionar a sua Pizza : ");
                            //Chamada de um metodo statico para exibir a lista dos ingredientes que se localiza na classe Ingredientes
                            Ingredientes.getListaIngredientes(listaIngredientes);
                            //Inicializao de uma var para controlar a adicao de ingredientes na pizza sendo criada
                            int comandoIngrediente = 0;
                            System.out.println("Quando finalizar de adicionar os ingredientes digite (-1) : ");
                            while (comandoIngrediente != -1) {
                                comandoIngrediente = entrada.nextInt();
                                Montada.addIngredientesPizza(Ingredientes.getIngrediente(listaIngredientes, (comandoIngrediente - 1)));

                            }
                            break;
                    }
                    System.out.println("Deseja pedir mais pizzas? (S ou N): ");
                    //Inicializao de var para continuar a pedir mais pizzas
                    char continuar = entrada.next().charAt(0);
                    continuarPedidos = (continuar == 'S' || continuar == 's');
                    //Chamada de um metodo statico para exibir as pizzas pedidas/criadas localizada na classe Pizzas
                    Pizzas.getListaPizzas(listaPizzas);
                }
                break;

            /*System.out.println("Deseja pedir alguma bebida?");
                    char continuarbebidas = entrada.next().charAt(0);
                    if (continuarbebidas == 'S' || continuarbebidas == 's') {
                        Bebidas.getListaBebidas(listaBebidas);
                    }*/
            case 2:
                //Criacao de um gerente
                Gerente Joao = new Gerente(1234, "Gerente", 1200, "Joao");
                //Adicao de um funcionario e informado a lista onde ira adicionar 
                Joao.addFuncionario(listaFuncionarios);
                Gerente Kaiky = new Gerente(1234, "Gerente", 12000, "Kaiky");
                Kaiky.addFuncionario(listaFuncionarios);
                
                //Criacao de uma senha para os gerentes
                int senha = 1234;
                //Criacao de uma variavel para controle de tentativas da senha
                int continuarSenha = 1;     
                //Criacao de uma var para controle da interface do Gerente
                boolean senhaValida = false;
                //While para tentativa da senha
                while (continuarSenha == 1) {

                    System.out.println("Digite sua senha:");
                    int senhaDigitada = entrada.nextInt();

                    if (senhaDigitada == senha) {
                        senhaValida = true;
                        break;
                    } else {
                        System.out.println("Senha Invalida. Tente novamente.");
                    }
                }
                //While para controle da interface do Gerente
                while (true) {
                    System.out.println("Opcoes:\n"
                            + "1 - Adicionar Funcionario\n"
                            + "2 - Remover Funcionario\n"
                            + "3 - Lista de Funcionarios\n"
                            + "4 - Sair");
                    int comando1 = entrada.nextInt();

                    switch (comando1) {
                        //Adicionar Funcionario
                        case 1:
                            System.out.println("Qual o nome do funcionario(a)?");
                            String nome = entrada.next();
                            System.out.println("Qual o cargo do funcionario(a)?");
                            String cargo = entrada.next();
                            System.out.println("Qual o salario do funcionario(a)?");
                            double salario = entrada.nextDouble();

                            Funcionarios novoFuncionario = new Funcionarios(cargo, salario, nome);
                            listaFuncionarios.add(novoFuncionario);
                            System.out.println("Funcionario(a) adicionado com sucesso.\n");
                            break;
                        //Remover Funcionario
                        case 2:
                            System.out.println("Qual funcionario(a) sera removido?");
                            nome = entrada.next();
                            Kaiky.removerFuncionario(listaFuncionarios, nome);
                            System.out.println("Funcionario(a) removido com sucesso.\n");
                            break;
                        //Lista de Funcionarios
                        case 3:
                            System.out.println("Lista de Funcionarios:");
                            Funcionarios.getListaFuncionarios(listaIngredientes);
                            break;

                        case 4:
                            System.out.println("Programa encerrado");
                            break;

                        default:
                            System.out.println("Opcao invalida. Tente novamente.");
                    }

                    System.out.println("Deseja continuar:\n"
                            + "1 - Sim\n"
                            + "2 - Nao");
                    int continuar = entrada.nextInt();
                    if (continuar != 1) {
                        System.out.println("Programa encerrado.");
                        break;
                    }
                }

        }
    }
}
