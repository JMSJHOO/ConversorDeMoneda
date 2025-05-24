package com.alura.conversorDeMoneda;

public class Moneda {
    private final String origen;
    private final String destino;

    public Moneda(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }
    //Metodo
    @Override
    public String toString() {
        return origen + " → " + destino;
    }
}
