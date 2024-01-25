/*Universidad del Valle de Guatemala
Algoritmos y estruccturas de datos
Linda Chen 23173
Mia Fuentes 23775*/

public class MergeSort {
    public static void sort(Comparable[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            Comparable[] left = new Comparable[mid];
            Comparable[] right = new Comparable[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            sort(left);
            sort(right);

            merge(arr, left, right);
        }
    }

    private static void merge(Comparable[] arr, Comparable[] left, Comparable[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
