package ch_1;

public class Strings {
    public static void main (String[] args){

        //Cadena de texto

        String name = "Erick";

        var surname = new String("Gonzalez"); // Cadena de texto pero de manera compleja


        //operaciones basicas

        //concatenacion
        System.out.println(name + " " + surname);



        //longitud
        System.out.println(name.length());//Es la cantidad de caracteres que tiene la cadena de texto
        System.out.println(surname.length());

        System.out.println(name.charAt(2)); //devuelve el caracter en la posicion inidicada
        System.out.println(name.charAt(0));



        //subcadena es una parte de la cadena de texto
        System.out.println(name.substring(2)); //Devuelve la subcadena desde la posicion indicada hasta el final
        System.out.println(name.substring(0,4)); //devuelve la cadena de texto desde la posicion inidicada hasta la posicion indicada sin incluirla


        //Mayusculas y minusculas

        System.out.println(name.toUpperCase()); //Convierte la cadena de texto a mayusculas
        System.out.println(name.toLowerCase()); //Convierte la cadena de texto a minusculas



        //Comprobar si contiene una cadena de texto

        System.out.println("hello, java".contains("ava")); //Devuelve true si la cadena de texto contiene la cadena indicada, false en caso contrario
        System.out.println("hello, java".contains("avax")); //Devuelve false si la cadena de texto no contiene la cadena indicada


        //Comparar cadenas de texto
        System.out.println(name == "Erick"); // Se puede relaizar la compaaracion de esta manera pero no es recomendable ya que compara la referencia de memoria y no el contenido

        System.out.println(name.equals("Erick")); //Esta es la manera correcta de comparar cadenas de texto
        System.out.println(name.equalsIgnoreCase("erIcK")); //Compara cadena de texto ignoradno mayusculas y minusculas







        //Trim
        System.out.println(" Hola me llamo Erick".trim()); //Elimina los espacios en blanco al inicio y al final de la cadena de texto




        //Reemplazar caracteres
        System.out.println("hola no me llamo juan".replace(" ","")); //Reemplaza los caracteres inidicado por el caracter indiicado
        System.out.println("hola si esto es codigo".replace("si","no"));







        // == VS equals()

        var  a = "Erick";
        var b = "Erck";
        var c = new String ("Erick"); //c es un objeto de tipo String creado de manera compleja

        System.out.println(a == b); //Devuelve true porque a y b apuntan a la misma referencia de memoria
        System.out.println(a == c); //Devuielve false porque a y c apuntan a diferentes referencias de memoria

        //El objeto es String  coincide pero no es el mismo objeto en memoria

        System.out.println(a.equals(c)); // Da true porque el contenido de a y c es el mismo
        //La buena practica es usar equals() para comparar cadenas de texto ya que compara el contenido y no la referencia de memoria



        //Alternativa  a la interpolacion de cadenas de texto  que es Format

        var age = 38;

        System.out.println(String.format("Hola mi nombre es %s tengo %d años." , name , age )); // %s es para cadenas de texto y %d para numeros enteros de esta manera se reemplazan los valores en la cadena de texto
        



//SCANNER
        //Scanner es una clase que nos permite leer datos de entrada por teclado
        //Se importa la clase Scanner desde el paquete java.util pero va antes de la clase Strings (hasta arriba)

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresas tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingresa tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Ingresa tu estatura en metros (ej. 1.75): ");
        double altura = entrada.nextDouble();


        System.out.println("\nHola " + nombre + ", tienes  " + edad + " y mides " + altura * 100 + " cm " );

        entrada.close();




        
    }
}











package ch_1.Strings;

public class StringsExercises {
    public static void main(String[] args){

        // 1. Concatena dos cadenas de texto.
        String name = "Salvador";
        String surname = "Skywalker";

        System.out.println(name + " " + surname);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(name.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(name.contains("Sky"));
        System.out.println(surname.contains("wal"));

        // 6. Formatea un string con un entero.
        int age = 22;
        System.out.println(String.format("Mi nombre es %s y tengo %d años de edad.", name , age));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println(String.format("hola me llamo %s y tengo %d años de edad.",name , age).trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(String.format("hola me llamo %s y tengo %d años de edad.",name , age).replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(name.equals(surname));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(name.length() == surname.length());
    }

}

