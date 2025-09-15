package assignment4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double costPerHour = Double.parseDouble(scanner.nextLine());

        Airfare airfare;

        if (choice == 1) {
            airfare = new AirIndia(hours, costPerHour);
        } else if (choice == 2) {
            airfare = new KingFisher(hours, costPerHour);
        } else if (choice == 3) {
            airfare = new Indigo(hours, costPerHour);
        } else {
            airfare = null;
        }

        if (airfare != null) {
            airfare.display();
        }

        scanner.close();
    }
}
