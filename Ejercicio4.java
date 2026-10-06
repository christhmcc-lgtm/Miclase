import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        int nota = entrada.nextInt();

        if (nota >= 17) {
            System.out.println("Alumno destacado");
        }
    }
}