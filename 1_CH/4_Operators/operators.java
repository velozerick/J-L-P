
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores nos permiten relaizar operaciones sobre valores 
		
		//Operadores aritmeticos
		var a = 15;
		var b = 10;
		var c = 1;
		var d = 2;
		
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		//Operadores de asignacion sirven para asignar tal cual valores a las variables 
		
		a = b; //Quiero que a tenga el valor de b 
		System.out.println(a);
		
		
		a = b * 2;
		System.out.println(a);
		
		a += 1; //a = a + 1
		System.out.println(a);
		
		a *=1;
		System.out.println(a);
		
	
		//Operadores de comparacion  T / F (relacionales)
		
		System.out.println(a == b); // "a" es igual a "b" ?
		
		System.out.println(a == 6);
		
		System.out.println(a == 15);		
		
		
		//Desigualdad
		System.out.println("Operadores Desigualdad");
		
		System.out.println(a != b); // es distinto?

		System.out.println(c > d); //mayor que 
		System.out.println(c >= d);//mayor o igual que
		System.out.println(c < d);//menor que
		System.out.println(c <= d);//menor o igual que
		
		
		
		//Logicos (booleanas)
		
		System.out.println("\nOperadores booleanos\n");
		
		//AND 
		
		System.out.println("***AND***\n");
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(3>2 && 5 == 2);
		
		
		
		//OR
		System.out.println("\n***OR***\n");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(3>2 || 5 == 2);
		
		//NOT
		System.out.println("\n***NOT***\n");
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(!(3>2) || 5 == 2);
	
		
		//UNARIOS
		System.out.println("\n***Unarios***\n");
		
		System.out.println(+b);
		System.out.println(-b);
		System.out.println(++b);
		System.out.println(--b);
		
		var e = 5;
		
		System.out.println(++e);
		System.out.println(e++);
		System.out.println(e);
		System.out.println(--e);
		System.out.println(e--);
		System.out.println(e);
		
		
		
	}

}



########################################################################3
EJERCICIOS



	
		//EJERCICIOS
		System.out.println("\n###EJERCICIOS###\n");
		
		   // 1. Crea una variable con el resultado de cada operación aritmética.
		System.out.println("\nE1\n");
		var num = 10;
		
		System.out.println(num + num);
		System.out.println(num - num);
		System.out.println(num * num);
		System.out.println(num / num);
												

        // 2. Crea una variable para cada tipo de operación de asignación.
		System.out.println("\nE2\n");
		var f = 10;
		var g = 20;
		f = g;
		System.out.println(f);
		
		f = g * 2;
		System.out.println(f);
 
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
		System.out.println("\nE2\n");
		System.out.println(f == f);
		System.out.println(g < f);
		System.out.println(f >= g);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
		System.out.println(g >= f);
		System.out.println(f == g);
		System.out.println(f <= g);

        // 5. Utiliza el operador lógico and.
		System.out.println("\nE3\n");
		System.out.println(true && true );
		System.out.println(true && false);
		
		

        // 6. Utiliza el operador lógico or.
		System.out.println(3 > 2 || 5 < 10);
		System.out.println(f == g || f < g);

        // 7. Combina ambos operadores lógicos.
		System.out.println(true && false || false );
		System.out.println(10 > 8 && 8978 > 10 || 5 == 5);

        // 8. Añade alguna negación.
		System.out.println(10 > 8 && !(8978 > 10) || !(5 == 5));
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
		System.out.println(f++);
		System.out.println(f);
		++f;
		System.out.println(f);

        // 10. Combina operadores aritméticos, de comparación y lógicos.
		var h = 52;
		
		System.out.println(h + h > h && h > f);
