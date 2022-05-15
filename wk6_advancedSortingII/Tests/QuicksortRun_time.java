package com.company.wk6_advancedSortingII.Tests;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk4_elementarySortingI.Sorts_starter_code;
import com.company.wk6_advancedSortingII.QuickSort;

public class QuicksortRun_time {

    public static void QuicksortRun_time(int[][] arr, int[] dataCount, Stopwatch timer, NanoTime nanoTimer){
        // creating objects that be used in tests
        QuickSort ob1 = new QuickSort();
        Sorts_starter_code test = new Sorts_starter_code();

        StdOut.println("Q1. \n-------------Timing performance of Quicksort\n\n***************************** Quicksort Sort testing Time *****************************************\n");
        for (int i = 0; i< arr.length; i++) {
            test.helperShuffle(arr[i]);
            if (i < 2) {
                StdOut.println("Unsorted Array");
                test.helperPrintArr(arr[i]); // prints unsorted arr for first two tests
            }
            ob1.sort(arr[i]);
            if (i<4) {
                StdOut.println("Sorted Array");
                test.helperPrintArr(arr[i]);
            }
            StdOut.println("\nTest " + i +" - " + dataCount[i]  + " inputs\n" + "elapsed time = " + timer.elapsedTime());
            StdOut.println("Elapsed time (nano seconds) = " + nanoTimer.elapsedTime() + "\n************************** Next Test *****************************************\n");
        }
        // *********************************************************************************************************************************************8
    }
}
