package pizzaria.classes;

public class ChefeDeCozinha extends Cozinheiro {

    private String acessoCardapios;

    public ChefeDeCozinha(String cargo, double salario, String nome, String acessoCardapios) {
        super(cargo, salario, nome);
        this.acessoCardapios = acessoCardapios;
    }

    public String getAcessoCardapios() {
        return acessoCardapios;
    }

    public void setAcessoCardapios(String acessoCardapios) {
        this.acessoCardapios = acessoCardapios;
    }

    @Override
    public double calculoSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        // salario * % pizzas vendidas
    }
    
}
