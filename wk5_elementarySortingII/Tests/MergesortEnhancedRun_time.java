package com.company.wk5_elementarySortingII.Tests;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk4_elementarySortingI.Sorts_starter_code;
import com.company.wk5_elementarySortingII.MergeSortEnhanced;

public class MergesortEnhancedRun_time {
    public static void MergesortEnhancedRun_time(int[][] arr, int[] dataCount, Stopwatch timer, NanoTime nanoTimer){
        // creating objects that be used in tests
        MergeSortEnhanced ob1 = new MergeSortEnhanced();
        Sorts_starter_code test = new Sorts_starter_code();

        StdOut.println("\n-------------Timing performance of MergeSortEnhanced\n\n***************************** Merge Sort Enhanced testing Time *****************************************\n");

        for (int i = 0; i< arr.length; i++) {
            if (i < 2) {
                StdOut.println("Unsorted Array");
                test.helperPrintArr(arr[i]); // prints unsorted arr for first two tests
            }
            MergeSortEnhanced.mergeSortEnhanced.sortEnhanced(arr[i], 0 , arr[i].length-1);
            StdOut.println("Sorted Array");
            if (i < 4)
                test.helperPrintArr(arr[i]); // no room to print out inputs100000

            StdOut.println("\nTest " + i +" - " + dataCount[i]  + " inputs\n" + "elapsed time = " + timer.elapsedTime());
            StdOut.println("Elapsed time (nano seconds) = " + nanoTimer.elapsedTime() + "\n************************** Next Test *****************************************\n");
        }
        // *********************************************************************************************************************************************8
    }
}
