import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;

         for (; number != 0; number /= 10) {
            sum += number % 10; 
        }

        System.out.println("Sum of the digits: " + sum);
        scanner.close();
    }
}
