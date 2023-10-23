package pizzaria;

import java.util.ArrayList;

public class Pedidos {

    //atributos
    private ArrayList<Bebidas> listaBebidasPedido = new ArrayList<Bebidas>();
    private ArrayList<Pizzas> listaPizzasPedido = new ArrayList<Pizzas>();
    private double gorjeta;

    //construtor
    public Pedidos() {
        this.gorjeta = 0;
    }
////    
    //metodos
    public void addPizzasPedido(Pizzas pizzasadicionada) {
        listaPizzasPedido.add(pizzasadicionada);
    }

    public void addBebidasPedido(Bebidas bebidasadicionada) {
        listaBebidasPedido.add(bebidasadicionada);
    }

    // FAZER INDEX POSIÇÃO E CUIDADO COM O INDEX + 1
    public void removerPizzasPedido(int index) {
        index -= 1;

        if (index >= 0 && index < listaPizzasPedido.size()) {
            listaPizzasPedido.remove(index);
        } else {
            System.out.println("A pizza especificada ja foi removida ou posicao indicada invalida!");
        }
    }

    public void removerBebidaPedido(int index) {
        index -= 1;

        if (index >= 0 && index < listaBebidasPedido.size()) {
            listaBebidasPedido.remove(index);
        } else {
            System.out.println("A bebida especificada ja foi removida ou posicao indicada invalida!");
        }
    }

    public void exibirPedido(){
        for (int index = 0; index < listaPizzasPedido.size(); index++) {
            System.out.println(listaPizzasPedido.get(index));
        }
        for (int index = 0; index < listaBebidasPedido.size(); index++) {
            System.out.println(listaBebidasPedido.get(index));
        }
    }
    
    public void exibirPedidoEspecificoPizza(int index) {
        if (index >= 0 && index < listaPizzasPedido.size()) {
            System.out.println(listaPizzasPedido.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }
    
    public void exibirPedidoEspecificoBebidas(int index) {
        if (index >= 0 && index < listaBebidasPedido.size()) {
            System.out.println(listaBebidasPedido.get(index));
        } else {
            System.out.println("O indice especificado e invalido!");
        }
    }
    
    public String toString(int index) {
        String saida;
        saida = listaPizzasPedido.get(index).getNome() + "................................" + listaPizzasPedido.get(index).getValor() + "\n" + listaBebidasPedido.get(index).getNome() + "................................" + listaBebidasPedido.get(index).getValor() + "\n";
        return saida;
    }

    public void darGorjeta(double gorjeta){
        this.gorjeta += gorjeta;
    }
    
    public double getGorjeta() {
        return gorjeta;
    }

    public void setGorjeta(double gorjeta) {
        this.gorjeta = gorjeta;
    }

}
