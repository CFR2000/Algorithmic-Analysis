package com.company.UsefulMethods4AnalysisingAlgos;

public class NanoTime {


        private final long start;

        /**
         * Initializes a new stopwatch.
         */
        public NanoTime() {
            start = System.nanoTime();
        }


        /**
         * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
         *
         * @return elapsed CPU time (in seconds) since the stopwatch was created
         */
        public double elapsedTime() {
            long estimatedTime = System.nanoTime() - start;
            return estimatedTime;
        }
}
