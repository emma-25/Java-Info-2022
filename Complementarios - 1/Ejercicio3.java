//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1) de la siguiente forma:

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Integer numero = Integer.parseInt(scan.nextLine());
        scan.close();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j + " ");
            }
            System.out.println();
        }
    }
}