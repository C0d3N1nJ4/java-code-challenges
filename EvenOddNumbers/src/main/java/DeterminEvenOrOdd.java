import java.util.Scanner;

public class DeterminEvenOrOdd {

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        EvenOdd(number);

    }

    private static void EvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
