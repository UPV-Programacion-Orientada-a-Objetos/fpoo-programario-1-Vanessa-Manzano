package edu.upvictoria.fpoo.problemaOnce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaOnce {




    public void problema11() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double largo, ancho, profundidad, litros_cubicos, metros_cubicos, total;

        System.out.println("Ingresa el largo de la alberca:  ");
        entrada = bufer.readLine();
        largo = Double.parseDouble(entrada);

        System.out.println("Ingresa el ancho de la alberca:  ");
        entrada = bufer.readLine();
        ancho = Double.parseDouble(entrada);

        System.out.println("Ingresa la profundidad de la alberca:  ");
        entrada = bufer.readLine();
        profundidad = Double.parseDouble(entrada);

        metros_cubicos= (largo*ancho*profundidad);
        litros_cubicos= (largo*ancho*profundidad) * 1000;

        System.out.println("Metros cubicos de agua:  " + metros_cubicos);
        System.out.println("Litros cubicos de agua:  " + litros_cubicos);

        total=(metros_cubicos*100);

        System.out.println("Cantidad a pagar:  " + total);

    }
}