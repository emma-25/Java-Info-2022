import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
//Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.


public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> aCobrar = new ArrayList<>();
        Integer totalACobrar = 0;
        horasTrabajadas.addAll(Arrays.asList(5, 6, 7, 4));
        valorPorHora.addAll(Arrays.asList(400, 280, 300,450));

        for (int i = 0; i <= horasTrabajadas.size() - 1; i++) {
            aCobrar.add(horasTrabajadas.get(i) * valorPorHora.get(i));
            totalACobrar = totalACobrar + aCobrar.get(i);
        }
        System.out.println(aCobrar); 
        System.out.println("Total Final: $ " + totalACobrar); 
    }
}
