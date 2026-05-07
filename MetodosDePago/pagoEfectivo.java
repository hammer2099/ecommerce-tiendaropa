package MetodosDePago;



import Abstractas.Pago;

public class pagoEfectivo extends Pago{
    
    private double montoRecibido;
    
    public pagoEfectivo(double monto, double montoRecibido){
        super(monto);
        this.montoRecibido=montoRecibido;
    }

    @Override
    public void procesarPago() {
        double cambio=montoRecibido-monto;
        System.out.println("Pago en efectivo. Cambio a devolver: $" + cambio);
    }
    
}
