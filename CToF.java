import java.util.Scanner;

public class CToF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please provide a temp in Celcius: ");

        double celcius = input.nextDouble();

        double fahrenheit = (1.8 * celcius) + 32;

        System.out.println(fahrenheit + " F");

    }    
    
}
