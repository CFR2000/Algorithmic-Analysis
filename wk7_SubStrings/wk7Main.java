package com.company.wk7_SubStrings;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.UsefulMethods4AnalysisingAlgos.dataInputs;
import com.company.UsefulMethods4AnalysisingAlgos.stringDataInputs;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk7_SubStrings.tests.KMP_searchRun_time;
import com.company.wk7_SubStrings.tests.bruteForcePatSearchRun_time;

public class wk7Main {

    public static void main(String[] args) {
        stringDataInputs data1 = new stringDataInputs();
        String[][] arr = data1.stringInputs(); // int[] for all int[] of data i have for testing, each int[] is shuffled

        String[] targets = new String[]{"form", "inic" , "stroy", "eet", "oom"}; // informational, clinic, destroy, sweet, zoom
        int[] dataCount = new int[]{10,100,1000,10000,58110};

        Stopwatch bfTime = new Stopwatch();
        NanoTime bfNanoTime = new NanoTime();
        bruteForcePatSearchRun_time.bruteForcePatSearchRun_time(arr, dataCount, targets, bfTime, bfNanoTime);

        StdOut.println("\n\n\n******************************** Next AlgoTest ********************************\n\n\n");

        Stopwatch KMPtimer = new Stopwatch();
        NanoTime KMPnanoTimer = new NanoTime();
        KMP_searchRun_time.KMP_searchRun_time(arr, dataCount, targets, KMPtimer, KMPnanoTimer);




    }
}
