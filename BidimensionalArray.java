import java.util.Arrays;

public class BidimensionalArray {
    public static void main(String[] args) {
        //Two dimensions
        int[][]numbers={{0,1},{2,3}};
        System.out.println(Arrays.deepToString(numbers));
        int [][]number=new int [3][2];
        number[0][0]=5;
        number[2][1]=3;
        System.out.println(Arrays.deepToString(number));
        //Three dimensions
        int [][][] matrix=new int [3][2][2];
        matrix[1][1][1]=5;
        System.out.println(Arrays.deepToString(matrix));

    }
    
}
