package com.exerciciostrategy;

public class BubbleSort {
	public void bubbleSort(double[] a, int n)
	// Precondition: a is array to be sorted of length n
	// Postcondition: The list a[0], a[1], ..., a[n-1] is sorted in increasing order.
	// This version sorts using bubble sort.
	{
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++)
				if (a[j] > a[j + 1]) {
					double temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
		}
	}

}