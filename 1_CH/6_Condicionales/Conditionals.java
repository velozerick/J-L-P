package ch_1.Conditionals;

public class Conditionals {
    public static void main (String [] args){



        // If , else if, else sirve para evaluar una condition y ejecutar un bloque de código dependiendo del resultado de la condicion
        var age = 18;
System.out.println("\n---------------------If, else if, else---------------------\n");
        if (age > 18) {
            System.out.println("El usuario es mayor de edad");
        }else if (age == 18){
            System.out.println("El usuario acaba de cumplir la mayoria de edad");
        }else {
            System.out.println("El usuario no es mayor de edad");
        }






        // Switch sirve para evaluar una variable y ejecutar un bloque de codigo dependiendo del valor de la variable
System.out.println("\n---------------------Switch---------------------\n");


        var day = 6; // 1 = Lunes, 2 = Martes, 3 = Miercoles, 4 = Jueves, 5 = Viernes, 6 = Sabado, 7 = Domingo

        switch (day){
            case 1:
                System.out.println("Lunes");
                break; // El break es necesario para salir del switch, si no se pone se ejecutaran todos los casos siguientes
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            default:
            System.out.println("No es ningun dia de la semana");
        }
        
        // cuando usar switch y cuando usar if 
        
        /*
        Se recomienda usar switch cuando se tiene una variable que puede tomar varios valores y se quiere ejecutar un bloque de codigo dependiendo del valor de la variable.
        Se recomienda usar if cuando se tiene una condicion que puede ser verdadera o falsa y se quiere ejecutar un bloque de codigo dependiendo del resultado de la condicion.
        Tambien se puede usar if para evaluar una variable, pero es mas recomendable usar switch cuando se tiene una variable que puede tomar varios valores.
        En resumen, se recomienda usar switch cuando se tiene una variable que puede tomar varios valores y se quiere ejecutar un bloque de codigo dependiendo del valor de la variable, 
        y se recomienda usar if cuando se tiene 
        una condicion que puede ser verdadera o falsa y se quiere ejecutar un bloque de codigo dependiendo del resultado de la condicion.
         */
        
        
        
        

    }
}
