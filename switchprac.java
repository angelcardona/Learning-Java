public class switchprac {
    public static void main(String[] args) {
        String action ="agregar";

        switch(action){
            case"agregar":
            System.out.println("Agreed");
            break;
            case "eliminar":
            System.out.println("Delete source");
            break;
            default :
            System.out.println("default action");
        }
    }
}
