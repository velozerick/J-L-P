package ch_1.Arrays;

import java.util.Scanner;

public class Arrays_Exercises {
    public static void main(String[] args) {

        //Declarar array
        double[] tempratura = new double[7];

        //Crear Scanner
        Scanner temps = new Scanner(System.in);

        System.out.println("Amigo meteorologo ingresa las tempreaturas por dia:  ");

        //Asignar tempreaturas a cada posicion
        tempratura[0] = temps.nextDouble();
        tempratura[1] = temps.nextDouble();
        tempratura[2] = temps.nextDouble();
        tempratura[3] = temps.nextDouble();
        tempratura[4] = temps.nextDouble();
        tempratura[5] = temps.nextDouble();
        tempratura[6] = temps.nextDouble();

        System.out.println("De acuerdo apra verificar las tempreaturas se mostraran por dia \n");
        System.out.println("La tempreatura del primer dia es: " + tempratura[0] );
        System.out.println("La tempreatura del segundo dia es: " + tempratura[1]);
        System.out.println("La tempreatura del tercer dia es: " + tempratura[2]);
        System.out.println("La tempreatura del cuarto dia es: " + tempratura[3]);
        System.out.println("La tempreatura del quinto dia es: " + tempratura[4]);
        System.out.println("La tempreatura del sexto dia es: " + tempratura[5]);
        System.out.println("La tempreatura del septimo dia es: " + tempratura[6]);
        temps.close();


        var prom  = (tempratura[0] + tempratura[1] + tempratura[2] + 
                     tempratura[3] + tempratura[4] +  tempratura[5] + 
                     tempratura[6]) / 7;

        System.out.println("\nLa tempreatura promedio es :  " + prom);


        double max = tempratura[0];
        double min = tempratura[0];

        //comparar una por una
        if (tempratura[1] > max) max = tempratura[1];
        if (tempratura[2] > max) max = tempratura[2];
        if (tempratura[3] > max) max = tempratura[3];
        if (tempratura[4] > max) max = tempratura[4];
        if (tempratura[5] > max) max = tempratura[5];
        if (tempratura[6] > max) max = tempratura[6];
        System.out.println("la tempreatura maxima es : " + max);


        if (tempratura[1] < min) min = tempratura[1];
        if (tempratura[2] < min) min = tempratura[2];
        if (tempratura[3] < min) min = tempratura[3];
        if (tempratura[4] < min) min = tempratura[4];
        if (tempratura[5] < min) min = tempratura[5];
        if (tempratura[6] < min) min = tempratura[6];
        System.out.println("la tempreatura minima es : " + min);

















         // declarar array
        int i;
        int prom;
        int suma = 0;
        double [] temperatura = new double[7];

        // Crear scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("Porfavor ingresa la temperatura de cada dia ");

        //Generar el arreglo
        temperatura[0] = entrada.nextDouble();
        temperatura[1] = entrada.nextDouble();
        temperatura[2] = entrada.nextDouble();
        temperatura[3] = entrada.nextDouble();
        temperatura[4] = entrada.nextDouble();
        temperatura[5] = entrada.nextDouble();
        temperatura[6] = entrada.nextDouble();

        for (i = 0; i <= 7; i++){
            suma += i;
        }

        prom = suma / 7;
        System.out.println(prom);


    }
}
