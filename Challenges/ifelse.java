package Challenges;
/*
If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
*/
import java.util.*;
import java.util.InputMismatchException;

public class ifelse {

  private static final int LOWER_BOUND_NOT_WEIRD = 2;
  private static final int UPPER_BOUND_NOT_WEIRD = 5;
  private static final int LOWER_BOUND_WEIRD = 6;
  private static final int UPPER_BOUND_WEIRD = 20;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    try {
      int N = scanner.nextInt();
      if (N < 1) {
        System.out.println("Invalid input: Please use a positive integer.");
      } else {

        if (N % 2 == 0) {
          //even
          if ((N >= LOWER_BOUND_NOT_WEIRD) && (N <= UPPER_BOUND_NOT_WEIRD)) {
            //even and within lower to upper NOT weird range
            System.out.println("Not Weird");
          } else if ((N >= LOWER_BOUND_WEIRD) && (N <= UPPER_BOUND_WEIRD)) {
            //even and within the lower and upper IS wierd range
            System.out.println("Weird");
          } else if (N >= UPPER_BOUND_WEIRD) {
            //even and greater than upper bound weird range
            System.out.println("Not Weird");
          }
        } else {
          //odd
          System.out.println("Weird");
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Invalid input: Please enter an integer.");
    } finally {
      scanner.close();
    }

  }
}