/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Mia Fuentes 23775*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Generar y guardar números
        NumberGenerator.generateNumbers(3000);

        // Leer números
        Integer[] numbers = NumberGenerator.readNumbers();

        // Preguntar al usuario cuántos números desea ordenar
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántos de los 3000 números generados desea ordenar?");
        int count = scanner.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        // Asegurarse de que el conteo no exceda la longitud del arreglo
        count = Math.min(count, numbers.length);

        // Crear un subarreglo con la cantidad de números que el usuario desea ordenar
        Integer[] numbersToSort = Arrays.copyOfRange(numbers, 0, count);

        // Gnome Sort
        Profiler.profileSort("Gnome Sort", numbersToSort, GnomeSort::sort);


        // Guardar los números ordenados por Gnome Sort en un archivo de texto
        NumberGenerator.saveSortedNumbers(numbersToSort);

        // Perfilando otros algoritmos de ordenamiento
        Profiler.profileSort("Merge Sort", numbersToSort, MergeSort::sort);
        Profiler.profileSort("Quick Sort", numbersToSort, QuickSort::sort);
        Profiler.profileSort("Selection Sort", numbersToSort, SelectionSort::sort);

        // Radix Sort requiere un arreglo de int, no de Integer
        int[] intNumbersToSort = Arrays.stream(numbersToSort).mapToInt(Integer::intValue).toArray();
        Profiler.profileSort("Radix Sort", intNumbersToSort, RadixSort::sort);
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.println("Los 3000 números generados aleatoriamente los puede visualizar en el archivo numbers.txt");
        System.out.println("La cantidad de números que usted ha decidido ordenar los puede visualizar en el archivo sorted_numbers.txt");
    }
}

