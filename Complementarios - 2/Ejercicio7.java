import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings. 
//Con la secuencia de números enteros de principio a final. 
//Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
//Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
//Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        Integer numero1 = Integer.valueOf(scan.nextLine());
        System.out.println("Ingrese el segundo valor: ");
        Integer numero2 = Integer.valueOf(scan.nextLine());
        List<String> listaNumero = new ArrayList<>();
        scan.close();
        fizzBuzzFuncion(numero1, numero2, listaNumero);
        System.out.println(listaNumero);
    }

    public static void fizzBuzzFuncion(Integer numero1, Integer numero2, List<String> listaNumero) {
        for (int i = numero1; i < numero2; i++) {
            if ((i % 2) == 0 && (i % 3) == 0) {
                listaNumero.add("FizzBuzz");
            } else if ((i % 2) == 0) {
                listaNumero.add("Fizz");
            } else if ((i % 3) == 0) {
                listaNumero.add("Buzz");
            } else {
                listaNumero.add(String.valueOf(i));
            }
            
        }
    }
}
