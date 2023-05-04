//import java.io.*;
import java.util.Scanner;

/* Escribir un programita que permita convertir una medida dada en pulgadas, a una medida
en metros. Utilizar el ingreso de datos por parte del usuario, mediante Scanner. * Una
pulgada es 0.0254m */

public class Ejercicio2 {
    public static void main (String[] args){
        double pulg = 0.0254; // En m;
        double convertir;
        double resultado;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el número en pulgadas que desea convertir a metros: ");
        convertir = lectura.nextDouble();
        resultado = (convertir * pulg);
        lectura.close();

        //System.out.println(resultado);
        System.out.printf(" %f en pulgadas, es igual a %f en metros", pulg, resultado);


    }
}
