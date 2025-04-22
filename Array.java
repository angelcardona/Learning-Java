import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Declaring arrays
        int[]numbers= new int[5];
        //Inserting data by index
        numbers[0]=5;
        numbers[4]=1;
        //this method is a instance of Array class and we used a method name Array.toString that help show us the elements of array like strings
        System.out.println(Arrays.toString(numbers));
        //this method show the number of elements
        System.out.println(numbers.length);
        //This method sort the values of array asc 
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int [] number= {1,2,3,4,9};
        System.out.println(Arrays.toString(number));
        System.out.println(number.length);
    }
}
