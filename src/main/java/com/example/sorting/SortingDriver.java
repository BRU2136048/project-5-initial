package com.example.sorting;

import java.util.Arrays;
import java.util.Random;

import org.springframework.util.StopWatch;

public class SortingDriver {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};
        String[] patterns = {"sorted", "random", "reverse"};

        for (int size : sizes) {
            for (String pattern : patterns) {
                runPerformanceTest(size, pattern);
            }
        }
    }

    private static void runPerformanceTest(int size, String pattern) {
        Integer[] original = generateArray(size, pattern);

        Integer[] gnomeCopy = copyArray(original);
        Integer[] cocktailCopy = copyArray(original);
        Integer[] shellCopy = copyArray(original);

        System.out.println("\n========================================");
        System.out.println("Input Size: " + size);
        System.out.println("Pattern: " + pattern);
        System.out.println("========================================");

        StopWatch stopWatch = new StopWatch();

        stopWatch.start("Gnome Sort");
        SortingUtility.gnomeSort(gnomeCopy);
        stopWatch.stop();
        System.out.println("Gnome Sort: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        stopWatch.start("Cocktail Shaker Sort");
        SortingUtility.cocktailShakerSort(cocktailCopy);
        stopWatch.stop();
        System.out.println("Cocktail Shaker Sort: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        stopWatch.start("Shell Sort");
        SortingUtility.shellSort(shellCopy);
        stopWatch.stop();
        System.out.println("Shell Sort: " + stopWatch.getLastTaskTimeNanos() / 1_000_000.0 + " ms");

        System.out.println(stopWatch.prettyPrint());
    }

    private static Integer[] generateArray(int size, String pattern) {
        Integer[] arr = new Integer[size];

        switch (pattern.toLowerCase()) {
            case "sorted":
                for (int i = 0; i < size; i++) {
                    arr[i] = i;
                }
                break;

            case "reverse":
                for (int i = 0; i < size; i++) {
                    arr[i] = size - i;
                }
                break;

            case "random":
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    arr[i] = random.nextInt(50000);
                }
                break;

            default:
                throw new IllegalArgumentException("Unknown pattern: " + pattern);
        }

        return arr;
    }

    private static <T> T[] copyArray(T[] obj) {
        return Arrays.copyOf(obj, obj.length);
    }
}