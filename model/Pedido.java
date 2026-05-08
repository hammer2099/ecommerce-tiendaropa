package com.tienda.model;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String estado;
    private Cliente cliente;
    private List<Producto> articulosComprados;
    
    //aplico poliformismo para los metodos de pago
    private Pago metodoPago;
    
    public Pedido(Cliente cliente, Pago metodoPago){
        this.cliente=cliente;
        this.metodoPago=metodoPago;
        this.articulosComprados=new ArrayList<>();
        this.estado="Pendiente";
    }
    //añade productos a la lista
    public void agregarProducto(Producto p){
        this.articulosComprados.add(p);
    }
    //recorre la lista de productos para calcular el total de la compra de los articulos comprados
    public double calcularTotal(){
        double total=0;
        for(Producto p: articulosComprados){
            total+=p.getprecio();
        }
        return total;
    }
    public String getEstado(){return estado;}
    public Cliente getCliente(){return cliente;}
    public List<Producto> getarticulosComprados(){return articulosComprados;}
    public Pago getMetodoPago(){return metodoPago;}
    public void setEstado(String estado){this.estado=estado;}
    public void setCliente(Cliente cliente){this.cliente=cliente;}
    public void setArticulosComprados(List<Producto>articulosComprados){this.articulosComprados=articulosComprados;}
    public void setMetodoPago(Pago MetodoPago){this.metodoPago=metodoPago;}
}
