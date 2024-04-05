public class MathUtilsMain {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Call the MathUtils method with some integers
        int sumAdd = mathUtils.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        // Declaring integers a and b so I can see these in the results
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("The sum of integers " + a + " and " + b + " = " + sumAdd);

        // Call the MathUtils method with some doubles - this is the overloaded method
        double sumAddDouble = mathUtils.add(Double.parseDouble(args[2]), Double.parseDouble(args[3]));

        // Declaring doubles aD and bD so I can see these in the results
        double aD = Double.parseDouble(args[2]);
        double bD = Double.parseDouble(args[3]);

        System.out.println("The sum of doubles " + aD + " and " + bD + " = " + sumAddDouble);
    }
}
