package com.exerciciostrategy.Strategy;

public class QuickSort implements IOrdenacao {
    @Override
    public void ordenar(double[] a, int[] n) {
        quickSort(a, 0, n[0] - 1);
    }

    private void quickSort(double[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private int partition(double[] a, int low, int high) {
        double pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] <= pivot) {
                i++;

                double temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        double temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }
}
