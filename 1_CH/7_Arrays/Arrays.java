package ch_1.Arrays;

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


        System.out.println("\n---------------------------ARRAYS-------------------------------\n");

        //Definir array []
        int[] numeros = new int[3]; //quiero una caja que almacene 3 enteros

        System.out.println(numeros); // hace referencia a su direccion de memoria es por eso que aparecen cosas raras
        System.out.println(numeros.length); // solo nos diuce que lugares hay

        String[] nombres = {"Luke" , "skywalker" , "Jedi knight"};
        System.out.println(nombres); // aun no se observan los datos

        /* cada uno de los valores esta indexado por lo tanto tienen lugares como:
        el que esta en primer lugar ocupa el valor 0
        el que esta en segundo lugar ocupa el valor 1
        y asi
         */

        //Acceder a lso datos

        System.out.println(nombres[0]); // Aqui le indico que quiero acceder a lo que hay en el array allmacenado en la posicion 0
        System.out.println(nombres[1]); //Posicion 1
        System.out.println(nombres[2]); //posicion 2


        //Modificar los datos del array

        numeros[0] = 5;
        numeros[1] = 10;
        System.out.println(numeros[0]);

        //Modificar el valor de la psoicion 0 (Antes Luke) para ahora colocar Anakin en su lugar
        nombres[0] = "Anakin";
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);




        
























    }
}
