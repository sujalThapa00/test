import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a word to reverse: ");
        String word = scanner.nextLine();

       
        String reversedWord = new StringBuilder(word).reverse().toString();

        
        System.out.println("Reversed word: " + reversedWord);
         scanner.close();
    }
}
