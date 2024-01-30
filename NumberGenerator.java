//Clase que genera los números aleatorios.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

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

    public static int[] readIntNumbers() {
        try (BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"))) {
            return reader.lines().mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
            return new int[0];
        }
    }
}