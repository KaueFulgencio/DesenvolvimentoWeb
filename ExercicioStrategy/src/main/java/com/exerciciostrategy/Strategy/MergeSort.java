package com.exerciciostrategy.Strategy;

public class MergeSort implements IOrdenacao {
    @Override
    public void ordenar(double[] a, int[] n) {
        mergeSort(a, 0, n[0] - 1);
    }

    private void mergeSort(double[] a, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

    private void merge(double[] a, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = a[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = a[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                a[k] = leftArray[i];
                i++;
            } else {
                a[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
