//Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras). 
//Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.

import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> baraja = new ArrayList<>();
        List<String> palos = new ArrayList<>();
        palos.addAll(Arrays.asList("Corazones", "Picas", "Diamantes", "Treboles"));
        agregarCartas(baraja, palos);
        System.out.println("\n-----EN ORDEN-----");
        imprimir(baraja);
        System.out.println("\n----INVERSO-----");
        Inverso(baraja);
        imprimir(baraja);
        System.out.println("\n----MEZCLADO-----");
        mezclar(baraja);
        imprimir(baraja);
    }
    public static void agregarCartas(List<String> barajas, List<String> palos) {
        for(String palo: palos) {
            for(int i = 2; i <= 9; i++) {
                barajas.add(String.valueOf(i) + " de " + palo);
            }
        }
    }
    public static void imprimir(List<String> barajas) {
        Integer cont = 0;
        for(String carta: barajas) {
            if (cont <= 5) {
                System.out.println(carta + " ");
                cont ++;
            } else {
                cont = 0;
                System.out.println(carta + "\n");
            }
        }
    }
    public static void Inverso(List<String> baraja) {
        Collections.reverse(baraja);
    }
    public static void mezclar(List<String> baraja) {
        Collections.shuffle(baraja); 
    }
}