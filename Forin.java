public class Forin {
    public static void main(String[] args) {
        String[]characters={"goku","vegeta","naruto"};
        for(int i=0;i<characters.length;i++){
            System.out.println(characters[i]);
        
        }
        //for in
        for (String character:characters){
            System.out.println(character);
        }
    }
}
