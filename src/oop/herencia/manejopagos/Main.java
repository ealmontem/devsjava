package oop.herencia.manejopagos;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MetodoPago> metodoPagos = new ArrayList<>();
        //
        MetodoPago pagoConTarjeta = new PagoConTarjeta();
        MetodoPago pagoConTransferencia = new PagoConTransferencia();
        MetodoPago pagoEnEfectivo = new PagoEfectivo();
        //
        metodoPagos.add(pagoConTarjeta);
        metodoPagos.add(pagoEnEfectivo);
        metodoPagos.add(pagoConTransferencia);
        //
        imprimirResultado(metodoPagos);

    }

    public static void imprimirResultado(ArrayList<MetodoPago> mpa){
        for (MetodoPago mp:mpa){
            mp.realizarPago(100.0);
        }
    }

}
