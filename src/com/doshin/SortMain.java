package com.doshin;

import java.util.Random;

import com.doshin.sort.InsertionSort;
import com.doshin.sort.MergeSort;
import com.doshin.sort.SelectionSort;

public class SortMain {

	public static void main(String[] args) {
		
		int start = 1000;
		int power = 100;
		
		int[] arrSS = null;
		int[] arrIS = null;
		int[] arrMS = null;
		int[] arrQS = null;

		
	    Random randomGenerator = new Random();
	    
	    
		System.out.println("Time for sorting ");
		System.out.println("Array Length\tSelection Sort\tInsertion Sort\tMerge Sort\tQuick Sort");

		
		for(int increment = 0; increment < power; increment++) {
			arrSS = new int[(int)(start + start*increment)];
			arrIS = new int[(int)(start + start*increment)];
			arrMS = new int[(int)(start + start*increment)];
			arrQS = new int[(int)(start + start*increment)];
			
			for(int i = 0; i < (start + start*increment); i++) {
			      int randomInt = Math.abs(randomGenerator.nextInt());
			      arrSS[i] = randomInt;
			      arrIS[i] = randomInt;
			      arrMS[i] = randomInt;
			      arrQS[i] = randomInt;
			}
			long startTime;
			long endTime;
			double milli;
			
			startTime = System.nanoTime();
			SelectionSort.doSelectionSort(arrSS);
			endTime = System.nanoTime();
			milli = (double)(endTime - startTime)/1000000;
			System.out.print(arrSS.length + "\t" + milli);
			
			startTime = System.nanoTime();
			int arr2[] = InsertionSort.doInsertionSort(arrIS);
			endTime = System.nanoTime();
			milli = (double)(endTime - startTime)/1000000;
			System.out.print("\t" + milli);

			startTime = System.nanoTime();
			MergeSort.doMergeSort(arrMS,0,arrMS.length-1);
			endTime = System.nanoTime();
			milli = (double)(endTime - startTime)/1000000;
			System.out.print("\t" + milli);
			System.out.print("\n");

			
			
		}

	}


	

	

	

}
