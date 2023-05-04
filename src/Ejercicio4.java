//import java.io.*;
import java.util.Scanner;
/*Crear un programa que pida al usuario dos números y devuelva la suma de ambos, y su
multiplicación*/
public class Ejercicio4 {
    public static void main (String[] args){
        double a;
        double b;
        double mult;
        double sum;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        a = lectura.nextDouble();
        System.out.println("Ingrese el segundo valor: ");
        b = lectura.nextDouble();
        mult = (a * b);
        sum = (a + b);
        lectura.close(); // Al parecer el tipo scanner necesita ser cerrada como los archivos
        System.out.printf("El resultado de sumar %s con %s es: %s; y el resultado de multiplicarlos es: %s", a, b, sum, mult);


    }
}
