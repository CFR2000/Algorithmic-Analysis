package com.company.UsefulMethods4AnalysisingAlgos;

import com.company.wk1.Stopwatch;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class makeReport {

    public static void makeReport(int[][] arr, String pathname, Stopwatch time, NanoTime nanoTimer) {
        for (int i = 0; i != arr.length; i++) {
            try {
                File test1 = new File(pathname);
                if (!test1.exists()) {
                    test1.createNewFile();
                }

                java.io.FileWriter fileWriter = new FileWriter(test1.getName(), true);
                BufferedWriter bw = new BufferedWriter(fileWriter);
                bw.write("\nDocumenting the timing of this algorithm\n " + "Test " + i + " : \n\tTime in nanoSeconds = " + nanoTimer.elapsedTime() + "\n\tTime in seconds = " + time.elapsedTime() + "\n");
                bw.close();
//                System.out.println("Done");

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}
