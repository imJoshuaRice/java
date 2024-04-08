package Challenges;
/*
If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5, print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20, print Not Weird
*/
import java.util.*;

public class ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if (N % 2 == 0){
            //even
            if ((N >= 2) & (N <= 5)){
                //even in range 2 - 5
                System.out.println("Not Weird");
            } else if ((N >= 6) & (N <=20)){
                //even in range 6 - 20
                System.out.println("Weird");
            } else if (N >= 20){
                //even and greater than 20
                System.out.println("Not Weird");
            }
        } else {
            //odd
            System.out.println("Weird");
        }
        
    }
}
