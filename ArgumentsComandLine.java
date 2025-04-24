public class ArgumentsComandLine {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("You Have to enter parameters or arguments");
            System.exit(-1);
        }
        for(int i=0;i<args.length;i++){
            System.out.println("Arguments nª" + i + " : " + args[i]);
        }

    }
    
}
