import java.util.*;

/* Pedir una palabra al usuario. Mostrar una letra por línea */

public class Ejercicio9{
    public static void main(String[] args){
        String palabra;
        char letra;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra = lectura.nextLine();
        lectura.close();

        for (int i = 0; i < palabra.length(); i++ ){
            letra = palabra.charAt(i);
            System.out.printf("%s\n", letra);
        };
    };
}