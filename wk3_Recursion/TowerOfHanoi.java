package com.company.wk3_Recursion;
class TowerOfHanoi {
    static int count = 1;
    public static int towerOfHanoi(int disk, char source, char dest, char auxillary) {
        // base case
        // if there is only one disk, move directly to the 3rd rod

        if (disk == 1){
            System.out.println("Move disk 1 from rod " + source + " to rod " + dest);
            return count;
    }
        else {
            // recursive cases.

            towerOfHanoi(disk - 1, source, auxillary, dest);
            count++;
            System.out.println("Move disk " + disk + " from rod " + source + " to rod " + dest);// move top disk from rod 1 to rod 3
            towerOfHanoi(disk - 1, auxillary, dest, source); // move top disk from rod 3 to rod 2
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
        int disk = 5;
        char source= 'a';
        char dest = 'c';
        char auxillary = 'b';
//
        System.out.println("Number of moves required to solve with " + disk + " disks is - " + towerOfHanoi(5, source, dest, auxillary));
        towerOfHanoi(12, source, dest, auxillary);
        towerOfHanoi(17, source, dest, auxillary);
    }
}
