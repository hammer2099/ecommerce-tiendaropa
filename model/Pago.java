package com.tienda.model;

public abstract class Pago {
    
    protected double monto;
    
    public Pago(double monto){
        this.monto=monto;
    }
    public abstract void procesarPago();
}
