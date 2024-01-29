package edu.upvictoria.fpoo.problemaQuince;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaQuince {



    public void problema15() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double tarifa = 15, horas, cobro;


        System.out.println("Ingresa la cantidad de horas en las que se uso el estacionamiento:");
        entrada = bufer.readLine();
        horas = Double.parseDouble(entrada);

        cobro = (int) Math.ceil(horas) * tarifa;

        System.out.println("La cantidad a pagar por utilizar el estacionamiento durante " + horas + " horas es: $" + cobro);
    }
}