package com.example.sorting;

/**
 * Utility class containing generic sorting algorithms.
 */
public final class SortingUtility {

    private SortingUtility() {
        // Prevent instantiation
    }

    private static <T> void swap(T[] a, int first, int second) {
        T temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

    public static <T extends Comparable<T>> void gnomeSort(T[] a) {
        int pos = 0;

        while (pos < a.length) {
            if (pos == 0 || a[pos].compareTo(a[pos - 1]) >= 0) {
                pos = pos + 1;
            } else {
                swap(a, pos, pos - 1);
                pos = pos - 1;
            }
        }
    }

    public static <T extends Comparable<T>> void cocktailShakerSort(T[] a) {
        boolean swapped;

        do {
            swapped = false;

            // Forward pass
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;

            // Backward pass
            for (int i = a.length - 2; i >= 0; i--) {
                if (a[i].compareTo(a[i + 1]) > 0) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }

        } while (swapped);
    }

    public static <T extends Comparable<T>> void shellSort(T[] a) {
        int[] gaps = {701, 301, 132, 57, 23, 10, 4, 1};
        int n = a.length;

        for (int gap : gaps) {
            for (int i = gap; i < n; i += 1) {
                T temp = a[i];

                int j;
                for (j = i; j >= gap && a[j - gap].compareTo(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }

                a[j] = temp;
            }
        }
    }
}