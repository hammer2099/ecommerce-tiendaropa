package Productos;

import Abstractas.Producto;

public class Tela extends Producto{
    
    private String tipoMaterial;
    private String color;
    
    public Tela(int id, String nombre, double precio, int stock, String tipoMaterial, String color){
        super(id,nombre,precio,stock);
        this.tipoMaterial=tipoMaterial;
        this.color=color;
    }

    @Override
    public String generarDescripcion() {
    return "Tela de " + tipoMaterial + " color " + color + ". Stock: " + getstock() + "m";
    }
}
