package Abstractas;
/*io:
  este contiene todas las clases necesarias para leer y escribir datos.
  me ayuda a que java se le facilite la distribucion de archivos al disco duro
*/
import java.io.Serializable;
 /*Serializable:
sirve para marcar una clase indicando que sus objetos pueden convertirse en una secuencia
de bytes (serialización) y reconstruirse posteriormente a partir de ellos (deserialización)
. Es fundamental para persistir el estado de un objeto, enviarlo por red,
o guardarlo en memoria caché/disco.
*/   
public abstract class Usuario implements Serializable{
    
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    
    public Usuario(int id, String nombre, String correo, String contrasena){
        
        this.id=id;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
    }
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public String getCorreo(){return correo;}
    public String getContrasena(){return contrasena;}
    
    public void setId(int id){this.id=id;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setCorreo(String correo){this.correo=correo;}
    public void setContrasena(String contrasena){this.contrasena=contrasena;}
}
