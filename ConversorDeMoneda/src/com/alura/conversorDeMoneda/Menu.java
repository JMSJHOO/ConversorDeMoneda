package com.alura.conversorDeMoneda;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {

    //Mapear para Ordenar la lista de monedas
    private final Map<Integer, Moneda> opciones = new LinkedHashMap<>();

    //Lista de las divisas
    public Menu() {
        opciones.put(1, new Moneda("ARS", "USD"));
        opciones.put(2, new Moneda("USD", "ARS"));
        opciones.put(3, new Moneda("BOB", "USD"));
        opciones.put(4, new Moneda("USD", "BOB"));
        opciones.put(5, new Moneda("BRL", "USD"));
        opciones.put(6, new Moneda("USD", "BRL"));
        opciones.put(7, new Moneda("CLP", "USD"));
        opciones.put(8, new Moneda("USD", "CLP"));
        opciones.put(9, new Moneda("COP", "USD"));
        opciones.put(10, new Moneda("USD", "COP"));
    }

    public void mostrarOpciones() {
        System.out.println("""
            ***  BIENVENIDO AL CONVERSOR DE MONEDA ***
              ---------------------------------------
                 Seleccione el tipo de cambio:""");

        for (Map.Entry<Integer, Moneda> entry : opciones.entrySet()) {
            System.out.printf("%d - %s%n", entry.getKey(), entry.getValue());
        }

        System.out.println("11 - Salir");
    }

    public Moneda getOpcion(int opcion) {
        return opciones.get(opcion);
    }
}
