package ua.kushnirenko.algorithms.sort;

/**
 * Сортировка "перемешиванием" ("Двойная пузырьковая")
 * <p>
 * В отличие от пузырьковой когда идём "вправо", то "гоним" пузрёк с самым большим элементом  вправо,
 * Когда идём "влево", то "гоним" пузырёк с самым маленьким элементом "влево".
 * <p>
 * Быстрее, чем "Пузырьковая".
 */
public class ShakerSort implements Sorter {

    @Override
    public void sort(int[] arr) {
        checkIsNotEmpty(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            boolean isSwapped = false;

            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }

            for (int j = arr.length - 2 - i; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }
}
