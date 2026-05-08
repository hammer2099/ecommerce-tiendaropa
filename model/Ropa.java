package com.tienda.model;

public class Ropa extends Producto{
    
    private String talla;
    private String tipoCorte;
    
    public Ropa(int id, String nombre, double precio, int stock, String talla, String tipoCorte){
        super(id, nombre, precio, stock);
        this.talla=talla;
        this.tipoCorte=tipoCorte;
    }

    @Override
    public String generarDescripcion() {
        return "Ropa de" + talla + " Tipo de corte " + tipoCorte + ". Stock: " + getstock() + "m";
    }
}
