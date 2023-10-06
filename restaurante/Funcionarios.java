package restaurante;

public class Funcionarios {

    //atributos
    private Gerencia gerente;
    private Cozinha cozinheiro;
    private Salao garcom;

    // getters and setters
    public Gerencia getGerente() {
        return gerente;
    }

    public void setGerente(Gerencia gerente) {
        this.gerente = gerente;
    }

    public Cozinha getCozinheiro() {
        return cozinheiro;
    }

    public void setCozinheiro(Cozinha cozinheiro) {
        this.cozinheiro = cozinheiro;
    }

    public Salao getGarcom() {
        return garcom;
    }

    public void setGarcom(Salao garcom) {
        this.garcom = garcom;
    }

    //construtores
    public Funcionarios() {
        this.gerente = null;
        this.cozinheiro = null;
        this.garcom = null;
    }

    public Funcionarios(Gerencia gerente, Cozinha cozinheiro, Salao garcom) {
        this.gerente = gerente;
        this.cozinheiro = cozinheiro;
        this.garcom = garcom;
    }

    //metodos
    
}
