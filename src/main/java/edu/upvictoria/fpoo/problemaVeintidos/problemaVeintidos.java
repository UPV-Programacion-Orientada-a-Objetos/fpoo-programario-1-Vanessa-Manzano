package edu.upvictoria.fpoo.problemaVeintidos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class problemaVeintidos {


    public void problema22() throws IOException {

        double pago, consumoKW, costoKW;
        String entrada;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa el consumo de energia en KW:");
        entrada = bufer.readLine();
        consumoKW=Double.parseDouble(entrada);

        System.out.println("Ingresa el costo de energia por KW: ");
        entrada = bufer.readLine();
        costoKW=Double.parseDouble(entrada);

        pago = consumoKW * costoKW;

        System.out.println("El pago por el consumo es: " + pago);

    }

}

