import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la nota de Matematica: ");
        int matematica = entrada.nextInt();

        System.out.print("Ingrese la nota de Comunicacion: ");
        int comunicacion = entrada.nextInt();

        if (matematica >= 11 && comunicacion >= 11) {
            System.out.println("Postulante apto");
        }
    }
}