
package pizzaria;
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

}