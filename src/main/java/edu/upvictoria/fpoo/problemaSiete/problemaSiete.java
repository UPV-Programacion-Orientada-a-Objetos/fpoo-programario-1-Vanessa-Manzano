package edu.upvictoria.fpoo.problemaSiete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaSiete {



    public void problema7() throws IOException {

        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double litros, precio_litro, galones, total;

        System.out.println("Ingresa el total de litros producidos al dia: ");
        entrada = bufer.readLine();
        litros = Double.parseDouble(entrada);

        System.out.println("-----------------------------------------------------------");

        galones = (litros/3.785);

        System.out.println( litros + " litros de leche equivalen a " + galones + " galones de leche");
        System.out.println("-----------------------------------------------------------");

        System.out.println("Ingresa el precio del galon:  ");
        entrada = bufer.readLine();
        precio_litro= Double.parseDouble(entrada);

        total = (precio_litro*galones);

        System.out.println("La venta de los " + litros+ " litros de leche ha generado una ganancia de: " + total + "en moneda nacional");

    }
}
