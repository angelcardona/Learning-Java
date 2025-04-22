public class ChangeTypes {
    
    public static void main(String[] args) {

        // Implicit Convertion
        byte x=1;
        int y= 3;
        int c = x + y ;
        System.out.println(c);

        //Explicit Convertion 
        int a = 15;
        double b= 15.015;
        int z = (int)(a+b);
        System.out.println(z);

        int f = 14;
        double e=14.045;
        int k = f + (int)e;
        System.out.println(k);

        //String to Number

        String j= "2.2";
        int t = 4;
        double l= Double.parseDouble(j)+ t;
        System.out.println(l);

        
    }
}
