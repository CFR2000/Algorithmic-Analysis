package com.company.UsefulMethods4AnalysisingAlgos;

import java.io.*;

public class FileWriter {

    public FileWriter() {

    }

    public static void loadInputs(String pathname, int multiplier) {
        try {
            PrintWriter fileout = new PrintWriter(pathname);
            int i;
            for (i = 0; i < 10 * multiplier; i++) {
                fileout.println(i);
            }
            fileout.close();
            System.out.print("success...");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


