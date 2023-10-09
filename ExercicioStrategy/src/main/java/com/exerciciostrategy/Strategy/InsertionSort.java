package com.exerciciostrategy.Strategy;

public class InsertionSort implements IOrdenacao {
    @Override
    public void ordenar(double[] a, int[] n) {
        int tamanho = n[0];
        
        for (int i = 1; i < tamanho; i++) {
            double chave = a[i];
            int j = i - 1;
            
            while (j >= 0 && a[j] > chave) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            
            a[j + 1] = chave;
        }
    }
}
