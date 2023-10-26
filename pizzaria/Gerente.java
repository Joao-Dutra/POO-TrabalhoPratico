package pizzaria;

import java.util.ArrayList;

public class Gerente extends Funcionarios {

    private int senha;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(int senha, String cargo, double salario, String nome) {
        super(cargo, salario, nome);
        this.senha = senha;

    }

    public Gerente() {
        super();
        this.senha = 0;

    }

    public void addFuncionario(ArrayList<Funcionarios> listaFuncionarios) {
        Funcionarios novoFuncionario = new Funcionarios(this.getCargo(), this.getSalario(), this.getNome());
        listaFuncionarios.add(novoFuncionario);
    }

    public void removerFuncionario(ArrayList<Funcionarios> listaFuncionarios, int index) {
        listaFuncionarios.remove(index);
    }

    public void listarFuncionarios(ArrayList<Funcionarios> listaFuncionarios) {
        System.out.println("Lista de Funcionarios do Gerente: ");
        for (int index = 0; index < listaFuncionarios.size(); index++) {
            System.out.println(listaFuncionarios.get(index));

        }

    }

    public String toString() {
        String saida = ("Nome: " + this.getNome() + "\n" + "Cargo: " + this.getCargo() + "\n" + "Salario: R$" + this.getSalario());
        return saida;
    }

    //staticos
    public static void exibirInterface() {
        System.out.println("|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n"
                + "|\\\\\\\\                                                                                      \\\\\\\\|\n"
                + "|\\\\\\\\                                Excellence Pizzaria                                   \\\\\\\\|\n"
                + "|\\\\\\\\                                                                                      \\\\\\\\|\n"
                + "|\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\|\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|    1 - Se deseja pedir uma pizza.                                                            |\n"
                + "|                                                                                              |\n"
                + "|    2 - Se deseja acessar o painel de administrador.                                          |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |\n"
                + "|                                                                                              |");
    }
}
