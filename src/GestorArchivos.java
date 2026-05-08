package com.tienda.controller;
import Abstractas.Producto;
/*io:
  este contiene todas las clases necesarias para leer y escribir datos.
  me ayuda a que java se le facilite la distribucion de archivos al disco duro
*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorArchivos {
    //.dat significa que son datos binarios
    private final String PATH ="datos_tienda.dat";
    
    public void guardarProductos(List<Producto>productos){
        /*
        ObjectOutputStream se utiliza para la serialización,
        convirtiendo objetos Java complejos en una secuencia de bytes, esto hace
        que se permita guardar el estado de un objeto en un archivo
        */
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH))){
            oos.writeObject(productos);
            
        }catch(IOException e){
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
    /* @SuppressWarnings("unchecked"):
    Esta es una anotación que le habla directamente al compilador de NetBeans/Java
    se usa para decirle a java que no se preocupe por lo que hay en un archivo
    esto hace que se eviten advertencias amarillas
    ObjectInputStream:
    es una clase utilizada para la deserialización, es decir para leer objetos y datos
    primitivos previamente escritos por un ObjectOutputStream.
    Reconstruye objetos completos a partir de un flujo de entrada
    (archivo, red), convirtiendo bytes en objetos Java utilizables.
    PATH:
    es una interfaz moderna, introducida en Java 7, que representa la
    ubicación de un archivoo directorio en el sistema de archivos de forma
    independiente a la plataforma
    */
    @SuppressWarnings("unchecked")
    public List<Producto> cargarProductos(){
        File file = new File(PATH);
        if(!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream (PATH))){
            return (List<Producto>) ois.readObject();
        }catch(Exception e){
            return new ArrayList();
        }
    }
}
