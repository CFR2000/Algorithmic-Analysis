package com.company.huffmanAssignment;
import com.company.huffmanAssignment.helper_code.*;
/******************************************************************************
 *  Compilation:  javac HuffmanAlgorithm.java
 *
 *  Compress or expand a binary input stream using the HuffmanAlgorithm algorithm.
 *
 * Add instructions and documentation related to your HuffmanAlgorithm algorithm here...
 *
 ******************************************************************************/

    /**
     *  Add in your information about each method etc. here
     *
     *
     *  @author Colm Rooney (19428806)
     */
    public class HuffmanAlgorithm {
        private static BinaryIn binaryin;
        private static BinaryOut binaryout;
        // alphabet size of extended ASCII
        private static final int R = 256;

        // Do not instantiate.
        private HuffmanAlgorithm() { }

        // HuffmanAlgorithm trie node
        private static class Node implements Comparable<Node> {
            private final char ch;
            private final int freq;
            private final Node left, right;

            Node(char ch, int freq, Node left, Node right) {
                this.ch    = ch;
                this.freq  = freq;
                this.left  = left;
                this.right = right;
            }

            // is the node a leaf node?
            private boolean isLeaf() {
                assert ((left == null) && (right == null)) || ((left != null) && (right != null));
                return (left == null) && (right == null);
            }

            // compare, based on frequency
            public int compareTo(Node that) {
                return this.freq - that.freq;
            }
        }

        /**
         * Reads a sequence of 8-bit bytes from standard input; compresses them
         * using HuffmanAlgorithm codes with an 8-bit alphabet; and writes the results
         * to standard output.
         */
        public static void compress() {
            // read the input
            String string = binaryin.readString();
            char[] input = string.toCharArray();


            // tabulate frequency counts
            int[] freq = new int[R];
            int i = 0;
            while(i<input.length){
                freq[input[i]]++;
                i++;
            }
            // build HuffmanAlgorithm trie
            Node root = buildTrie(freq);

            // build code table
            String[] string2 = new String[R];
            buildCode(string2, root, "");


            // print trie for decoder
            writeTrie(root);
            // print number of bytes in original uncompressed message
            binaryout.write(input.length);

            // use HuffmanAlgorithm code to encode input
            for (int j = 0; j < input.length; j++) {
                String code = string2[input[j]];
                for (int k = 0; k < code.length(); k++) {
                    if (code.charAt(k) == '0') {
                        binaryout.write(false);
                    }
                    else if (code.charAt(k) == '1') {
                        binaryout.write(true);
                    }
                    else throw new IllegalStateException("Illegal state");
                }
            }

            // close output stream
            binaryout.close();

        }


        /**
         * Reads a sequence of bits that represents a HuffmanAlgorithm-compressed message from
         * standard input; expands them; and writes the results to standard output.
         */
        public static void decompress() {

            // read in HuffmanAlgorithm trie from input stream
            Node root = readTrie();

            // number of bytes to write
            int length = binaryin.readInt();

            // decode using the HuffmanAlgorithm trie
            for (int i = 0; i < length; i++) {
                Node x = root;
                while (!x.isLeaf()) {
                    boolean bit = binaryin.readBoolean();
                    if (bit) x = x.right;
                    else     x = x.left;
                }
                binaryout.write(x.ch, 8);
            }
            binaryout.close();
        }

        // build the HuffmanAlgorithm trie given frequencies
        private static Node buildTrie(int[] freq) {

            // initialize priority queue with singleton trees
            MinPQ<Node> pq = new MinPQ<Node>();
            for (char i = 0; i < R; i++)
                if (freq[i] > 0)
                    pq.insert(new Node(i, freq[i], null, null));

            // special case in case there is only one character with a nonzero frequency
            if (pq.size() == 1) {
                if (freq['\0'] == 0) pq.insert(new Node('\0', 0, null, null));
                else                 pq.insert(new Node('\1', 0, null, null));
            }

            // merge two smallest trees
            while (pq.size() > 1) {
                Node left  = pq.delMin();
                Node right = pq.delMin();
                Node parent = new Node('\0', left.freq + right.freq, left, right);
                pq.insert(parent);
            }
            return pq.delMin();
        }


        // write bit string-encoded trie to standard output
        private static void writeTrie(Node x) {
            if (x.isLeaf()) {
                binaryout.write(true);
                binaryout.write(x.ch, 8);
                return;
            }
            binaryout.write(false);
            writeTrie(x.left);
            writeTrie(x.right);
        }

        // make a lookup table from symbols and their encodings
        private static void buildCode(String[] st, Node x, String s) {
            if (!x.isLeaf()) {
                buildCode(st, x.left,  s + '0');
                buildCode(st, x.right, s + '1');
            }
            else {
                st[x.ch] = s;
            }
        }



        private static Node readTrie() {
            boolean isLeaf = binaryin.readBoolean();
            if (isLeaf) {
                return new Node(binaryin.readChar(), -1, null, null);
            }
            else {
                return new Node('\0', -1, readTrie(), readTrie());
            }
        }

        // Command line usages. & Error messages
        private static void usage() {
            System.out.println();
            System.out.println("java HuffmanCompression compress filename output filename");
            System.out.println("OR");
            System.out.println("java HuffmanCompression decompress filename output filename");
            System.out.println();
            System.out.println("Options:");
            System.out.println("\t-c\tCompress input file into output file");
            System.out.println("\t-d\tDecompress input file into output file");
            System.out.println();
        }

        /**
         * Sample client that calls {@code compress()} if the command-line
         * argument is "compress" an {@code decompress()} if it is "decompress".
         *
         * @param args the command-line arguments
         */
        public static void main(String[] args) {

            //Timing
            long startTime = System.nanoTime();

            if (args.length == 3) {
                binaryin = new BinaryIn(args[1]);
                binaryout = new BinaryOut(args[2]);
                if (args[0].equals("compress")) {


                    compress();
                }
                else if (args[0].equals("decompress")) {
                    decompress();
                }
                else {
                    usage();
                }
            }
            else {
                usage();
            }

            //More Timing
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time Taken: " + (duration/Math.pow(10,9)) + "s");

        }

    }
