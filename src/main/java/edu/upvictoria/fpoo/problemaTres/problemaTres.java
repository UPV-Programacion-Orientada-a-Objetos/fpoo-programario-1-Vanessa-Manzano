package edu.upvictoria.fpoo.problemaTres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaTres {



    public void problema3() throws IOException {

        double base =0, altura =0, area=0;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        System.out.println("Ingresa la base: ");
        entrada = bufer.readLine();
        base = Double.parseDouble(entrada);

        System.out.println("Ingresa la altura : ");
        entrada = bufer.readLine();
        altura = Double.parseDouble(entrada);


        area = (base*altura);

        System.out.println("El area del rectangulo es: "+ area);
    }

}
