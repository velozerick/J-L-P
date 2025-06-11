package some_exercises;

import java.util.Scanner;

public class Mini_store {
    public static void main(String[] args) {

        //Productos

        System.out.println("Bienvendi@ porfavor ingrese los precios a comparar (solo dos productos)  \n");

        //Begin Scanner

        Scanner precio = new Scanner(System.in);

        System.out.println("Ingrese el precio del primer producto  ");
        double prod1 = precio.nextDouble();

        System.out.println("\n Ingrese el precio del segundo producto  ");
        double prod2 = precio.nextDouble();


        System.out.println("Ingrese la cantidad del primer producto (Gr o Lts)  ");
        double can1 = precio.nextDouble();

        System.out.println("\n Ingrese la cantidad del segundo producto (Gr 0 Lts) ");
        double can2 = precio.nextDouble();


        if (prod1 < prod2 && can1 > can2){
            System.out.println("Te recomiendo llevarte el primer producto es mas economico y tiene mas cantidad ");
        } else if (prod1 > prod2 && can1 < can2) {
            System.out.println("Te recomiendo llevarte el segundo producto es mas economico y tiene mas cantidad ");
        } else if (prod1 == prod2 && can1 > can2) {
            System.out.println("Te recomiendo llevarte el primer producto ambos tienen el mismo precio pero el primero tiene mas cantidad ");
        } else if (prod1 == prod2 && can1 < can2) {
            System.out.println("Te recomiendo llevarte el segundo producto ambos tienen el mismo precio pero el segundo tiene mas cantidad ");
        } else if (prod1 > prod2 && can1 == can2) {
            System.out.println("Te recomiendo llevarte el primer producto es mas economico aunque ambos tienen la mismma cantidad ");
        }else if (prod1 < prod2 && can1 == can2) {
            System.out.println("Te recomiendo llevarte el segundo producto es mas economico aunque ambos tienen la mismma cantidad ");
        }else{
            System.out.println("Puedes elegir libremente");
        }


    }
}
