package edu.upvictoria.fpoo.problemaDiez;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaDiez {

    public double convertirMetrosAPulgadas(double metros) {
        return metros / 0.0254;
    }

    public void problema10() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double metros, pulgadas;

        System.out.println("Ingresa los metros de tela: ");
        entrada = bufer.readLine();
        metros = Double.parseDouble(entrada);

        pulgadas = metros/0.0254;

        System.out.println("Las pulgadas a pedir de la tela son: " + pulgadas);

    }
}
