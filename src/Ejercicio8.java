import java.util.*;

/*Crear un programita que permita al usuario ingresar una palabra y la imprima 20 veces
en pantalla, de dos maneras. La primera vez, todas seguidas (HolaHolaHola...Hola). La
segunda vez, una palabra por línea. */

public class Ejercicio8 {
    public static void main(String[] args){

        String palabra;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        palabra = lectura.nextLine();
        lectura.close();
        
        for (int i = 0; i <= 20; i++){
            System.out.printf("%s", palabra);
        };

        for (int i = 0; i <= 20; i++){
            System.out.printf("%s \n", palabra);
        };
    };
    
}
