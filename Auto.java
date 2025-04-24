public class Auto {
    
    private String model;
    private String color;
    private double cylinder;
    private String price;
    private int capacityTank = 40;
    private String brand;

    // Constructor vacío
    public Auto() {
        this("", "", "", "", 0);
    }

    // Constructor con parámetros
    public Auto(String model, String color, String brand, String price, double cylinder) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.cylinder = cylinder;
    }

    // Getters y Setters
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

    // Métodos
    public String detail() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: " + this.brand);
        sb.append("\nModel: " + this.model);
        sb.append("\nColor: " + this.color);
        sb.append("\nCylinder: " + this.cylinder);
        sb.append("\nPrice: " + this.price);
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

    public float calculateIntake(int km, float percentGas) {
        return km / (capacityTank * percentGas);
    }
}
