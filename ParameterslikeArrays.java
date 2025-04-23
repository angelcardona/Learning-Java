public class ParameterslikeArrays {
    public static void main(String[] args) {
      int r=addition(new int[]{1,2,3,4,5});
      System.out.println(r);
    }
    static int addition(int[] numbers){
        int result=0;
        for(int number:numbers){
            result += number;

        }
        return result;

    }
}
