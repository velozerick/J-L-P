
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
