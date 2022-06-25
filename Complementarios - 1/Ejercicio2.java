//Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numero1 = Integer.parseInt(scan.nextLine());
        Integer numero2 = Integer.parseInt(scan.nextLine());
        scan.close();

        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
        System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        System.out.println(numero1 + " % " + numero2 + " = " + (numero1 % numero2));
        
        
    }

}
