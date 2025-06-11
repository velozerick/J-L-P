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
        
         

    }
}

