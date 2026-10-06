import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double monto = entrada.nextDouble();

        if (monto >= 300) {
            System.out.println("Aplica descuento del 10%");
        }
    }
}