package ua.kushnirenko.algorithms.sort;

public interface Sorter {

    default void swap(final int[] arr, final int idx1, final int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    default void checkIsNotEmpty(int[] arr) {
        if (arr.length == 0) throw new IllegalArgumentException();
    }

    void sort(int[] arr);

}
