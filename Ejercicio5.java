import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("Multiplo de 3 y 5");
        }
    }
}
