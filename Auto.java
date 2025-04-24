import java.util.Scanner;

public class Auto {
    
    private String model;
    private String color;
    private double cylinder;
    private String brand;
    
    public Auto(){
        this("","","",0);

    }
    public Auto(String model,String color,String brand,double cylinder){

        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Please enter the model of you car");
        this.model=scanner.nextLine();
        System.out.println("Please enter the color of you car");
        this.color=scanner.nextLine();
        System.out.println("Please enter the brand of you car");
        this.brand=scanner.nextLine();
        System.out.println("Please enter the cylinder of you car");
        this.cylinder=scanner.nextDouble();

    }
    public String detail(){
        StringBuilder sb=new StringBuilder();
        sb.append("Brand:" + this.brand);
        sb.append("\nModel:" + this.model);
        sb.append("\nColor:" + this.color);
        sb.append("\nCylinder:" + this.cylinder);
        return  sb.toString();

    }
   
    
}

