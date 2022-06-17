//Se dispone de una colección de Empleados, de cada empleado se conoce:
//Nombre y Apellido
//DNI
//horasTrabajadas
//valorPorHora
//Todos los empleados están cargados en un Set (HashSet), 
//se desea calcular el sueldo (horasTrabajadas x valorPorHora)
//de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado. 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Ejercicio6 {
    public static void main(String[] args) {
        Set<Empleados> plantilla = new HashSet<>();
        Empleados empleado1 = new Empleados("Facundo Garcia", 1234,15,20);
        Empleados empleado2 = new Empleados("Javier Saucedo", 2344,13,12);
        Empleados empleado3 = new Empleados("Antonio Perez", 9817,17,50);
        Map<Integer, Integer> aPagar = new HashMap<>();
        plantilla.add(empleado1);
        plantilla.add(empleado2);
        plantilla.add(empleado3);

        for(Empleados empleado: plantilla) {
            aPagar.put(empleado.getDni(), empleado.getSueldo());
        }

        for(Map.Entry<Integer, Integer> empleado: aPagar.entrySet()) {
            System.out.println("El sueldo a pagar al empleado con D.N.I: " + empleado.getKey() + 
            " es de: " + empleado.getValue());
        }

    }
    
}