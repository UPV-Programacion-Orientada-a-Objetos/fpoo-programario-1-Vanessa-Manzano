package edu.upvictoria.fpoo.problemaDos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaDos {



    public void problema2() throws IOException {
        double calificaciones = 0, promedio=4;

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;


        System.out.println("Ingresa las calificaciones de las 4 materias: ");
        entrada = bufer.readLine();
        calificaciones = Double.parseDouble(entrada);

        promedio = ((calificaciones*promedio)/promedio);

        System.out.println("El promedio es: " +promedio);

    }

}
