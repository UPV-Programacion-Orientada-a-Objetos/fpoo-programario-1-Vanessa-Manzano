package edu.upvictoria.fpoo;

// import edu.upvictoria.fpoo.EstructurasSecuenciales.EjercicioUno;
// import edu.upvictoria.fpoo.*;

import edu.upvictoria.fpoo.ProblemaCatorce.ProblemaCATORCE;
import edu.upvictoria.fpoo.ProblemaCinco.ProblemaCINCO;
import edu.upvictoria.fpoo.ProblemaCuatro.ProblemaCUATRO;
import edu.upvictoria.fpoo.ProblemaDieciNueve.ProblemaDIECINUEVE;
import edu.upvictoria.fpoo.ProblemaDieciOcho.ProblemaDIECIOCHO;
import edu.upvictoria.fpoo.ProblemaDieciSeis.ProblemaDIECISEIS;
import edu.upvictoria.fpoo.ProblemaDieciSiete.ProblemaDIECISIETE;
import edu.upvictoria.fpoo.ProblemaDiez.ProblemaDIEZ;
import edu.upvictoria.fpoo.ProblemaDoce.ProblemaDOCE;
import edu.upvictoria.fpoo.ProblemaDos.ProblemaDOS;
import edu.upvictoria.fpoo.ProblemaNueve.ProblemaNUEVE;
import edu.upvictoria.fpoo.ProblemaOcho.ProblemaOCHO;
import edu.upvictoria.fpoo.ProblemaOnce.ProblemaONCE;
import edu.upvictoria.fpoo.ProblemaQuince.ProblemaQUINCE;
import edu.upvictoria.fpoo.ProblemaSeis.ProblemaSEIS;
import edu.upvictoria.fpoo.ProblemaSiete.ProblemaSIETE;
import edu.upvictoria.fpoo.ProblemaTrece.ProblemaTRECE;
import edu.upvictoria.fpoo.ProblemaTres.ProblemaTRES;
import edu.upvictoria.fpoo.ProblemaUno.ProblemaUNO;
import edu.upvictoria.fpoo.ProblemaVeinte.ProblemaVEINTE;
import edu.upvictoria.fpoo.ProblemaVeintiCinco.ProblemaVEINTICINCO;
import edu.upvictoria.fpoo.ProblemaVeintiCuatro.ProblemaVEINTICUATRO;
import edu.upvictoria.fpoo.ProblemaVeintiDos.ProblemaVEINTIDOS;
import edu.upvictoria.fpoo.ProblemaVeintiTres.ProblemaVEINTITRES;
import edu.upvictoria.fpoo.ProblemaVeintiUno.ProblemaVEINTIUNO;

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
                        ProblemaUNO problemaUno = new ProblemaUNO();
                        problemaUno.problema1();
                        break;
                    case 2:
                        ProblemaDOS problemaDos = new ProblemaDOS();
                        problemaDos.problema2();
                        break;
                    case 3:
                        ProblemaTRES problemaTres = new ProblemaTRES();
                        problemaTres.problema3();
                        break;
                    case 4:
                        ProblemaCUATRO problemaCuatro = new ProblemaCUATRO();
                        problemaCuatro.problema4();
                        break;
                    case 5:
                        ProblemaCINCO problemaCinco= new ProblemaCINCO();
                        problemaCinco.problema5();
                        break;
                    case 6:
                        ProblemaSEIS problemaSeis= new ProblemaSEIS();
                        problemaSeis.problema6();
                        break;
                    case 7:
                        ProblemaSIETE problemaSiete= new ProblemaSIETE();
                        problemaSiete.problema7();
                        break;
                    case 8:
                        ProblemaOCHO problemaOcho= new ProblemaOCHO();
                        problemaOcho.problema8();
                        break;
                    case 9:
                        ProblemaNUEVE problemaNueve= new ProblemaNUEVE();
                        problemaNueve.problema9();
                        break;
                    case 10:
                        ProblemaDIEZ problemaDiez= new ProblemaDIEZ();
                        problemaDiez.problema10();
                        break;
                    case 11:
                        ProblemaONCE problemaOnce= new ProblemaONCE();
                        problemaOnce.problema11();
                        break;
                    case 12:
                        ProblemaDOCE problemaDoce= new ProblemaDOCE();
                        problemaDoce.problema12();
                        break;
                    case 13:
                        ProblemaTRECE problemaTrece= new ProblemaTRECE();
                        problemaTrece.problema13();
                        break;
                    case 14:
                        ProblemaCATORCE problemaCatorce = new ProblemaCATORCE();
                        problemaCatorce.problema14();
                        break;
                    case 15:
                        ProblemaQUINCE problemaQuince = new ProblemaQUINCE();
                        problemaQuince.problema15();
                        break;
                    case 16:
                        ProblemaDIECISEIS problemaDieciseis= new ProblemaDIECISEIS();
                        problemaDieciseis.problema16();
                        break;
                    case 17:
                        ProblemaDIECISIETE problemaDiecisiete= new ProblemaDIECISIETE();
                        problemaDiecisiete.problema17();
                        break;
                    case 18:
                        ProblemaDIECIOCHO problemaDieciocho= new ProblemaDIECIOCHO();
                        problemaDieciocho.practica18();
                        break;
                    case 19:
                        ProblemaDIECINUEVE problemaDiecinueve= new ProblemaDIECINUEVE();
                        problemaDiecinueve.practica19();
                        break;
                    case 20:
                        ProblemaVEINTE problemaVeinte= new ProblemaVEINTE();
                        problemaVeinte.problema20();
                        break;
                    case 21:
                        ProblemaVEINTIUNO problemaVeintiuno= new ProblemaVEINTIUNO();
                        problemaVeintiuno.problema21();
                        break;
                    case 22:
                        ProblemaVEINTIDOS problemaVeintidos = new ProblemaVEINTIDOS();
                        problemaVeintidos.problema22();
                        break;
                    case 23:
                        ProblemaVEINTITRES problemaVeintitres = new ProblemaVEINTITRES();
                        problemaVeintitres.problema23();
                        break;
                    case 24:
                        ProblemaVEINTICUATRO problemaVeinticuatro = new ProblemaVEINTICUATRO();
                        problemaVeinticuatro.problema24();
                        break;
                    case 25:
                        ProblemaVEINTICINCO problemaVeinticinco = new ProblemaVEINTICINCO();
                        problemaVeinticinco.problema25();
                        break;
                    case 0:
                        System.out.println("bye");
                        break;
                    default:
                        System.out.println("OPCION NO PERMITIDA");
                }
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error al leer la entrada ----INTENTA OTRA VEZ");
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