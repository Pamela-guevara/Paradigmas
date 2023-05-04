//import java.io.*;
import java.util.Scanner;
/*Crear un programita que calcule el volumen de un cono. Recordar que la fórmula de
volúmen de un cono es V = 1/3 πr2h , donde el radio y la altura deben ser ingresados por el
usuario, y se debe definir la constante pi en el código.*/
public class Ejercicio5 {
    public static void main(String[] args){

        double pi = Math.PI;
        double r;
        double h;
        double area;
        double volumen;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio: ");
        r = lectura.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        h = lectura.nextDouble();
        area = Math.pow(r, 2);
        volumen = ((pi/3) * area * h);
        lectura.close();

        System.out.printf("El valor del volumen de su cono de radio %s y altura %s es: %s", r, h, volumen);


    }
    
}
