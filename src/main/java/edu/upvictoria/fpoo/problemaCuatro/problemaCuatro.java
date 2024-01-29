package edu.upvictoria.fpoo.problemaCuatro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaCuatro {



    public void problema4() throws IOException {
        double pi=3.1416, radio=0, area=0;
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        System.out.println("Ingresa el radio: ");
        entrada = bufer.readLine();
        radio = Double.parseDouble(entrada);

        area= pi*(radio*radio);

        System.out.println("El area de la circunferenica es: " + area);
    }
}