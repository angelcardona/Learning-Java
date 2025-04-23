public class Methods {
    public static void main(String[] args) {
        //Instance methods
        myMethod();
        otherMethod();
        //Argument
        nameUser("Miguel");
        adittion(3, 4);
        int result=adit(4, 5);
        System.out.println(result);
        double resta=sustration(3, 4);
        System.out.println(resta);
    }
    //Declare methods
    static void myMethod(){
        System.out.println("Hello Buddy");
    }
    static void otherMethod(){
        System.out.println("i'm glad to see you again");
    }
    //Puting parameters
    static void nameUser(String name){
        System.out.println("Hello" + name);
    }
    //Putting more than one parameter
    static void adittion(int x,int y){
        System.out.println(x+y);
    }
    //value of return
    static int adit(int a, int b){
        return a + b ;
    }
    static double sustration(double x,double y){
        return x/y;
    }
}
 