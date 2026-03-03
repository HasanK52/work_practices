import java.util.Scanner;
public class hesap_makinesi {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter choice (1/2/3/4): ");
        char choice = scanner.next().charAt(0);

        if (choice < '1' || choice > '4') {
            System.out.println("Invalid Input");
            return;
        }

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case '1':
                System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
                break;
            case '2':
                System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                break;
            case '3':
                System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                break;
            case '4':
                double result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
        }

        scanner.close();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            return Double.NaN; // NaN represents an undefined or unrepresentable value
        }
    }
}

