package com.doshin.sort;

public class MergeSort {

	public static int[] doMergeSort(int[] array, int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middleIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(array, lowerIndex, middleIndex);
			doMergeSort(array, middleIndex + 1, higherIndex);
			mergeParts(array, lowerIndex, middleIndex, higherIndex);

		}
		return array;
	}

	private static void mergeParts(int[] array, int lowerIndex, int middleIndex, int higherIndex) {

		int[] tempMergArr = new int[higherIndex + 1];
		for (int index = lowerIndex; index <= higherIndex; index++) {
			tempMergArr[index] = array[index];
		}

		int i = lowerIndex;
		int j = middleIndex + 1;
		int k = lowerIndex;

		while (i <= middleIndex && j <= higherIndex) {
			if (tempMergArr[i] < tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;

		}
		while (i <= middleIndex) {
			array[k] = tempMergArr[i];
			i++;
			k++;
		}
		while (j <= higherIndex) {
			array[k] = tempMergArr[j];
			j++;
			k++;
		}

	}

}
