import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class NumberGenerator {
    public static void generateNumbers(int count) {
        Random random = new Random();
        try (PrintWriter out = new PrintWriter(new File("numbers.txt"))) {
            for (int i = 0; i < count; i++) {
                // Genera solo números positivos
                out.println(random.nextInt(Integer.MAX_VALUE));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] readNumbers() {
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            return reader.lines().map(Integer::parseInt).toArray(Integer[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            return new Integer[0];
        }
    }

    public static void saveSortedNumbers(Integer[] numbers) {
        try (PrintWriter out = new PrintWriter(new File("sorted_numbers.txt"))) {
            for (int number : numbers) {
                out.println(number);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Generar y guardar números
        generateNumbers(3000);

        // Leer números
        Integer[] numbers = readNumbers();

        // Ordenar números
        Arrays.sort(numbers);

        // Guardar números ordenados
        saveSortedNumbers(numbers);
    }
}




