public class Cycle {
    public static void main(String[] args) {
        String[] quoutes={"love","peace","calm","growth","integrity"};
        System.out.println(quoutes.length);
        //For
        for (int i=0;i< quoutes.length;i++){
            System.out.println(quoutes[i]);
        }
        //While

        int i = 0;
        while (i < quoutes.length ) {
            System.out.println(quoutes[i]);
            i++;

            
        }
        //do while
        int e = 0;
        do{
            System.out.println(e);
            e++;
        }while (e <5 );
    }
    
}                                                                                                                  
