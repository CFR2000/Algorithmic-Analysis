package com.company.wk4_elementarySortingI.Tests;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk4_elementarySortingI.Sorts_starter_code;
import static com.company.wk4_elementarySortingI.Sorts_starter_code.helperPrintArr;

public class InsertionSortRun_time {
    public static void InsertionSortRun_time(int[][] arr, int[] dataCount, Stopwatch timer, NanoTime nanoTimer) {

        // creating objects that be used in tests
        Sorts_starter_code test = new Sorts_starter_code();

        for (int i = 0; i < arr.length; i++) {
            test.helperShuffle(arr[i]);
            test.insertionSort(arr[i]);
            if (i < 4)
                helperPrintArr(arr[i]);
            StdOut.println("\nTest " + i + " - " + dataCount[i] + " inputs\n " + "elapsed time = " + timer.elapsedTime());
            StdOut.println("Elapsed time (nano seconds) = " + nanoTimer.elapsedTime());
            StdOut.println("\n************************** Next Test *****************************************\n");
        }
    }
}