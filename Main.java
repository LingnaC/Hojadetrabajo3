//Clase principal

public class Main {
    public static void main(String[] args) {
        // Generar y guardar números
        NumberGenerator.generateNumbers(3000);

        // Leer números, ordenar y analizar rendimiento
        Integer[] numbers = NumberGenerator.readNumbers();

        // Perfilando algoritmos de ordenamiento
        profilerClass.profileSort("Gnome Sort", numbers, GnomeSort::sort);
        profilerClass.profileSort("Merge Sort", numbers, MergeSort::sort);
        profilerClass.profileSort("Quick Sort", numbers, QuickSort::sort);
    }
}
