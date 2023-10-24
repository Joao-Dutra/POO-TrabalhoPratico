package pizzaria;

public class Clientes {

    //atributos
    private String nome;
    private String telefone;
    private String endere�o;

    //getters and setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndere�o() {
        return this.endere�o;
    }

    public void setEndere�o(String endere�o) {
        this.endere�o = endere�o;
    }

    //construtores
    public Clientes(String nome, String telefone, String endere�o) {
        this.nome = nome;
        this.telefone = telefone;
        this.endere�o = endere�o;
    }

    public Clientes() {
        this.nome = null;
        this.telefone = null;
        this.endere�o = null;
    }
    //metodos    

    //staticos
    public static void exibirInterface() {
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
    }

}
