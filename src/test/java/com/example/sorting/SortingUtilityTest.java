package com.example.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class SortingUtilityTest {

    @Test
    void gnomeSortShouldSortEmptyArray() {
        Integer[] a = {};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{}, a);
    }

    @Test
    void gnomeSortShouldSortSingleElementArray() {
        Integer[] a = {5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{5}, a);
    }

    @Test
    void gnomeSortShouldSortAlreadySortedArray() {
        Integer[] a = {1, 2, 3, 4, 5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void gnomeSortShouldSortReverseSortedArray() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void gnomeSortShouldSortDuplicates() {
        Integer[] a = {4, 2, 4, 1, 2};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2, 2, 4, 4}, a);
    }

    @Test
    void gnomeSortShouldSortAllEqualValues() {
        Integer[] a = {7, 7, 7, 7};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{7, 7, 7, 7}, a);
    }

    @Test
    void gnomeSortShouldSortTwoElementSortedArray() {
        Integer[] a = {1, 2};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSortShouldSortTwoElementUnsortedArray() {
        Integer[] a = {2, 1};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 2}, a);
    }

    @Test
    void gnomeSortShouldSortRandomIntegerArray() {
        Integer[] a = {9, 3, 7, 1, 5};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new Integer[]{1, 3, 5, 7, 9}, a);
    }

    @Test
    void gnomeSortShouldSortStringArray() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.gnomeSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    @Test
    void cocktailShakerSortShouldSortReverseSortedArray() {
        Integer[] a = {5, 4, 3, 2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, a);
    }

    @Test
    void cocktailShakerSortShouldSortDuplicates() {
        Integer[] a = {3, 1, 3, 2, 1};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3}, a);
    }

    @Test
    void cocktailShakerSortShouldSortStringArray() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.cocktailShakerSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }

    @Test
    void shellSortShouldSortReverseSortedArray() {
        Integer[] a = {9, 8, 7, 6, 5, 4};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{4, 5, 6, 7, 8, 9}, a);
    }

    @Test
    void shellSortShouldSortDuplicates() {
        Integer[] a = {10, 3, 10, 2, 3};
        SortingUtility.shellSort(a);
        assertArrayEquals(new Integer[]{2, 3, 3, 10, 10}, a);
    }

    @Test
    void shellSortShouldSortStringArray() {
        String[] a = {"zebra", "apple", "mango", "banana"};
        SortingUtility.shellSort(a);
        assertArrayEquals(new String[]{"apple", "banana", "mango", "zebra"}, a);
    }
}