package ua.kushnirenko.algorithms.sort;

/**
 * Сортировка Шелла
 * <p>
 * Быстрая сортировка, конкурирует с QuickSort, особенно в худших случаях.
 * <p>
 * Выбираем некоторое осевое значение, и от этого осевого значения "шагаем" "влево" и "вправо", сравнивая элементы и,
 * если это необходимо, меняем их местами.
 * Размер шага = d, в конце сортировки получаем d = 1.
 */

public class ShellSort implements Sorter {

    @Override
    public void sort(int[] arr) {
        checkIsNotEmpty(arr);

        int N = arr.length;
        int h = 1;

        while (h < N / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && arr[j] < arr[j - h]; j -= h) {
                    swap(arr, j, j - h);
                }
            }
            h /= 3;
        }
    }
}
