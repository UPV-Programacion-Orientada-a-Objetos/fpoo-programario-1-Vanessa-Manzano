package edu.upvictoria.fpoo;

// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;


import edu.upvictoria.fpoo.problemaCatorce.problemaCatorce;
import edu.upvictoria.fpoo.problemaCinco.problemaCinco;
import edu.upvictoria.fpoo.problemaCuatro.problemaCuatro;
import edu.upvictoria.fpoo.problemaDiecinueve.problemaDiecinueve;
import edu.upvictoria.fpoo.problemaDieciocho.problemaDieciocho;
import edu.upvictoria.fpoo.problemaDieciseis.problemaDieciseis;
import edu.upvictoria.fpoo.problemaDiecisiete.problemaDiecisiete;
import edu.upvictoria.fpoo.problemaDiez.problemaDiez;
import edu.upvictoria.fpoo.problemaDoce.problemaDoce;
import edu.upvictoria.fpoo.problemaDos.problemaDos;
import edu.upvictoria.fpoo.problemaNueve.problemaNueve;
import edu.upvictoria.fpoo.problemaOcho.problemaOcho;
import edu.upvictoria.fpoo.problemaOnce.problemaOnce;
import edu.upvictoria.fpoo.problemaQuince.problemaQuince;
import edu.upvictoria.fpoo.problemaSeis.problemaSeis;
import edu.upvictoria.fpoo.problemaSiete.problemaSiete;
import edu.upvictoria.fpoo.problemaTrece.problemaTrece;
import edu.upvictoria.fpoo.problemaTres.problemaTres;
import edu.upvictoria.fpoo.problemaUno.problemaUno;
import edu.upvictoria.fpoo.problemaVeinte.problemaVeinte;
import edu.upvictoria.fpoo.problemaVeinticinco.problemaVeinticinco;
import edu.upvictoria.fpoo.problemaVeinticuatro.problemaVeinticuatro;
import edu.upvictoria.fpoo.problemaVeintidos.problemaVeintidos;
import edu.upvictoria.fpoo.problemaVeintitres.problemaVeintitres;
import edu.upvictoria.fpoo.problemaVeintiuno.problemaVeintiuno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("Menu:");
            System.out.println("1. Problema 1");
            System.out.println("2. Problema 2");
            System.out.println("3. Problema 3");
            System.out.println("4. Problema 4");
            System.out.println("5. Problema 5");
            System.out.println("6. Problema 6");
            System.out.println("7. Problema 7");
            System.out.println("8. Problema 8");
            System.out.println("9. Problema 9");
            System.out.println("10. Problema 10");
            System.out.println("11. Problema 11");
            System.out.println("12. Problema 12");
            System.out.println("13. Problema 13");
            System.out.println("14. Problema 14");
            System.out.println("15. Problema 15");
            System.out.println("16. Problema 16");
            System.out.println("17. Problema 17");
            System.out.println("18. Problema 18");
            System.out.println("19. Problema 19");
            System.out.println("20. Problema 20");
            System.out.println("21. Problema 21");
            System.out.println("22. Problema 22");
            System.out.println("23. Problema 23");
            System.out.println("24. Problema 24");
            System.out.println("25. Problema 25");
            System.out.println("0. Salir");


            try {
                System.out.print("Ingrese la opción: ");
                opcion = Integer.parseInt(reader.readLine());

                switch (opcion) {
                    case 1:
                        problemaUno problemaUno = new problemaUno();
                        problemaUno.problema1();
                        break;
                    case 2:
                        problemaDos problemaDos = new problemaDos();
                        problemaDos.problema2();
                        break;
                    case 3:
                        problemaTres problemaTres = new problemaTres();
                        problemaTres.problema3();
                        break;
                    case 4:
                        problemaCuatro problemaCuatro = new problemaCuatro();
                        problemaCuatro.problema4();
                        break;
                    case 5:
                        problemaCinco problemaCinco= new problemaCinco();
                        problemaCinco.problema5();
                        break;
                    case 6:
                        problemaSeis problemaSeis= new problemaSeis();
                        problemaSeis.problema6();
                        break;
                    case 7:
                        problemaSiete problemaSiete= new problemaSiete();
                        problemaSiete.problema7();
                        break;
                    case 8:
                        problemaOcho problemaOcho= new problemaOcho();
                        problemaOcho.problema8();
                        break;
                    case 9:
                        problemaNueve problemaNueve= new problemaNueve();
                        problemaNueve.problema9();
                        break;
                    case 10:
                        problemaDiez problemaDiez= new problemaDiez();
                        problemaDiez.problema10();
                        break;
                    case 11:
                        problemaOnce problemaOnce= new problemaOnce();
                        problemaOnce.problema11();
                        break;
                    case 12:
                        problemaDoce problemaDoce= new problemaDoce();
                        problemaDoce.problema12();
                        break;
                    case 13:
                        problemaTrece problemaTrece= new problemaTrece();
                        problemaTrece.problema13();
                        break;
                    case 14:
                        problemaCatorce problemaCatorce = new problemaCatorce();
                        problemaCatorce.problema14();
                        break;
                    case 15:
                        problemaQuince problemaQuince = new problemaQuince();
                        problemaQuince.problema15();
                        break;
                    case 16:
                        problemaDieciseis problemaDieciseis= new problemaDieciseis();
                        problemaDieciseis.problema16();
                        break;
                    case 17:
                        problemaDiecisiete problemaDiecisiete= new problemaDiecisiete();
                        problemaDiecisiete.problema17();
                        break;
                    case 18:
                        problemaDieciocho problemaDieciocho= new problemaDieciocho();
                        problemaDieciocho.practica18();
                        break;
                    case 19:
                        problemaDiecinueve problemaDiecinueve= new problemaDiecinueve();
                        problemaDiecinueve.practica19();
                        break;
                    case 20:
                        problemaVeinte problemaVeinte= new problemaVeinte();
                        problemaVeinte.problema20();
                        break;
                    case 21:
                        problemaVeintiuno problemaVeintiuno= new problemaVeintiuno();
                        problemaVeintiuno.problema21();
                        break;
                    case 22:
                        problemaVeintidos problemaVeintidos = new problemaVeintidos();
                        problemaVeintidos.problema22();
                        break;
                    case 23:
                        problemaVeintitres problemaVeintitres = new problemaVeintitres();
                        problemaVeintitres.problema23();
                        break;
                    case 24:
                        problemaVeinticuatro problemaVeinticuatro = new problemaVeinticuatro();
                        problemaVeinticuatro.problema24();
                        break;
                    case 25:
                        problemaVeinticinco problemaVeinticinco = new problemaVeinticinco();
                        problemaVeinticinco.problema25();
                        break;
                    case 0:
                        System.out.println("Hasta luegooo!!!!");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error, caracter no valido");
                opcion = -1;
            }
        } while (opcion != 0);

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}