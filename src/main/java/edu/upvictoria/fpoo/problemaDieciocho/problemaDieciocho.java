package edu.upvictoria.fpoo.problemaDieciocho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class problemaDieciocho {



    public void practica18() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double total, km, costo_km;

        System.out.println("Ingresa los km a recorrer: ");
        entrada = bufer.readLine();
        km = Double.parseDouble(entrada);

        System.out.println("Ingresa el costo por km: ");
        entrada = bufer.readLine();
        costo_km = Double.parseDouble(entrada);

        total = km*costo_km;

        System.out.println("El costo del boleto de un viaje sencillo es: "+ total);
    }
}
