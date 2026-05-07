package Usuarios;
import Abstractas.Usuario;
import Productos.Pedido;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
    
    private List<Pedido> historialPedidos;
    
    public Cliente(int id, String nombre, String correo, String contrasena){
        super(id, nombre, correo, contrasena);
        this.historialPedidos=new ArrayList<>();
    }
    public List<Pedido>getHistorialPedidos(){
        return historialPedidos;
    }
    public void agregarPedidoAlHistorial(Pedido pedido){
        this.historialPedidos.add(pedido);
    }
}
