package swing.controlador;

import java.util.ArrayList;
import swing.modelo.Cliente;

public class ListaCliente {
    
    ArrayList<Cliente> listaCli = new ArrayList();
    
    public ArrayList<Cliente> getListaClientes() {
        return listaCli;
    }
    
    public void setListaClientes(ArrayList<Cliente> ListaClientes) {
        this.listaCli = ListaClientes;
    }
    
    public void inserirCliente(Cliente c) {
        listaCli.add(c);
    }
    
    public void removerCliente(int index) {
        
        listaCli.remove(index);
        
    }
    
    public void insereClientePos(int index, Cliente c) {
        listaCli.add(index, c);
    }
    
}
