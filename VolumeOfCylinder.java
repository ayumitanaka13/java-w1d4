import java.util.Scanner;

public class VolumeOfCylinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double pi = 3.1415;

        System.out.println("Please enter a radius: ");

        double radius = input.nextDouble();

        System.out.println("Please enter a height: ");

        double height = input.nextDouble();

        double area = Math.pow(radius, 2) * pi;

        double volume = area * height;

        System.out.println("The volume of this cylinder is =  " + volume);

    }
    
}
