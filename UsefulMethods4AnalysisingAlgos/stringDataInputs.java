package com.company.UsefulMethods4AnalysisingAlgos;

import com.company.wk1.In;
import com.company.wk4_elementarySortingI.Sorts_starter_code;


public class stringDataInputs {

    public static String[][] stringInputs() {
        Sorts_starter_code test = new Sorts_starter_code();

        int[] dataCount = new int[]{10, 100, 1000, 10000, 100000};
        String pathName10 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\10-inputs";
        String pathName100 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\100-inputs";
        String pathName1000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\1000-inputs";
        String pathName10000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\10000-inputs";
        String pathName100000 = "C:\\Users\\Colmr\\Desktop\\algoNew\\algorithms20290-2021-repository-CFR2000\\src\\com\\company\\wk7_SubStrings\\data\\58110-inputs";
        // loading all data from data files into int[] and shuffling them
        In in0 = new In(pathName10);
        String[] data10 = in0.readAllStrings();

        In in1 = new In(pathName100);
        String[] data100 = in1.readAllStrings();

        In in2 = new In(pathName1000);
        String[] data1000 = in2.readAllStrings();

        In in3 = new In(pathName10000);
        String[] data10000 = in3.readAllStrings();

        In in4 = new In(pathName100000);
        String[] data100000 = in4.readAllStrings();

        // int[] for all int[] of data i have for testing, each int[] is shuffled
        String[][] arr = new String[][]{data10, data100, data1000, data10000, data100000};
        return arr;
    }

}