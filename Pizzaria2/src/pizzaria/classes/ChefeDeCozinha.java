package pizzaria.classes;

public class ChefeDeCozinha extends Cozinheiro {
    
    private boolean criarCardapios;
   
    public ChefeDeCozinha(String cargo, double salario, String nome){
          super(cargo,salario,nome);
          this.criarCardapios = true;
    }

    public boolean isCriarCardapios() {
        return criarCardapios;
    }

    public void setCriarCardapios(boolean criarCardapios) {
        this.criarCardapios = criarCardapios;
    }
    
}
