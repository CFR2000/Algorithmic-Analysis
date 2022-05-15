package com.company.wk5_elementarySortingII;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.UsefulMethods4AnalysisingAlgos.dataInputs;
import com.company.wk4_elementarySortingI.Tests.InsertionSortRun_time;
import com.company.wk5_elementarySortingII.Tests.MergesortEnhancedRun_time;
import com.company.wk5_elementarySortingII.Tests.MergesortRun_time;
import static com.company.wk4_elementarySortingI.Sorts_starter_code.*;

public class wk5Main {

    public int[][] arr;
    public static void shuffle(int[][] arr){
        for (int i = 0; i< arr.length; i++)
            helperShuffle(arr[i]);
    }

    public static void main(String[] args) {
        int[] dataCount = new int[]{10,100,1000,10000,100000};
        dataInputs data1 = new dataInputs();
        int[][] arr = data1.inputs(); // int[] for all int[] of data i have for testing, each int[] is shuffled


        // Q1
        Stopwatch timerMergeSort = new Stopwatch();
        NanoTime nanoTimer = new NanoTime();
        MergesortRun_time.MergesortRun_time(arr, dataCount, timerMergeSort, nanoTimer);


        StdOut.println("******************************* Insertion sort testing time ********************************************\n");
        shuffle(arr); // reshuffling sorted arrays
        Stopwatch timerInsertionSort = new Stopwatch();
        NanoTime nanoTimer2 = new NanoTime();
        InsertionSortRun_time.InsertionSortRun_time(arr, dataCount, timerInsertionSort, nanoTimer2);

        // Q2
        int[] lessThanTenArr = {2,4,7,3,4,89,4};
        int[] sortedArray = {1,2,3,4,5,6,8,9,10,11,12};

        StdOut.println("Q2. \nTesting the enhanced methods on merge Sort");
        // Uses insertion sort when input data is 10 or below.
        Stopwatch timerQ2one = new Stopwatch();
        NanoTime nanoTimer3 = new NanoTime();
        MergesortEnhancedRun_time.MergesortEnhancedRun_time(arr, dataCount, timerQ2one, nanoTimer3);

        // checks that returns array when it is already sorted.
        Stopwatch timerQ2two = new Stopwatch();
        NanoTime nanoTimer4 = new NanoTime();
        MergesortEnhancedRun_time.MergesortEnhancedRun_time(arr, dataCount, timerQ2two, nanoTimer4);

        // Q3 - Compare the performance of the 3 algorithms.
        shuffle(arr); //reshuffling arrays
        StdOut.println("Q3. \n************************** Timing Enhanced Merge Sort *****************************\n\t\t\t\t\t and comparing with other.");
        Stopwatch timerMergeSortEnhanced = new Stopwatch();
        NanoTime nanoTimer5 = new NanoTime();
        MergesortEnhancedRun_time.MergesortEnhancedRun_time(arr, dataCount, timerMergeSortEnhanced, nanoTimer5);

    }
}
