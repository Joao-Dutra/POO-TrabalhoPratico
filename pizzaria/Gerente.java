
package pizzaria;

import java.util.ArrayList;

public class Gerente extends Funcionarios {
    
  private int senha;
  private ArrayList<Funcionarios> funcionarios;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(int senha, ArrayList<Funcionarios> funcionarios, String cargo, double salario, String nome) {
        super(cargo, salario, nome);
        this.senha = senha;
        this.funcionarios = funcionarios;
        
    }

    public Gerente() {
        super();
        this.senha = 0;
        this.funcionarios = new ArrayList<>();
        
    }
    
    
      public void addFuncionario(String cargo, double salario, String nome) {
        Funcionarios novoFuncionario = new Funcionarios(cargo, salario, nome);
        funcionarios.add(novoFuncionario);
    }
    
    public void removerFuncionario(Funcionarios funcionario) {
        funcionarios.remove(funcionario);
    }
    
    
}
