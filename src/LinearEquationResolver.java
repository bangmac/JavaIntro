import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a :");
        double a = scanner.nextDouble();

        System.out.println("enter b :");
        double b = scanner.nextDouble();

        System.out.println("enter c :");
        double c = scanner.nextDouble();

        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        if (a != 0) {
            double result = (c-b)/a;
            System.out.printf("Equation pass with x = %f!\n", result);
        }else {
            if (b == 0) {
                System.out.print("The result is all x!");
            } else {
                System.out.print("No result!");
            }
        }
    }
}
