# comp20290-algorithms-2021

This repo is owned and completely solely by Colm Rooney (19428806)

Breakdown of Project file system.
**
Practical Resources Folder**
  -> Contains an analysis folder for each practical session
    -> inside this folder you will find : 
        - PDF document analysising the time and space complexity of the alorithms studied that week
            - Comparing the timing against eachother to locate the most efficent algorithm of the lot.
        - Txt files containing the timing results of the test cases on the algorithm
        - Excel spreadsheet with detailed graphs, singular and comparison.

Inside the src/com/company folder you will find packages, one for each week of practicals (up to wk8_tries completed) aswell as a package (UsefulMethods4AnalysisingAlgos)
which contains classes and methods that i employed regurlarly throughout the semester to test, time, record, graph and document my findings.


All classes withms the "wk#" packages are runable.
Recommened running the "wk#Main" of each package to view the alorithms in actions the timing results of each circumstance.

Test cases!

In cases where the alorithms requires numbers (wk2 -> wk6), 5 data files are used which are created from the clases dataInputs.java from the UsefulMethods4AnalysisingAlgos package
  data set from:
  0-9
  0-99
  0-999
  0-9999
  0-99999
  
  In cases where the algorithm requires string to analyze (wk7),5 data files are used which are created from the class stringDataInputs.java from the UsefulMethods4AnalysisingAlgos package
  number of words used:
    10
    100
    1000
    10000
    58110
    
    
 This is the entire breakdown of my repository and testing system. If you have any questions regarding tests cases for implementations of the algorithms please do not hesitate to contact me. 
 My email: colm.rooney@ucdconnect.ie


***************************

Huffman assignment - compiling and running commands

*************************************

Compile - javac com\company\huffmanAssignment\HuffmanAlgorithm.java
Run - java com/company/huffmanAssignment/HuffmanAlgorithm compress com/company/huffmanAssignment/dataFiles/mobydick.txt com/company/huffmanAssignment/dataFiles/mobydick_compressed.txt

RunLength compress - java com/company/huffmanAssignment/helper_code/RunLength - < com/company/huffmanAssignment/dataFiles/q32x48.bin 
RunLength decompress - java com/company/huffmanAssignment/helper_code/RunLength - < com/company/huffmanAssignment/dataFiles/q32x48.bin
