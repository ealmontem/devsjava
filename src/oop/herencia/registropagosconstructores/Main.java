package oop.herencia.registropagosconstructores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MetodoPago> pagos = new ArrayList<>();
        pagos.add(new PagoConTarjeta("Elvis"));
        pagos.add(new PagoConTransferencia("Kath"));
        pagos.add(new PagoEnEfectivo("Belinda"));
        //
        imprimirResultado(pagos);
    }

    public static void imprimirResultado(ArrayList<MetodoPago> pagos){
        for (MetodoPago mp:pagos){
            mp.realizarPago(200);
        }
    }

}
