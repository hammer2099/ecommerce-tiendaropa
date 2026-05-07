package com.tienda.model;

public class pagoTransferencia extends Pago{
    
    private String numeroReferencia;
    
    public pagoTransferencia(double monto, String numeroReferencia){
        super(monto);
        this.numeroReferencia=numeroReferencia;
    }

    @Override
    public void procesarPago() {
    System.out.println("Validando transferencia con referencia: " + numeroReferencia);    }
}
