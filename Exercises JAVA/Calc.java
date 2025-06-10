package some_exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //CALCULATOR

        System.out.println("Bienvenid@ a \tTHE CALCULATOR\n");
        System.out.println("Elige la operacion a resolver");

        //Iniciamos Scanner para el menu
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciona una opcion del 1 al 6: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Porcentaje");
        System.out.println("6. Salir");

        //Declarar la variable para elegir las opciones
        int opcion = entrada.nextInt();


        switch (opcion){
            case 1:
                System.out.println("\nElegiste Suma + \n");
                Scanner suma = new Scanner(System.in);
                System.out.println("Ingresa el primer numero: ");
                double n1 = suma.nextDouble();
                System.out.println("Ingresa el segundo numero: ");
                double n2 = suma.nextDouble();
                double res = n1 + n1;
                System.out.println("El resultado de la suma es: " +  res );
                break;

            case 2:
                System.out.println("\nElegiste Resta - \n");
                Scanner resta = new Scanner(System.in);
                System.out.println("Ingresa el primer numero: ");
                double n1r = resta.nextDouble();
                System.out.println("Ingresa el segundo numero: ");
                double n2r = resta.nextDouble();
                double rer = n1r - n1r;
                System.out.println("El resultado de la resta es: " +  rer );
                break;

            case 3:
                System.out.println("\nElegiste Multiplicacion * \n");
                Scanner Multiplicacion = new Scanner(System.in);
                System.out.println("Ingresa el primer numero: ");
                double n1m = Multiplicacion.nextDouble();
                System.out.println("Ingresa el segundo numero: ");
                double n2m = Multiplicacion.nextDouble();
                double rem = n1m * n1m;
                System.out.println("El resultado de la Multiplicacion es: " +  rem );
                break;

            case 4:
                System.out.println("\nElegiste Division / \n");
                Scanner division = new Scanner(System.in);
                System.out.println("Ingresa el primer numero: ");
                double n1d = division.nextDouble();
                System.out.println("Ingresa el segundo numero: ");
                double n2d = division.nextDouble();
                double red = n1d / n1d;
                System.out.println("El resultado de la division es: " +  red );
                break;


            case 5:
                System.out.println("\nElegiste Porcentaje % \n");
                Scanner porcentaje = new Scanner(System.in);
                System.out.println("Ingresa el primer numero: ");
                double n1p = porcentaje.nextDouble();
                System.out.println("Ingresa el segundo numero: ");
                double n2p = porcentaje.nextDouble();
                double rep = (n1p / n2p) * 100;
                System.out.println("El resultado de la suma es: " +  rep + "%");
                break;
        }

            entrada.close();


    }
}
