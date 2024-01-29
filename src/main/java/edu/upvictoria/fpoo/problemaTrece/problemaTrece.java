package edu.upvictoria.fpoo.problemaTrece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaTrece {

    public double calcularConversionDolares(double monedaMexicana, double dolar) {
        return monedaMexicana / dolar;
    }

    public void problema13() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double moneda_mexicana, dolar, conversion;

        System.out.println("Ingresa la cantidad de pesos mexicanos: ");
        entrada = bufer.readLine();
        moneda_mexicana = Double.parseDouble(entrada);

        System.out.println("Ingresa el valor del dolar en pesos mexicanos: ");
        entrada = bufer.readLine();
        dolar = Double.parseDouble(entrada);

        conversion = (moneda_mexicana/dolar);

        System.out.println("Dolares adquiridos:  " +conversion);

    }
}
