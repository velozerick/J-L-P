/*
Los datos son representaciones del mundo real (edad, numero, flota de camiones , etc.)
JAVA es un lenguaje fuertemente tipado y define 8 tipos de datos primitivos:


Integers/Enteros = byte, short, int, long, 
FLoating-point numbers, double/flotantes = representa numeros con precision fraccional 
Characters/caracteres = char, representa simbolos como letras y numeros (datos alfanumericos)
Boolean/datos logicos = representa verdadero o falso 

Pero antes de eso recordemos algo 

OPERACIONES ARITMETICAS
suma +
resta -
multiplicacion *
division /
modulo (resto) %

operador incremento ++: se utiliza para aumentar en una unidad el valor de una variable numerica entera

operador decremento - : se utiliza para disminuir en una unidad el valor de una variable numerica entera

OPERACIONES LOGICAS

 AND &&
 OR ||
 not !


menor que <
mayor que >
igual que ==
menor o igual que <=
mayor o igual que >=
distinto de !=




#### Ver variables y regresar

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//VARIABLES
		
		//para definir variable se dice de que tipo es el dato
		
		 String         name =        "Erick";
		//tipo     nombre de var     valor de var
		
		System.out.println(name);
		
		int age = 37;
		System.out.println(age);
		
		
		name = "salvador";
		System.out.println(name);
		

		
		//name = 37; Error (no podemos cambiar el tipo de dato)
		
		
		
		//VAR
		 
		var email = "erick@mail.com";
		System.out.println(email);
		
		var edad = 23;
		System.out.println(edad);
		
		// Con "var" no se define el tipo de dato de manera manual pero se crea automaticamente y se asigna el tipo de dato   
		
		
		
		
		
		
		//CONSTANTES**************************************************
		
		final String EMAIL = "erick@gmail.com";
		//email = "salvador@gmail.com";  ya no se puede asignar otra variable e igual nombre ya que se definio como constante con el modificador "final"
		System.out.println(EMAIL);
		
		//Una buena practica es que las constantes se llamen en mayuscula 
		

		final var PASSWORD = "qwerty";
		System.out.println(PASSWORD);
		
		
//EJERCICIOS *****************************************************************************************
		System.out.println("************************EJERCICIOS*************************");
		
        // 1. Declara una variable de tipo String y asígnale tu nombre.
		String myName = "Erick";
		System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
		int Myedad = 22;
		System.out.println(Myedad);

        // 3. Crea una variable double con tu altura en metros.
		double myAltura = 1.71;
		System.out.println(myAltura);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
		boolean gustaProgramar = true;
		System.out.println(gustaProgramar);

        // 5. Declara una constante con tu email.
		final String MYEMAIL = "erick_veloz@outlook.com";
		System.out.println(MYEMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
		char myInicial = 'E';
		System.out.println(myInicial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
		String myCity = "Ojo de Agua";
		System.out.println(myCity);
		
		myCity = "tecamac";
		System.out.println(myCity);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
		int a = 10;
		int b = 10;
		
		System.out.println(a + b);


        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
		
		int c;
		System.out.println(c = 22);
		
	}

}




*/
