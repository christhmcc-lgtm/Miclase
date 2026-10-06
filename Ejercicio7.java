import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una temperatura: ");
        double temperatura = entrada.nextDouble();

        if (temperatura > 35) {
            System.out.println("Temperatura extrema");
        }
    }
}