package MetodosDePago;

import Abstractas.Pago;

public class pagoTarjeta extends Pago{
    
    private String numeroTarjeta;
    private String tipo;
    
    public pagoTarjeta(double monto, String numeroTarjeta, String tipo){
    super(monto);
    this.numeroTarjeta=numeroTarjeta;
    this.tipo=tipo;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago de $" + monto + " con tarjeta " + tipo);
    }
    
}
