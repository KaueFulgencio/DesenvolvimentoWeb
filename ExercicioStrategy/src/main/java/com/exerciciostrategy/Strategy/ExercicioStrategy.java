package com.exerciciostrategy.Strategy;

public class ExercicioStrategy {

    public static void main(String[] args) {
        double[] arrayDouble = {1.0, 2.0, 8.0, 32.0, 195.0};
        int[] arrayInt = {5, 4, 3, 2, 1}; 

        IOrdenacao algoritmo;

        algoritmo = new BubbleSort();
        algoritmo.ordenar(arrayDouble, arrayInt);

        algoritmo = new InsertionSort();
        algoritmo.ordenar(arrayDouble, arrayInt);

        algoritmo = new MergeSort();
        algoritmo.ordenar(arrayDouble, arrayInt);

        algoritmo = new QuickSort();
        algoritmo.ordenar(arrayDouble, arrayInt);
    }
}
