package edu.upvictoria.fpoo.problemaNueve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problemaNueve {

    public double calcularSueldoSemanal(double horas_trabajadas, double sueldo_baseHoras, double dias_trabajados) {
        return horas_trabajadas * sueldo_baseHoras * dias_trabajados;
    }

    public void problema9() throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;

        double horas_trabajadas, sueldo_baseHOras, dias_trabajados, total;

        System.out.println("Ingresa las horas trabajadas al dia: ");
        entrada = bufer.readLine();
        horas_trabajadas = Double.parseDouble(entrada);

        System.out.println("Ingresa cuanto gana el trabajador por hora: ");
        entrada = bufer.readLine();
        sueldo_baseHOras = Double.parseDouble(entrada);

        System.out.println("Ingresa la cantidad de dias trabajados a la semana: ");
        entrada = bufer.readLine();
        dias_trabajados = Double.parseDouble(entrada);

        total = ((horas_trabajadas * sueldo_baseHOras) * dias_trabajados);

        System.out.println("El sueldo semanal del trabajador es: " + total);


    }
}
