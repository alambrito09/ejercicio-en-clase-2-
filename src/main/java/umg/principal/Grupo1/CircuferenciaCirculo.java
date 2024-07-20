package umg.principal.Grupo1;
import java.util.Scanner;

public class CircuferenciaCirculo {
    public void calcularCircunferencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular la circunferencia del círculo
        double circunferencia = 2 * Math.PI * radio;

        System.out.println("La circunferencia del círculo con radio " + radio + " es: " + circunferencia);


    }
}
