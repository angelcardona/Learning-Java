import java.util.Scanner;

public class Califications {
    public static void main(String[] args) {
        double []mathClas,phisicClas,languajeClas;
        int sumMath=0,sumPhisic=0,sumLanguaje=0;
        
        

        mathClas=new double [7];
        phisicClas=new double[7];
        languajeClas=new double[7];
        

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 7 califications for math students");
        for(int i=0;i<mathClas.length;i++){
            mathClas[i]=scanner.nextDouble();
        }
        System.out.println("Enter 7 califications for phisics students");
        for (int i=0;i < phisicClas.length;i++){
            phisicClas[i]=scanner.nextDouble();

        }
        System.out.println("Enter 7 califications for languaje students");
        for (int i=0; i<languajeClas.length;i++){
            languajeClas[i]=scanner.nextDouble();
        }
        for(int i =0;i<7;i++){
            sumMath +=mathClas[i];
            sumPhisic +=phisicClas[i];
            sumLanguaje +=languajeClas[i];
             
        }
        double avgMath=sumMath/mathClas.length;
        double avgPhisic=sumPhisic/phisicClas.length;
        double avgLanguge=sumLanguaje/languajeClas.length;

        double total=avgLanguge+avgMath+avgPhisic;
    
        
        System.out.println("Average  Math class =" + avgMath);
        System.out.println("Average Phisic class =" + avgPhisic);
        System.out.println("Average Languaje class =" + avgLanguge);
        System.out.println("Average of course = "+ total/3);

        System.out.println("Enter the student id");
        int id =scanner.nextInt();
        double avgstudent=(languajeClas[id]+mathClas[id]+phisicClas[id])/3;
        System.out.println("Average student " + id + " : " + avgstudent); 

    }
}
