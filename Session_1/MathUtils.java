package Session_1;

public class MathUtils {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded add method
    public double add(double a, double b) {
        return a + b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to greet a person by name
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method to find the maximum of two integers
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Method to find the minimum of two integers
    public int min(int a, int b) {
        return (a < b) ? a : b;
    }
}
