package com.company.wk4_elementarySortingI;

import com.company.UsefulMethods4AnalysisingAlgos.FileWriter;
import com.company.UsefulMethods4AnalysisingAlgos.dataInputs;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;

import static com.company.wk4_elementarySortingI.Sorts_starter_code.*;

public class wk4Main {
    public int[][] arr;
    public static void shuffle(int[][] arr){
        for (int i = 0; i< arr.length; i++)
            helperShuffle(arr[i]);
    }

    public static void main(String[] args) {
        Sorts_starter_code test = new Sorts_starter_code();
        FileWriter testing = new FileWriter();
//
        int[] dataCount = new int[]{10,100,1000,10000,100000};
//
        // int[] for all int[] of data i have for testing, each int[] is shuffled
        int[][] arr = dataInputs.inputs(); // accesses wk5_elementarySortingII.inputs dataInputs class for the test inputs used in int[][] arr - varying from 10 - 100000


        // ***************************** Selection Sort ********************************
        StdOut.println("\nTiming case for Selection sort");
        Stopwatch timerSelectionSort = new Stopwatch();
        for (int i = 0; i< arr.length; i++) {
            test.selectionSort(arr[i]);
            StdOut.println("Test " + i +" - " + dataCount[i]  + " inputs\n " + "elapsed time = " + timerSelectionSort.elapsedTime());
            helperPrintArr(arr[i]);
        }



//        ***************************** Insertion Sort **********************************
        shuffle(arr); // shuffle arrays again to be sorted (all were sorted due to the previous sort being run on it)
        StdOut.println("\nTiming case for Insertion sort");
        Stopwatch timerInsertionSort = new Stopwatch();
        for (int j = 0; j < arr.length; j++) {
            test.insertionSort(arr[j]);
            StdOut.println("Test " + j + " - " + dataCount[j]  + " inputs\n " + "elapsed time = " + timerInsertionSort.elapsedTime());
//            helperPrintArr(arr[j]);
        }


//        ********************************* Bogo sort ****************************************
        shuffle(arr);
        StdOut.println("\nTiming case for Bogo sort");
        Stopwatch timerBogoSort = new Stopwatch();
        for (int k = 0; k< arr.length; k++) {
            test.bogoSort(arr[k]);
            StdOut.println("Test " + k + " - " + dataCount[k]  + " inputs\n " + "elapsed time = " + timerBogoSort.elapsedTime());
//            helperPrintArr(arr[k]);
        }

}
}