//import java.io.*;
//import java.util.Scanner;
/*Crear un programita que calcule el area de un círculo, para un radio fijo dentro del código.
Defina la constante PI.*/
public class Ejercicio3 {
    public static void main (String[] args){
        double radio = 2;
        double area;
        double pi = Math.PI;
        double aux = Math.pow(radio, 2);
        area = (aux * pi);
        System.out.println(area);

    }
}
