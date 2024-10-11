// PA2B 
// By Jason Mansour

import java.util.Scanner;

public class pa2_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input of variables
        System.out.print("Enter a b c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // d = b^2 - 4ac
        double d = b * b - 4 * a * c;
        
        // roots will be imaginary when there is a negative discriminant and two distinct when positive and zero when one root
        if (d < 0) {
            System.out.println("Roots: imaginary");
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f%n", root);
        } else {
            double root1 = (-b - Math.sqrt(d)) / (2 * a);
            double root2 = (-b + Math.sqrt(d)) / (2 * a);

            // Roots in increasing order
            if (root1 < root2) {
                System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
            } else {
                System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
            }
        }
        input.close();
    }
}
