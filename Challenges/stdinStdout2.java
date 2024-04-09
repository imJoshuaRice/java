/*
Read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format

Output format:
Three lines of output:

1. print String: followed by the unaltered String read from stdin.
2. print Double: followed by the unaltered double read from stdin.
3. print Int: followed by the unaltered integer read from stdin.
*/

package Challenges;

import java.util.Scanner;

public class stdinStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}