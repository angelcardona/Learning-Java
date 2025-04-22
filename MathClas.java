public class MathClas {
    public static void main(String[] args) {
        //Absolute Value abs()
        int x=Math.abs(-10);
        System.out.println(Math.abs(-15));
        System.out.println(x);

        //Aproxim ceil()
        double y=Math.ceil(10.1);
        System.out.println(y);
        System.out.println(Math.ceil(10.1));
        
        //floor ()

        double t= Math.floor(10.9);
        System.out.println(t);
        System.out.println(Math.floor(10.9));

        //Max number max()

        int i =4;
        int e=5;
        System.out.println(Math.max(i, e));

        //Min number min()

        System.out.println(Math.min(i, e));

        // Round more close round()
        float l= 15.3f;
        System.out.println(Math.round(l));

        //Aleatory Number between cero and one random ()
        double u = Math.random();
        System.out.println(u);


        //Aleatory number between cero and houndred random * 100
        double v =Math.random();
        System.out.println((int)(v*100));

        



    }
    
}
