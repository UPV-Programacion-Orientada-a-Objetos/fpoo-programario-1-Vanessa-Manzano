package edu.upvictoria.fpoo.problemaVeinticinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaVeinticinco {




    public void problema25() throws IOException {
        double hotel, comida, otrosGastos, total;
        int dias;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el numero de dias que estaras en monterrey:");
        entrada = bufer.readLine();
        dias = Integer.parseInt(entrada);

        System.out.println("Ingresa el costo diario del hotel:");
        entrada = bufer.readLine();
        hotel = Double.parseDouble(entrada);

        System.out.println("Ingresa el costo diario de la comida:");
        entrada = bufer.readLine();
        comida = Double.parseDouble(entrada);

        otrosGastos = 100.00;
        total = (hotel + comida + otrosGastos) * dias;

        System.out.println("Monto total del cheque: $" + total);
        System.out.println("Hotel: $" + (hotel * dias));
        System.out.println("Comida: $" + (comida * dias));
        System.out.println("Otros gastos: $" + (otrosGastos * dias));
        System.out.println("Total: $" + total);
    }
}