import java.util.Scanner;


public class Scan {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please Introduce your name:");
        String name = scanner.nextLine();

        System.out.print("Please Introduce your age:");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);

        System.out.print("Please Introduce your profession:");
        String profession = scanner.nextLine();

        System.out.println("Name :"+name);
        System.out.println("age :" + age);
        System.out.println("Profession :" +profession);

    }
   
    


    
}
