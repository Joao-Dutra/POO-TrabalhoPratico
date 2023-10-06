package restaurante;

public class Pedidos {

    //atributos
    int mesa;
    String prato;
    int quantidade;

    //getters and setters
    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //construtores
    public Pedidos() {
        this.mesa = 0;
        this.prato = null;
        this.quantidade = 0;
    }

    public Pedidos(int mesa, String prato, int quantidade) {
        this.mesa = mesa;
        this.prato = prato;
        this.quantidade = quantidade;
    }

    //metodos
    
    public Pedidos criarPedido(){
        Pedidos obj = new Pedidos();
        return obj;
    }
    
}
