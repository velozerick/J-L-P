package some_exercises;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //CALCULADORA DE IMC

        System.out.println("nBIENVENID@\n");
        System.out.println("SI estas aqui es porque quieres mejora tu vida\t  Iniciemos con el calculo de tu IMC\n");

        //Initialization de Scanner
        Scanner CIMC = new Scanner(System.in);

        System.out.println("\nPorfavor ingresa tu peso en kg:  ");
        double peso = CIMC.nextDouble();

        System.out.println("\nPorfavor ingresa tu altura en cm:  ");
        double altura = CIMC.nextDouble();
        altura = altura / 100;

      double imc = peso / (altura * altura);

      if (imc <= 18.5){
          System.out.println("Tu IMC es de \n " + imc + "Deberias considerar una cita con uin especialista en nutricion");
      }else if (imc >= 18.5 && imc < 24.9){
          System.out.println("Tu IMC es de \n " + imc + "Estas en el rango normal sigue asi");
      } else if (imc >= 25 && imc <30) {
          System.out.println("Tu IMC es de \n" + imc + "Estas en sobrepeso ten cuidado es mejor empezar una dieta");
      }else {
          System.out.println("Urge come lechuga estas obeso");
      }

      CIMC.close();


    }
}
