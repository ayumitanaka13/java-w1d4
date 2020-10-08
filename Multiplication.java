// Write a program that uses nested for loops to display a multiplication table.

public class Multiplication {

    public static void main(String[] args) {

        int a;
        int b;
        int sum;

        for (a = 1; a <= 9; ++a) {
            for (b = 1; b <= 9; ++b) {
                sum = a * b;
                System.out.print(sum);
                if (sum < 10) {
                    System.out.print("    ");
                } else if (sum >= 10){
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }    
    
}
