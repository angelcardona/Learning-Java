import java.util.Scanner;

public class Ooop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        String price = scanner.nextLine();

        System.out.print("Enter cylinder: ");
        double cylinder = scanner.nextDouble();

        Auto auto = new Auto(model, color, brand, price, cylinder);

        System.out.println("\n--- Car Details ---");
        System.out.println(auto.detail());

        System.out.println("\nThrottle/Brakes Simulation:");
        System.out.println(auto.throttleBrakes(3000));
    }
}
