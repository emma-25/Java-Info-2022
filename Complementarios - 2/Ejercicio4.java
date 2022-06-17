//Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<String>();
        alumnos.addAll(Arrays.asList("Emmanuel", "Facundo", "Rodrigo", "Matias", "Horacio", "Santiago", "Patricia", "Carolina", "Ivan", "Carla", "Nicolas", "Mariela"));
        List<List<String>> cursos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cursos.add(alumnos.subList(4 * i, 3 + 4 * i));
        }

        System.out.println(cursos);

        Integer contador = 1;
        for (List<String>curso: cursos) {
            System.out.println("Curso #" + (contador++) + " : ");
            for(String nombre: curso) {
                System.out.println(nombre + " "); 
            }
            System.out.println(" ");  
        }
    }
}
