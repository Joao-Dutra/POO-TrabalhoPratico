package pizzaria.classes;

public class Cozinheiro extends Funcionarios {
       
    public Cozinheiro(String cargo, double salario, String nome){
        super(cargo,salario,nome);       
    }

    @Override
    public double calculoSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        // salario * % pizzas vendidas
    }

}
