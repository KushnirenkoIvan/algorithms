package ua.kushnirenko.algorithms.sort;

/**
 * "Пузырьковая" сортировка:
 * <p>
 * Проходим по массиву [размер массива] раз, и каждый проход сравниваем рядом стоящие элементы.
 * Если элемент на позиции j больше элемента на позиции j+1, то меняем их местами.
 */
public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] arr) {
        checkIsNotEmpty(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
        }
    }
}
