import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();

        Scanner in = new Scanner(System.in);


        if (app.verifyStrongNumber(getAndValidateUserInput(in))) {
            System.out.println("Strong");
        } else System.out.println("NOT Strong");
    }

    static int getAndValidateUserInput(Scanner in) {
        int value = 0;
        try {
             value = in.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Please insert a number");
        }

        return value;
    }

    boolean verifyStrongNumber(int number) {
        int sum = 0;
        if (number == 0) {
            return false;
        }
        sum = calculateSumOfFactorials(number, sum);

        return sum == number;
    }

    private int calculateSumOfFactorials(int number, int sum) {
        while (number != 0) {
            sum += computeFactorial(number % 10);
            number /= 10;
        }
        return sum;
    }

    public int computeFactorial(int number) {
        int factorialValue = 1;
        for (int i = 1; i <= number; i++) {
            factorialValue *= i;
        }
        return factorialValue;
    }

}
