package pizzaria;

import java.util.ArrayList;

public class Funcionarios {

    //atributos
    private String cargo;
    private double salario;
    private String nome;

    //getters and setters
    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //construtores
    public Funcionarios(String cargo, double salario, String nome) {
        this.cargo = cargo;
        this.salario = salario;
        this.nome = nome;
    }

    public Funcionarios() {
        this.cargo = null;
        this.salario = 0;
        this.nome = null;
    }

    //metodos  
    public void addFuncionario(ArrayList<Funcionarios> listaFuncionarios) {
        Funcionarios novoFuncionario = new Funcionarios(this.getCargo(), this.getSalario(), this.getNome());
        listaFuncionarios.add(novoFuncionario);
    }

    public String toString() {
        String saida = ("\n===========================\n"
                + "Nome..: " + this.getNome() + "\n" + 
                "Cargo..: " + this.getCargo() + "\n" +
                "Salario: R$" + this.getSalario()+
                "\n===========================");
        return saida;
    }
    //staticos

    public static void getListaFuncionarios(ArrayList<Funcionarios> listaFuncionarios) {
        for (int index = 0; index < listaFuncionarios.size(); index++) {
            System.out.println(listaFuncionarios.get(index));
        }
    }
}
