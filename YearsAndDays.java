import java.util.Scanner;

public class YearsAndDays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int minutesPerYear = 525600;
        final int minutesPerDay = 1440;

        System.out.println("Please provide minutes: ");
        int minutes = input.nextInt();

        int years = minutes / minutesPerYear;
        int remainder = minutes % minutesPerYear;
        int days = remainder / minutesPerDay;

        System.out.println(years + " years " + days + " days ");

    }    
    
}

