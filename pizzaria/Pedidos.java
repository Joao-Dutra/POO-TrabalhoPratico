package pizzaria;

public class Pedidos {

    //atributos
    private Pizzas tipoPizza;
    private Bebidas tipoBebida;
    private boolean delivery;
    private int numMesa;
    private Clientes infoCliente;

    //getters and setters
    public Pizzas getTipoPizza() {
        return this.tipoPizza;
    }

    public void setTipoPizza(Pizzas tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public Bebidas getTipoBebida() {
        return this.tipoBebida;
    }

    public void setTipoBebida(Bebidas tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public boolean isDelivery() {
        return this.delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public int getNumMesa() {
        return this.numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public Clientes getInfoCliente() {
        return this.infoCliente;
    }

    public void setInfoCliente(Clientes infoCliente) {
        this.infoCliente = infoCliente;
    }

    //construtores
    public Pedidos(Pizzas tipoPizza, Bebidas tipoBebida, boolean delivery, int numMesa, Clientes infoCliente) {
        this.tipoPizza = tipoPizza;
        this.tipoBebida = tipoBebida;
        this.delivery = delivery;
        this.numMesa = numMesa;
        this.infoCliente = infoCliente;
    }

    public Pedidos() {
        this.tipoPizza = null;
        this.tipoBebida = null;
        this.delivery = false;
        this.numMesa = 0;
        this.infoCliente = null;
    }
    //metodos    

}
