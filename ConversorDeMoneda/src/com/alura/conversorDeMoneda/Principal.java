package com.alura.conversorDeMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Conversor conversor = new Conversor();

        while (true) {
            menu.mostrarOpciones();
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 11) {
                System.out.println("¡Gracias por usar el conversor de moneda!");
                break;
            }

            Moneda seleccion = menu.getOpcion(opcion);
            if (seleccion == null) {
                System.out.println("La opción ingresada no válida.");
                continue;
            }

            System.out.printf("Ingrese la cantidad en %s: ", seleccion.getOrigen());
            double cantidad = scanner.nextDouble();

            System.out.printf("Has seleccionado convertir %s a %s.%n", seleccion.getOrigen(), seleccion.getDestino());
            try {

                double tasa = conversor.obtenerTasaCambio(seleccion.getOrigen(), seleccion.getDestino());
                double resultado = conversor.convertir(cantidad, tasa);
                System.out.printf("Resultado: %.2f %s = %.2f %s%n%n",
                        cantidad, seleccion.getOrigen(), resultado, seleccion.getDestino());
            } catch (Exception e) {
                System.out.println("Error en la conversión: " + e.getMessage());
            }
        }
        scanner.close();
    }
}
