package com.company.wk7_SubStrings.tests;

import com.company.UsefulMethods4AnalysisingAlgos.NanoTime;
import com.company.wk1.StdOut;
import com.company.wk1.Stopwatch;
import com.company.wk7_SubStrings.Knuth_Morris_Pratt;
import com.company.wk7_SubStrings.bruteForcePatSearch;

public class bruteForcePatSearchRun_time {

        public static void bruteForcePatSearchRun_time(String[][] inputs, int[] dataCount, String[] targets, Stopwatch timer, NanoTime nanoTimer) {
            bruteForcePatSearch bFPS = new bruteForcePatSearch();
            StdOut.println("\n-------------Timing performance of Brute Force Pattern Search\n\n***************************** Brute Force Pattern Search testing Time *****************************************\n");

            for (int i = 0; i < inputs.length; i++) {
                int line = 0;
                int tar = 0;
                for (int j = 0; j < inputs[i].length -1; j++) {
                    line++;
                    if (inputs[i][j].contains(targets[i])) {
                        int results = bFPS.bruteForcePatSearch(inputs[i][j], targets[i]);
                        StdOut.println("Line " + line + " : \nFound pattern at index "+ results);
                        break;
                    }
                }


                StdOut.println("\nTest " + i + " - " + dataCount[i] + " inputs\n" + "elapsed time = " + timer.elapsedTime());
                StdOut.println("Elapsed time (nano seconds) = " + nanoTimer.elapsedTime() + "\n************************** Next Test *****************************************\n");
            }
        }
    }
