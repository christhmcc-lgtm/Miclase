import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        if (Math.abs(numero) >= 100 && Math.abs(numero) <= 999) {
            System.out.println("El numero tiene tres cifras");
        }
    }
}