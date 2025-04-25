public class Auto {

    private String model;
    private String color;
    private double cylinder;
    private String price;
    private int capacityTank = 40;
    private String brand;
    private static String referenceColor = "red";
    public static final Integer MAX_SPEED = 120;
    private VehicleType vehicleType;

    // Empty Constructor
    public Auto() {
        this("", "", "", "", 0, VehicleType.SEDAN);
    }

    // Parameterized Constructor
    public Auto(String model, String color, String brand, String price, double cylinder, VehicleType vehicleType) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.cylinder = cylinder;
        this.vehicleType = vehicleType;
    }

    // Enum
    public enum VehicleType {
        SEDAN("sedan", 5, "familiar vehicle"),
        STATION_WAGON("station wagon", 5, "familiar vehicle"),
        PICKUP("pickup", 3, "Work Vehicle"),
        COUPE("coupe", 3, "Deportive vehicle"),
        CONVERTIBLE("convertible", 2, "amazing vehicle"),
        FURGON("furgon", 3, "Work Vehicle"),
        SPORT("sport", 2, "Adventure Car");

        private final String name;
        private final int numberDoors;
        private final String description;

        VehicleType(String name, int numberDoors, String description) {
            this.name = name;
            this.numberDoors = numberDoors;
            this.description = description;
        }

        public String getName() {
            return name;
        }

        public int getNumberDoors() {
            return numberDoors;
        }

        public String getDescription() {
            return description;
        }
    }

    // Getters and Setters
    public static String getReferenceColor() {
        return referenceColor;
    }

    public static void setReferenceColor(String referenceColor) {
        Auto.referenceColor = referenceColor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCylinder() {
        return cylinder;
    }

    public void setCylinder(double cylinder) {
        if (cylinder > 0) {
            this.cylinder = cylinder;
        } else {
            System.out.println("Invalid cylinder value.");
        }
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacityTank() {
        return capacityTank;
    }

    public void setCapacityTank(int capacityTank) {
        if (capacityTank > 0) {
            this.capacityTank = capacityTank;
        } else {
            System.out.println("Invalid tank capacity.");
        }
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Methods
    public String detail() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: ").append(this.brand);
        sb.append("\nModel: ").append(this.model);
        sb.append("\nColor: ").append(this.color);
        sb.append("\nCylinder: ").append(this.cylinder);
        sb.append("\nPrice: ").append(this.price);
        sb.append("\nVehicle Type: ").append(this.vehicleType != null ? this.vehicleType.getName() : "N/A");
        return sb.toString();
    }

    public String throttle(int rpm) {
        return "The car " + this.brand + " throttles to " + rpm + " rpm.";
    }

    public String brakes() {
        return this.brand + " " + this.model + " brakes against the wall.";
    }

    public String throttleBrakes(int rpm) {
        String throttle = this.throttle(rpm);
        String brakes = this.brakes();
        return throttle + "\n" + brakes;
    }

    /**
     * Calculates fuel intake based on distance traveled and percentage of gas remaining.
     * @param km Distance traveled in kilometers
     * @param percentGas Fraction of gas remaining (e.g., 0.5 for 50%)
     * @return Fuel intake in km per liter
     */
    public float calculateIntake(int km, float percentGas) {
        if (percentGas <= 0 || percentGas > 1) {
            throw new IllegalArgumentException("percentGas must be between 0 and 1.");
        }
        return km / (capacityTank * percentGas);
    }

    @Override
    public String toString() {
        return "---Car details---\n" +
               "model=" + model +
               ", color=" + color +
               ", cylinder=" + cylinder +
               ", price=" + price +
               ", capacityTank=" + capacityTank +
               ", brand=" + brand +
               ", vehicleType=" + (vehicleType != null ? vehicleType.getName() : "N/A") +
               ", MAX_SPEED=" + MAX_SPEED;
    }
}