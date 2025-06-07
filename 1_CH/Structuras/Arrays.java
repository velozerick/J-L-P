package ch_1.Structures;

public class Arrays {
    public static void main(String[] args) {

        //Arrays son estructuras de datos que permiten almacenar varios valores del mismo tipo en una sola variable.

        //Es un conjunto de datos del mismo tipo, que se almacenan en una sola variable. indexados desde 0 hasta n-1, donde n es el numero de elementos del array.

        //Declaracion de un array

        int[] numbers = new int[3]; //Declaración de un array de enteros con 4 elementos
        //new es una palabra reservada que se utiliza para crear un nuevo objeto en memoria.

        System.out.println(numbers);


        String[] names = {"Erick", "Gonzalez", "Skywalker"}; //Declaración de un array de cadenas de texto con 3 elementos
        System.out.println(names);

        //Acceso a los elementos del array
        System.out.println(names[0]); //Acceso al primer elemento del array
        System.out.println(names[1]); //Acceso al segundo elemento del array



        System.out.println(numbers[2]);

        //Modificar un elemento del array
        System.out.println((new String[3])[0]); //Acceso al primer elemento del array de cadenas de texto


        numbers[0] = 1; //Asignación de un valor al primer elemento del array de enteros
        numbers[1] = 10; //Asignación de un valor al segundo elemento del array de enteros

        System.out.println(numbers[0]); //Impresión del primer elemento del array de enteros
        System.out.println(numbers[1]); //Impresión del segundo elemento del array de enteros


        System.out.println(numbers[0]);
        numbers[0] = 5; //Asignación de un nuevo valor al primer elemento del array de enteros
        System.out.println(numbers[0]); //Impresión del primer elemento del array de enteros modificado



    }
}
