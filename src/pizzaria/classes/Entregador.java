package pizzaria.classes;

public class Entregador extends Funcionarios implements FuncionariosTercerizado {

    private int entregasPedidos;

    public Entregador(String cargo, double salario, String nome) {
        super(cargo, salario, nome);
    }

    public int getEntregasPedidos() {
        return entregasPedidos;
    }

    public void setEntregasPedidos(int entregasPedidos) {
        this.entregasPedidos = entregasPedidos;
    }

    @Override
    public double calculoSalario() {
        int salarioFinal = (int) (super.getSalario() + (this.entregasPedidos * 3));
        return salarioFinal;
    }

    @Override
    public double calculoSalarioTercerizado() {
        // salario * taxa tercerizacao
       return 1;
    }

}
