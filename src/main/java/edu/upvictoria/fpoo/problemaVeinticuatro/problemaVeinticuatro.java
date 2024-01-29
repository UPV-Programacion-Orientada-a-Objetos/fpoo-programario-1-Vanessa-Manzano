package edu.upvictoria.fpoo.problemaVeinticuatro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaVeinticuatro {

    public double AnuelAA(double sueldoSemanal) {
        double ahorroSemanal = sueldoSemanal * 0.15;
        double ahorroMensual = ahorroSemanal * 4;
        return ahorroMensual * 12;
    }
    public void problema24() throws IOException {
        double sueldoSemanal,ahorroSemanal,ahorroMensual,ahorroAnual;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el sueldo semanal:");
        entrada = bufer.readLine();
        sueldoSemanal = Double.parseDouble(entrada);

        ahorroSemanal = sueldoSemanal * 0.15;
        ahorroMensual = ahorroSemanal * 4;
        ahorroAnual = ahorroMensual * 12;

        System.out.println("El ahorro anual es:" + ahorroAnual);
    }
}
