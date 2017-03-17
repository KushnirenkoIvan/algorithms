package ua.kushnirenko.algorithms.search;

/**
 * Алгоритм бинарного поиска значения в отсортированном массиве.
 * <p>
 * Выбирает "осевое" значение, и сравнивает его с искомым. В зависимости от результатов сравнения продолжает
 * поиск аналогичным образом либо в левой части массива, либо в правой.
 */
public class BinarySearch {

    public static int find(int[] arr, int elem) {
        int l = 0;
        int r = arr.length - 1;

        while (r - l > 1) {
            int pivotal = l + (r - l) / 2;

            if (arr[pivotal] - elem < 0) {
                l = pivotal;
            } else {
                r = pivotal;
            }
        }
        for (int i = l; i <= r; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }
        return -1;
    }
}
