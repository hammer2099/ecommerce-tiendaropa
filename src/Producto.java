package Abstractas;
 /*Serializable:
sirve para marcar una clase indicando que sus objetos pueden convertirse en una secuencia
de bytes (serialización) y reconstruirse posteriormente a partir de ellos (deserialización)
. Es fundamental para persistir el estado de un objeto, enviarlo por red,
o guardarlo en memoria caché/disco.
*/  
import java.io.Serializable;

public abstract class Producto implements Serializable{
    
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(int id, String nombre, double precio, int stock){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    //GETTERS
    public int getId(){return id;}
    public String getnombre(){return nombre;}
    public double getprecio(){return precio;}
    public int getstock(){return stock;}
    //SETTERS
    public void setId(int id){
        this.id=id;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setprecio(double precio){
        this.precio=precio;
    }
    public void setstock(int stock){
        this.stock=stock;
    }
    //Aca aplicaremos poliformismo con este metodo de aca
    public abstract String generarDescripcion();
}
