package restaurante;

public class Salao {

    //atributos
    private String cargo;
    private double salario;
    private String nome;

    //getters and setters
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //construtores
    public Salao() {
        this.cargo = null;
        this.salario = 0.0;
        this.nome = null;
    }

    public Salao(String cargo, double salario, String nome) {
        this.cargo = cargo;
        this.salario = salario;
        this.nome = nome;
    }

    //metodos
    
}
