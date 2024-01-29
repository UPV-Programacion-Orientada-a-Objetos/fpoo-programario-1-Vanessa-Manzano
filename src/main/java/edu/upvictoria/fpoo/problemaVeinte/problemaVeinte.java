package edu.upvictoria.fpoo.problemaVeinte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class problemaVeinte {

    public double CostoLLamada(double a, double b) {
        return a*b;
    }

    public void problema20() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tiem_llamada, costo_minuto, total;

        System.out.println("Ingresa la duracion de la llamada en minutos: ");
        entrada = bufer.readLine();
        tiem_llamada = Double.parseDouble(entrada);

        System.out.println("Ingresa el costo por minuto: ");
        entrada = bufer.readLine();
        costo_minuto = Double.parseDouble(entrada);

        total = costo_minuto*tiem_llamada;

        System.out.println("El costo de la llamada asciende a: " + total);

    }
}