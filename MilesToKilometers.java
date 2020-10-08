public class MilesToKilometers {

    public static void main(String[] args) {

        final double kiloPerMile = 1.609;

        System.out.println("Miles Kilometers");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " " + (i * kiloPerMile));
        }
    }        
}
