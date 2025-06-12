package ch_1.For;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        
        //The complete reference pag 101

        //Cuenta regresiva

        int n; //declaramos n

        for (n = 10; n > 0; n--)
            System.out.println("tick" + n);




        Scanner entrada = new Scanner(System.in);

        System.out.println("Porfavor ingresa un numero para iniciar la cuenta regresiva:  ");
        int numero = entrada.nextInt();

        for (; numero > 0; numero--)
            System.out.println("tick" + numero);


        entrada.close();





        // i
       // int i; tambien es posible pero o se declara afuera o adentro

        for (int i = 0; i < 10 ; i++)
            System.out.println("i vale: " + i);




        //primo?

        int num;//declaramos num
        boolean esPrimo; //declaramos esPrimo

        num = 19;

        //ningun primo es menor a 2 pero la verificacion es con for
        if (num < 2) {
            esPrimo = false;
        }else{
            esPrimo = true;
        }

        for (int i = 2; i <= num / i; i++){
            if ((num % i) == 0) {
                esPrimo = false;
                break;
            }
        }

        if (esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }





        int cont;
        for (cont = 1; cont <= 100; cont ++){
            System.out.println(cont);
        }

//impares del 1 al 30
        for (cont = 1; cont <=30; cont = cont + 2){
            System.out.println(cont);
        }



        //10 al 1
        int i;
        for (i = 10; i >= 1; i--){
            System.out.println(i);
        }




        //par
        int i;
        for (i = 0; i < 10; i++){
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            }else{
                System.out.println(i + " es impar");
            }
        }


        //multiplos de 3
        System.out.println("\n---------Multiplo de 3---------\n");
        int cont;
        for(cont = 0; cont < 30; cont++){
            if (cont % 3 == 0){
                System.out.println(cont + " Es multiplo de 3");
            }else{
                System.out.println(cont + " No es multiplo de 3");
            }
        }









        //Multiplos de 3, 5 y 100

        int i;//declaramos i

        //declarar for
        for (i = 0; i < 100; i++){
            //crear condiciones
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i +" es multiplo de 3 y de 5\n");
            } else if (i % 5 == 0) {
                System.out.println(i +" es multiplo de 5\n");
            } else if (i % 3 == 0) {
                System.out.println(i +" es multiplo de 3 \n");
            }else{
                System.out.println(i +" no es multiplo de 3 ni de 5\n");
            }
        }




        //suma de los multiplos de 4 entre 1 y 200

    int i;
    int suma = 0;
    int contador = 0;
    for (i = 1; i <= 200; i++){
        if (i % 4 == 0){
            System.out.println(i + " Es multiplo de 4");
            suma += i;
            contador++;
        }
    }
        System.out.println("Total de multiplos de 4 es  " + contador);
        System.out.println("suma de los multiplos de 4 es  "+ suma);







        //Suma de multiplos de 6 y 9 del 1 al 300

        int i;
        int contador = 0;
        int suma = 0;
        int prom = 0;

        for (i = 1; i <= 300; i++){
            if (i % 6 == 0 && i % 9 == 0){
                System.out.println(i +" Es multiplo de 6 y de 9");
                suma += i; // va sumando cada multiplo
                contador++ ; // va contando cuantos multiplos van
            }
        }
        prom = suma/contador;
        System.out.println( contador + " es la cantidad de multiplos de 6 y 9 que hay entre 1 al 300");
        System.out.println(suma + " Es la suma de todos los multiplos ");
        System.out.println(prom + " Es el promedio");





         
        // Multiplos de 4 o 6 del 1 al 300
        int i;
        int suma = 0;
        int contador = 0;
        int prom;

        for (i = 1; i <=300; i++){
            if (i % 4 == 0 || i % 6 == 0){
                System.out.println( i + " Es multiplo de 4 o 6");
                suma +=i;
                contador++;
           }
        }

        prom = suma / contador;

        System.out.println( contador + " es la cantidad de multiplos de 4 o 6 que hay entre 1 al 300");
        System.out.println(suma + " Es la suma de todos los multiplos ");
        System.out.println(prom + " Es el promedio");





    }
}
