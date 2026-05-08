package Usuarios;
import Abstractas.Usuario;

public class Administrador extends Usuario{
    
    public Administrador(int id, String nombre, String correo, String contrasena){
        super(id, nombre, correo, contrasena);
    }
    public void gestionarProducto(){
        System.out.println("Accediendo al panel de gestión de productos..");
    }
}
