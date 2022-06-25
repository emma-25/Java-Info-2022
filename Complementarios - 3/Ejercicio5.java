//Se posee una Lista con objetos de clase Alumno con los atributos: 
//apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). 
//Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
//(con separador de espacio en blanco) y el value la edad del alumno.

//La lista de entrada debe estar cargada con varios alumnos 
//(al menos 5) para subir el ejemplo y demostrar su funcionamiento.
//En ejemplo se muestra solo con 1 Alumno a modo de abreviar.

//En el ejemplo también se usa LocalDate.now().minusYears(30), 
//en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc)

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumnos> alumnos = List.of(
                new Alumnos("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Alumnos("Lisa", "Simpson", LocalDate.of(1956, 5, 12)),
                new Alumnos("Bart", "Simpson", LocalDate.of(1990, 2, 10)),
                new Alumnos("Maggie", "Simpson", LocalDate.of(2001, 3, 30)),
                new Alumnos("Marge", "Bouvier", LocalDate.of(1954, 2, 5)),
                new Alumnos("Marvin", "Monroe", LocalDate.of(1945, 7, 21)),
                new Alumnos("Abbe", "Simpson", LocalDate.of(1911, 11, 11)));
        Map<String, Integer> alumnosConEdades = alumnos.stream()
                .collect(Collectors
                        .toMap(p-> (p.getName() + " " + p.getSurname()),
                                p -> Ejercicio5.getEdad(p.getBirthday())));
        System.out.println(alumnosConEdades);
    }
    public static Integer getEdad(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
        
    }
}