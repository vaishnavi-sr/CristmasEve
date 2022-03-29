import java.util.Arrays;
import java.util.Collections;

class MinArray {

    public static Integer min(Integer[] arr){
        return  Collections.min(Arrays.asList(arr));

    }


    public static void main(String[] args) {

     Integer[] arr = { 2, 4, 7, 5, 9};



      Integer max = Collections.max(Arrays.asList(arr));

        System.out.println(arr);
        System.out.println("Minimum number of the array is : "+ min(arr));
        System.out.println("Maximum number of the array is : "+ max);

    }

}
