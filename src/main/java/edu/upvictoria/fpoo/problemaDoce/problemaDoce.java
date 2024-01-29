package edu.upvictoria.fpoo.problemaDoce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaDoce {

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public void problema12() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double base, altura, area;

        System.out.println("Ingresa la base del triangulo:  ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);

        System.out.println("Ingresa la altura del tirangulo:  ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);

        area = (base*altura)/2;

        System.out.println("El area del triangulo es:  "+area);

    }
}
