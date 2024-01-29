package edu.upvictoria.fpoo.problemaUno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaUno {
    public double suma(double n1, double n2) {
        return n1 + n2;
    }

    public void problema1() throws IOException {
        double total,a,b;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el primer valor: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Ingresa el segundo valor: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        total = a+b;

        System.out.println("La suma es igual a: " + total);
    }

}