package com.exerciciostrategy.Strategy;

public class BubbleSort implements IOrdenacao {
    @Override
    public void ordenar(double[] a, int[] n) {
        for (int i = n[0] - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
