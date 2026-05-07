package Productos;

import Abstractas.Producto;

public class Insumo extends Producto{
    
    private String botones;
    private String agujas;
    private String hilos;
    private String unidadMedida;
    
    public Insumo(int id, String nombre, double precio, int stock, String botones, String agujas, String hilos, String unidadMedida){
        super(id, nombre, precio, stock);
        this.botones=botones;
        this.agujas=agujas;
        this.hilos=hilos;
        this.unidadMedida=unidadMedida; 
        
    }
    @Override
    public String generarDescripcion() {
    return "Insumos -> Botones: " + botones + ", Agujas: " + agujas + ", Hilos: " + hilos + ", Unidad: " + unidadMedida +  ", Stock: " + getstock();  
    }
}
