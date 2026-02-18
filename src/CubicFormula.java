import java.util.Scanner;

public class CubicFormula {

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("please enter a value A:");
        double valueA = keyboard.nextDouble();

        System.out.println("please enter a value B:");
        double valueB = keyboard.nextDouble();

        System.out.println("please enter a value C:");
        double valueC = keyboard.nextDouble();

        System.out.println("please enter a value D:");
        double valueD = keyboard.nextDouble();

        double p = (3 * valueA * valueC - Math.pow(valueB, 2)) / (3 * Math.pow(valueA, 2));
        double q = (27 * Math.pow(valueA, 2) * valueD - 9 * valueA * valueB * valueC + 2 * Math.pow(valueB, 3)) / 27
                * Math.pow(valueA, 3);
        double theta = 1.0 / 3 * Math.acos(-q / (2 * Math.sqrt(-Math.pow(p / 3, 3))));

        // the equasions for x1, x2, and x3 repeat these two calucations
        // seg = segment
        double SEG_ONE = 2 * Math.sqrt(-p / 3);
        double SEG_TWO = valueB / (3 * valueA);

        double xOne = SEG_ONE * Math.cos(theta) - SEG_TWO;
        double xTwo = SEG_ONE * Math.cos(theta + 2 * Math.PI / 3) - SEG_TWO;
        double xThree = SEG_ONE * Math.cos(theta + 4 * Math.PI / 3) - SEG_TWO;

        System.out.println("your roots are (" + xOne + ", 0), " + xTwo + ", 0) and " + xThree + ", 0).");
        keyboard.close();
    }
}
