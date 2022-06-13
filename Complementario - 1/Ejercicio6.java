//Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el numero base: ");
        Integer numero1 = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el exponente: ");
        Integer numero2 = Integer.valueOf(scan.nextLine());
        scan.close();
        System.out.println(numero1 + " elevado a " + numero2 + " = " + elevar(numero1, numero2));
    }

    public static Integer elevar(Integer base, Integer exponente) {
        Integer acumulador = 1;

        for (int i = 1; i <= (exponente); i++) {
           acumulador = acumulador * base; 
        }
        return acumulador;
    }
        
}
