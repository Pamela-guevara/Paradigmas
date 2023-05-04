import java.util.Scanner;
/* Crear un programita que determine la nota en el sistema educativo norteamericano, en
base al porcentaje sacado en un examen por un alumno. Sabiendo que
entre 0-59 la nota será F.
Entre 60-69 la nota será D.
Entre 70-79 será C.
Entre 80-89 será B.
Y finalmente, entre 90-100 la mejor nota, será A. */
public class Ejercicio6 {
    public static void main (String[] args){
        double nota;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Por favor ingrese una nota entre 0 y 100:");
        nota = lectura.nextDouble();
        lectura.close();

        if (nota >= 0 && nota <= 59){
            
            System.out.println("Su nota en el sistema americano es una F");
        
        } else if (nota >= 60 && nota <= 69){
            
            System.out.println("Su nota en el sistema americano es una D");

        } else if (nota >= 70 && nota <= 79){
            
            System.out.println("Su nota en el sistema americano es una C");

        } else if (nota >= 80 && nota <= 89){

            System.out.println("Su nota en el sistema americano es una B");

        } else if (nota >= 00 && nota <= 100){

            System.out.println("Su nota en el sistema americano es una A");

        };
    }
    
}
