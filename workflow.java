import java.util.Scanner;

public class workflow {
    public static void main(String[] args) {
        //Equal
        int x = 15;
        int y = 20;
        System.out.println(x==y);
        //Not Equal
        System.out.println(x!=y);
        //Bigger than
        System.out.println(x>y);
        //short than
        System.out.println(x<y);

        //Logical Operators
        boolean a =true;
        boolean b=false;
        boolean c = a || b;
        boolean d= a && b ;
        System.out.println(c+"\t"+d );


        System.out.print("Please Itroduce your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >=18) {
            System.out.println("You could drink beer");
            
        }else{
            System.out.println("you couldn't drik beer");
        }

    }
}
