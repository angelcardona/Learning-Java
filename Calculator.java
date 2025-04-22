import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Calculator that to adittion two numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter two numbers:");
        System.out.print("\nx = ");
        int x = scanner.nextInt();
        System.out.print("y = ");
        int y = scanner.nextInt();
        int sum=x+y;
        System.out.println("The result of adit " + "x=" +x +"," +" y=" +y + " :" +"\n"+sum);
        

    }
    
}
