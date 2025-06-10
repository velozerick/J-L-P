package some_exercises;

import java.util.Scanner;

public class Student_ev {
    public static void main(String[] args) {

        Scanner evaluacion = new Scanner(System.in);

        System.out.println("\nPROMEDIO ESCOLAR\n");
        System.out.println("List@ para saber tu promedio?\n");

        System.out.println("Porfavor ingresa la primer calificacion:  ");
        double pc = evaluacion.nextDouble();

        System.out.println("Porfavor ingresa la segunda calificacion:  ");
        double sc = evaluacion.nextDouble();

        System.out.println("Porfavor ingresa la tercer calificacion:  ");
        double tc = evaluacion.nextDouble();

        double prom = (pc + sc + tc) / 3;


        if (prom <= 7.9) {
            System.out.println("Tu promedio es regular  " + prom);
        } else if (prom < 9.5 ) {
            System.out.println("Tu promedio es Bueno  " + prom);
        }else {
            System.out.println("Excelente lo lograste!  " + prom);
        }
        
        evaluacion.close();


    }
}
