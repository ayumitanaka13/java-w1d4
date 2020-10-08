import java.util.Scanner;

public class CalculateTip {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide your subtotal");

        double subTotal = input.nextDouble();

        System.out.println("Please provide gratuity rate");

        int gratuity = input.nextInt();

        double gratuityDecimal = gratuity * 0.01;

        double total = subTotal + (subTotal * gratuityDecimal);

        System.out.println("The total is " + total);

    }

}