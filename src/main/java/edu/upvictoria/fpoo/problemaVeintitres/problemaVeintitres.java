package edu.upvictoria.fpoo.problemaVeintitres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class problemaVeintitres {

    public double calcularTotal(double precio) {
        double descuento = precio * 0.20;
        double iva = precio * 0.15;
        return (precio - descuento) + iva;
    }
    public void problema23() throws IOException {

        double precio, descuento, iva, total;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el precio del articulo: ");
        entrada = bufer.readLine();
        precio = Double.parseDouble(entrada);


        descuento = precio * 0.20;
        iva = precio * 0.15;

        total = (precio - descuento) + iva;

        System.out.println("El total es: " + total);


    }
}
