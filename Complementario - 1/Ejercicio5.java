//Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el multiplicando: ");
        Integer numero1 = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el multiplicador: ");
        Integer numero2 = Integer.valueOf(scan.nextLine());
        scan.close();

        System.out.println(numero1 + " x " + numero2 + " = " + multiplicacion(numero1, numero2));
    }

    public static Integer multiplicacion(Integer multiplicando, Integer multiplicador) {
        Integer acumulador = 0;

        for (int i = 1; i <= multiplicador; i++) {
            acumulador += multiplicando;
        }
        return acumulador;
    }
    
}