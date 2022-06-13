//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Infrese el numero a factorizar: ");
        Integer numero = Integer.valueOf(scan.nextInt());
        scan.close();
        System.out.println("El factorial de " + numero + " es: " + factorializar(numero));
    }

    public static Integer factorializar(Integer numero) {
        if(numero ==1){
            return numero;
        } else {
            return (numero * factorializar(numero -1));
        }
    }
}
