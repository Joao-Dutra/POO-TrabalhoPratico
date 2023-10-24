package pizzaria;

public class Clientes {

    //atributos
    private String nome;
    private String telefone;
    private String endereço;

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

    public String getEndereço() {
        return this.endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    //construtores
    public Clientes(String nome, String telefone, String endereço) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public Clientes() {
        this.nome = null;
        this.telefone = null;
        this.endereço = null;
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
