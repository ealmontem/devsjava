package oop.herencia.registropagosconstructores;

public class PagoConTransferencia extends MetodoPago{
    public PagoConTransferencia(String cliente){
        super(cliente);
    }

    @Override
    public void realizarPago(double monto) {
        super.validaPago(monto);
    }
}
