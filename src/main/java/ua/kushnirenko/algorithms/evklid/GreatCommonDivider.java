package ua.kushnirenko.algorithms.evklid;


/**
 * Поиск наибольшего общего делителя двух НЕотрицательных целых чисел по алгоритму Евклида.
 */
public class GreatCommonDivider {

    public static int calculate(int n, int m) {
        if (m == 0) return n;
        int r = n % m;
        return calculate(m, r);
    }
}
