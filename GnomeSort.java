/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Mia Fuentes 23775*/

public class GnomeSort {
    public static void sort(Comparable[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0 || arr[index - 1].compareTo(arr[index]) <= 0) {
                index++;
            } else {
                Comparable temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }
}


