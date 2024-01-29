package edu.upvictoria.fpoo.problemaCinco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaCinco {


    public void problema5() throws IOException {
        double b, a, area;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("Ingresa la altura maxima de la figura: ");
        entrada = bufer.readLine();
        a = Double.parseDouble(entrada);

        System.out.println("Ingresa la base de la figura: ");
        entrada = bufer.readLine();
        b = Double.parseDouble(entrada);

        area = (b*a)+((b*a)/2);

        System.out.println("El area de la figura es: " + area);
    }
}
