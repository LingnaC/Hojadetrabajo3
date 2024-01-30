import org.junit.Test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class pruebasUnitarias {

    //pruebas electionSort
    @Test
    public void testSortWithIntegerArray() {
        Integer[] arrayToSort = {4, 2, 7, 1, 9, 5};
        Integer[] expectedSortedArray = {1, 2, 4, 5, 7, 9};

        SelectionSort.sort(arrayToSort);

        assertArrayEquals(expectedSortedArray, arrayToSort);
    }

    @Test
    public void testSortWithStringArray() {
        String[] arrayToSort = {"a", "b", "o", "k", "g"};
        String[] expectedSortedArray = {"a", "b", "g", "k", "o"};

        SelectionSort.sort(arrayToSort);

        assertArrayEquals(expectedSortedArray, arrayToSort);
    }

    // pruebas quickSort
    @Test
    public void testSort() {
        //Arreglo desordenado
        Integer[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        QuickSort.sort(arr1);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9}, arr1);

        //Arreglo ordenado
        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        QuickSort.sort(arr2);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, arr2);

        //Arreglo con numeros repetidos
        Integer[] arr3 = {5, 2, 7, 2, 8, 5, 3, 4, 2, 9};
        QuickSort.sort(arr3);
        assertArrayEquals(new Integer[]{2, 2, 2, 3, 4, 5, 5, 7, 8, 9}, arr3);
    }

    //pueba RadixSort
    @Test
    public void testRadixSort() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] sortedArr = {2, 24, 45, 66, 75, 90, 170, 802};

        RadixSort.sort(arr);
        assertArrayEquals(sortedArr, arr);
    }

    //prube gnomeSort
    @Test
    public void testGnomeSort() {
        // arreglo desordenado
        Integer[] arr1 = {5, 3, 8, 1, 2};
        GnomeSort.sort(arr1);
        assertArrayEquals(new Integer[]{1, 2, 3, 5, 8}, arr1);

        //arreglo  ordenado
        Integer[] arr2 = {1, 2, 3, 4, 5};
        GnomeSort.sort(arr2);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr2);

        //  arreglo inversamente ordenado
        Integer[] arr3 = {5, 4, 3, 2, 1};
        GnomeSort.sort(arr3);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, arr3);

        // arreglo de cadenas
        String[] arr4 = {"banana", "apple", "orange", "grape", "kiwi"};
        GnomeSort.sort(arr4);
        assertArrayEquals(new String[]{"apple", "banana", "grape", "kiwi", "orange"}, arr4);
    }

    //mergeSort
    @Test
    public void testMergeSort() {
        // desordenado
        Integer[] input1 = {4, 2, 7, 1, 5};
        Integer[] expectedOutput1 = {1, 2, 4, 5, 7};
        MergeSort.sort(input1);
        assertArrayEquals(expectedOutput1, input1);

        // arreglo ya ordenado
        Integer[] input2 = {1, 2, 3, 4, 5};
        Integer[] expectedOutput2 = {1, 2, 3, 4, 5};
        MergeSort.sort(input2);
        assertArrayEquals(expectedOutput2, input2);

        //orden inverso
        Integer[] input3 = {5, 4, 3, 2, 1};
        Integer[] expectedOutput3 = {1, 2, 3, 4, 5};
        MergeSort.sort(input3);
        assertArrayEquals(expectedOutput3, input3);
    }

    //numberGenerator
    @Test
    public void testGenerateNumbers() {
        // genera de números
        NumberGenerator.generateNumbers(5);

        // Intenta leer los números generados
        Integer[] numbers = NumberGenerator.readNumbers();

        // Asegúrate de que se generaron 5 números
        assertEquals(5, numbers.length);
    }
}

