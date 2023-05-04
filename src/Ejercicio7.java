import java.util.Scanner;
/* Crear un programita que presente al usuario un menú de bebidas posibles de comprar en
el kiosco: jugo de naranja, licuado de banana, licuado verde, jugo apio y manzana, leche
de canela. El usuario deberá decir la que prefiere, con un número. El programa deberá
mostrar cuál es la bebida que eligió. (1 → 'Usted se compró un jugo de naranja') */
public class Ejercicio7 {
    public static void main (String[] args){

        String[] arr = {"jugo de naranja", "licuado de banana", "licuado verde", "jugo apio y manzana", "leche de canela"};
        String choice;
        int num;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una opción:\n1) jugo de naranja\n2) licuado de banana\n3) licuado verde\n4) jugo apio y manzana\n5) leche de canela");
        num = lectura.nextInt();
        lectura.close();

        choice = arr[num -1];
        System.out.printf("Usted eligió la opción %s que corresponde a: %s", num, choice);

    }
}
