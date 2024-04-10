/*
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 100.

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
*/
package Challenges;
import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");

        for(int inputCount=0; inputCount < 3; inputCount++){

            String string1 = scanner.next();
            int integer1 = scanner.nextInt();
            
            //% is start of the format specifier, 03 means if less than 3, add a leading 0. d specifies that this is a decimal integer
            String formattedInteger = String.format("%03d", integer1);
            
            //% is start of the format specifier, - indicates left justification, 15 is the minimum width of the string and s specifies this is string
            String formattedString = String.format("%-15s", string1);
            
            System.out.println(formattedString + formattedInteger);

        }

        scanner.close();
        System.out.println("================================");

}
}
