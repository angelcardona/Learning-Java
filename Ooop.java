import java.util.Scanner;

public class Ooop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto.VehicleType vt = null;

        // Showing available vehicle types
        System.out.println("Choose a type of vehicle:");
        for (Auto.VehicleType type : Auto.VehicleType.values()) {
            System.out.println("- " + type.getName() + " (Doors: " + type.getNumberDoors() + ", Description: " + type.getDescription() + ")");
        }

        // Loop to allow retrying invalid vehicle type input
        while (vt == null) {
            System.out.println("Enter the vehicle type (e.g., SEDAN, PICKUP):");
            String typeChoose = scanner.nextLine().toUpperCase();
            try {
                vt = Auto.VehicleType.valueOf(typeChoose);
                System.out.println("You chose: " + vt.getName());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid vehicle type. Please try again.");
            }
        }

        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        String price = scanner.nextLine();

        System.out.print("Enter cylinder: ");
        String cylinderInput = scanner.nextLine();
        double cylinder;
        try {
            cylinder = Double.parseDouble(cylinderInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid cylinder value. Using default value 0.");
            cylinder = 0;
        }

        // Create Auto object with vehicleType
        Auto auto = new Auto(model, color, brand, price, cylinder, vt);

        // Display results
        System.out.println(auto.toString());
        System.out.println("Reference Color: " + Auto.getReferenceColor());
        System.out.println("Max Speed: " + Auto.MAX_SPEED);
        System.out.println("Chosen Vehicle Type: " + vt.getName());

        scanner.close();
    }
}