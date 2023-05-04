//import java.io.*;
import java.util.Scanner;

/*Crear un programita en Java que imprima en pantalla ”Hola Pepe, tanto tiempo!”. Utilizar
una constante para guardar el texto. Hacer luego una variación para permitirle al usuario
ingresar su nombre.*/

public class Ejercicio1 {
    public static void main(String[] args){
        String nombre;
        String mensaje = "¡Hola %s, tanto tiempo!";
        String name = "Pepe";

        System.out.printf(mensaje, name);
        Scanner lectura = new Scanner(System.in);
        System.out.println("\nIngrese su nombre: ");
        nombre = lectura.nextLine();
        lectura.close();
        System.out.printf(mensaje, nombre);

    }
}
