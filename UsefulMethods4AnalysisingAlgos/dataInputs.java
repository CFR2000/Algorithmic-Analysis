package com.company.UsefulMethods4AnalysisingAlgos;

import com.company.wk1.In;
import com.company.wk4_elementarySortingI.Sorts_starter_code;


public class dataInputs {

    public static int[][] inputs() {
        Sorts_starter_code test = new Sorts_starter_code();

        int[] dataCount = new int[]{10, 100, 1000, 10000, 100000};
        String pathName10 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk4_elementarySortingI\\data\\inputs-10";
        String pathName100 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk4_elementarySortingI\\data\\inputs-100";
        String pathName1000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk4_elementarySortingI\\data\\inputs-1000";
        String pathName10000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk4_elementarySortingI\\data\\inputs-10000";
        String pathName100000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk4_elementarySortingI\\data\\inputs-100000";
        // loading all data from data files into int[] and shuffling them
        In in0 = new In(pathName10);
        int[] data10 = in0.readAllInts();
        test.helperShuffle(data10);

        In in1 = new In(pathName100);
        int[] data100 = in1.readAllInts();
        test.helperShuffle(data100);

        In in2 = new In(pathName1000);
        int[] data1000 = in2.readAllInts();
        test.helperShuffle(data1000);

        In in3 = new In(pathName10000);
        int[] data10000 = in3.readAllInts();
        test.helperShuffle(data10000);


        In in4 = new In(pathName100000);
        int[] data100000 = in4.readAllInts();
        test.helperShuffle(data100000);

        // int[] for all int[] of data i have for testing, each int[] is shuffled
        int[][] arr = new int[][]{data10, data100, data1000, data10000, data100000};
        return arr;
    }

}