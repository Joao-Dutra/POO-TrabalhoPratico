package restaurante;

public class Cozinha {

    //atributos
    private String hierarquia;
    private double salario;
    private String nome;

    //getters and setters
    public String getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(String hierarquia) {
        this.hierarquia = hierarquia;
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
    public Cozinha() {
        this.hierarquia = null;
        this.salario = 0.0;
        this.nome = null;
    }

    public Cozinha(String hierarquia, double salario, String nome) {
        this.hierarquia = hierarquia;
        this.salario = salario;
        this.nome = nome;
    }
    
    //metodos 
    
}
