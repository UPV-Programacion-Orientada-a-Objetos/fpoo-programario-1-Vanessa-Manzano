package edu.upvictoria.fpoo.problemaDiecisiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaDiecisiete {

    public double calcularHipotenusa(double a, double b) {
        return Math.sqrt((a * a) + (b * b));
    }

    public void problema17() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double a,b, Hipotenusa;

        System.out.println("Ingresa el tamaño del cateto A");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Ingresa el tamaño del cateto B");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);
        Hipotenusa = Math.sqrt((a*a)+(b*b));

        System.out.println("El tamaño de la hipotenusa es: "+ Hipotenusa);
    }
}
