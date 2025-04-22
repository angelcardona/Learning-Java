public class MathOperators {
    public static void main(String[] args) {
        
        //Adittion
        int adition= 2 + 2;
        System.out.println(adition);

        //Substraction
        float substaccion= 2 - 2;
        System.out.println(substaccion);

        //Multiplication

        float multiplication = 2.3F * 2 ;
        System.out.println(multiplication);

        //Division
        /*Debemos poner la f alnumerador y denominador para que java interprete que el resultado es un flotante
         * 
         */
        float division = 10f / 3f ;
        System.out.println(division);

        //Division using double type
        double div = 10.0/3.0;
        System.out.println(div);
        //Module
        int module= 4%2;
        System.out.println(module);

        //Aditionating one unid in a numeric varible

        int x = 5;
        ++x; 
        System.out.println(x);

        int y=5;
        y += 5;
        System.out.println(y);

        //Order of executing math operators
        
        /*Parenthesis ()       
          *Squared 
          *Multiplication
          *Division
          *Adition
          *Sustraction 
         */
        int r= (5+2) * 3 ;
        System.out.println(r);
    }
    
}
