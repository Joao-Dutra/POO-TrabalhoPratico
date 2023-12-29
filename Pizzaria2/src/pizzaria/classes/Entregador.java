package pizzaria.classes;

public class Entregador extends Funcionarios implements Terceirizacao {
    
    private int entregasPedidos;
    
    public Entregador(String cargo, double salario, String nome){
        super(cargo,salario,nome);
    }

    @Override
    public double calculoSalarioTercerizado() {
        int salarioFinal = (int) (super.getSalario() + (this.entregasPedidos * 3));
        return salarioFinal;
    }

    public int getEntregasPedidos() {
        return entregasPedidos;
    }

    public void setEntregasPedidos(int entregasPedidos) {
        this.entregasPedidos = entregasPedidos;
    }

    @Override
    public double calculoSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
