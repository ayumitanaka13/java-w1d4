import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int magicNumber = (int)(Math.random() * 101);

        System.out.println("Guess a magic number between 1 and 100:");

        int guess = -1;
        
        while (guess != magicNumber) {
            System.out.println("Enter your guess: ");
            guess = input.nextInt();
            if (guess == magicNumber) {
                System.out.println("Your are correct, the answer is " + magicNumber);
            } else if (guess > magicNumber) {
                System.out.println("Your guess was too high");
            } else {
                System.out.println("Your guess was too low");
            }

        }

    }    
    
}
