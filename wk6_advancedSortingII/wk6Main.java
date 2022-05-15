package com.company.wk6_advancedSortingII;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.UsefulMethods4AnalysisingAlgos.dataInputs;
import com.company.wk1.Stopwatch;
import com.company.wk5_elementarySortingII.Tests.MergesortRun_time;
import com.company.wk6_advancedSortingII.Tests.QuicksortEnhancedRun_time;
import com.company.wk6_advancedSortingII.Tests.QuicksortRun_time;


public class wk6Main {
    public static void main(String[] args) {
        // Testing tools
        int[] dataCount = new int[]{10,100,1000,10000,100000}; // used to keep track of amount of inputs used on tests
        dataInputs data1 = new dataInputs();
        int[][] arr = data1.inputs(); // int[] for all int[] of data i have for testing, each int[] is shuffled // holds 5 int[] with inputs ranging from 10 - 1000000

        // Q3 - Assess the performance difference between QuickSort and Enhanced

        //MergeSort
        Stopwatch mergeSortTimer = new Stopwatch(); NanoTime nanoTimeMergeSort = new NanoTime();
        MergesortRun_time.MergesortRun_time(arr, dataCount, mergeSortTimer, nanoTimeMergeSort);
//        makeReport.makeReport(arr, "MergeSort-QuickSort-QuickSortEnhanced-Timing", mergeSortTimer, nanoTimeMergeSort);
//        ***********************************************************************************************************************************************

        //QuickSort
        Stopwatch timerQuickSort = new Stopwatch(); NanoTime nanoTimerQuickSort = new NanoTime();
        QuicksortRun_time.QuicksortRun_time(arr, dataCount, timerQuickSort, nanoTimerQuickSort);
//        makeReport.makeReport(arr, "MergeSort-QuickSort-QuickSortEnhanced-Timing", timerQuickSort, nanoTimerQuickSort);

        // *********************************************************************************************************************************************

        //QuickSort Enhanced
        Stopwatch timerQuickSortEnhanced = new Stopwatch(); NanoTime nanoTimerQuickSortEnhanced = new NanoTime();
        QuicksortEnhancedRun_time.QuicksortEnhancedRun_time(arr, dataCount, timerQuickSortEnhanced, nanoTimerQuickSortEnhanced);
//        makeReport.makeReport(arr, "MergeSort-QuickSort-QuickSortEnhanced-Timing", mergeSortTimer, nanoTimerQuickSortEnhanced);



        }
    }
