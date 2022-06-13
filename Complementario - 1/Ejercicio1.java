//Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombre = scan.nextLine();
        scan.close();

        imprimir(nombre);
    }
    public static void imprimir(String nombre) {
        System.out.println("Hola " + nombre);
    }
}