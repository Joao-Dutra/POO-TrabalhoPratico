package pizzaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizzaria {
// 3 coisas, valor pizza predefinida, valor da pizza montada erro, adicionando ingrediente com indice invalido

    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Pizzas> listaPizzas = new ArrayList<Pizzas>();
    private static ArrayList<Bebidas> listaBebidas = new ArrayList<Bebidas>();
    private static ArrayList<Ingredientes> listaIngredientes = new ArrayList<Ingredientes>();
    private static ArrayList<Funcionarios> listarFuncionarios = new ArrayList<Funcionarios>();

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

        Gerente.exibirInterface();
        int comando = 0;
        comando = entrada.nextInt();
        switch (comando) {
            case 1:
                boolean continuarPedidos = true;
                while (continuarPedidos) {
                    Pizzas.exibirCardapioPizzas();
                    System.out.print("Digite o numero correspondente a pizza que voce ira pedir,ou "
                            + "Digite 9 para criar sua propria pizza com ate 7 ingredientes : ");
                    comando = entrada.nextInt();
                    System.out.print("Digite o tamanho (1 - Pequena, 2 - Media ou 3 - Grande) : ");
                    int qTamanho = entrada.nextInt();
                    String tamanho = qTamanho == 1 ? "Pequena" : (qTamanho == 2 ? "Media" : "Grande");
                    System.out.print("Digite a quantidade de Pizzas :");
                    int quantidade = entrada.nextInt();
                    System.out.print("Prefere que suas pizzas tenham borda? (S ou N) : ");
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
                            System.out.print("Digite o nome da pizza que voce ira criar : ");
                            entrada.nextLine(); //Perguntar para a Suelen
                            String nome = entrada.nextLine();
                            Pizzas Montada = new Pizzas(nome, quantidade, tamanho, borda, listaPizzas);
                            System.out.println("Agora escolha ate 7 ingredientes para voce adicionar a sua Pizza : ");
                            Ingredientes.getListaIngredientes(listaIngredientes);
                            int comandoIngrediente = 0;
                            int controlePosIngrediente = 0;
                            System.out.println("Quando finalizar de adicionar os ingredientes digite (-1) : ");
                            while (comandoIngrediente != -1) {
                                controlePosIngrediente += 1;
                                comandoIngrediente = entrada.nextInt();
                                Montada.addIngredientesPizza(Ingredientes.getIngrediente(listaIngredientes, (comandoIngrediente - 1)), controlePosIngrediente - 1);

                            }
                            break;
                    }
                    System.out.println("Deseja pedir mais pizzas? (S ou N): ");
                    char continuar = entrada.next().charAt(0);
                    continuarPedidos = (continuar == 'S' || continuar == 's');
                }
                Pizzas.getListaPizzas(listaPizzas);
                break;
            case 2:

                Gerente Joao = new Gerente(1234, "Gerente", 1200, "Joao");
                Joao.addFuncionario(listarFuncionarios);
                System.out.println("Digite sua senha:");
                int senha = entrada.nextInt();

                if (senha == 1234) {
                    System.out.println(listarFuncionarios);
                    System.out.println("Opcoes:\n"
                            + "1 - Adicione Funcionarios\n"
                            + "2 - Remova Funcionarios\n"
                            + "3 - Sair");
                    int comando1 = entrada.nextInt();

                    switch (comando1) {
                        case 1:

                            System.out.println("Qual o nome do funcionario(a)?");
                            String nome = entrada.next();
                            System.out.println("Qual o cargo do funcionario(a)?");
                            String cargo = entrada.next();
                            System.out.println("Qual o salario do funcionario(a)?");
                            double salario = entrada.nextDouble();

                            Funcionarios novoFuncionario = new Funcionarios(cargo, salario, nome);
                            listarFuncionarios.add(novoFuncionario);
                            System.out.println("Funcionario adicionado com sucesso.");

                            System.out.println("Lista de Funcionarios no Final do Programa:");
                            System.out.println(listarFuncionarios);
                        case 2:

                            System.out.println("Quem funcionario(a) sera removido?");
                            String nomeRemover = entrada.next();
                            Joao.removerFuncionario(listarFuncionarios, senha);

                            System.out.println("Lista de Funcionarios no Final do Programa:");
                            System.out.println(listarFuncionarios);

                        case 3:
                            System.out.println("Programa encerrado");

                    }
                } else {
                    System.out.println("Senha Invalida");
                }

                break;
        }

    }

}
