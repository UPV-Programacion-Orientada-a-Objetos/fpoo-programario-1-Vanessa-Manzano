package edu.upvictoria.fpoo.problemaOcho;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaOcho {



    public void problema8() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double distancia_x, distancia_y, distancia_p;

        System.out.println("Ingresa la distancia entre el punto x1 y x2");
        entrada = bufer.readLine();
        distancia_x = Double.parseDouble(entrada);

        System.out.println("Ingresa la distancia entre el punto y1 y y2");
        entrada = bufer.readLine();
        distancia_y = Double.parseDouble(entrada);
        distancia_p = Math.sqrt((distancia_x*distancia_x)+(distancia_y*distancia_y));

        System.out.println("La distancia entre p1 y p2 es: "+ distancia_p);
    }
}
