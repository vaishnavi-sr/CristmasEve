public class MinValueOfArray {
    public static  int minVal(int[] arr){
        int minArr = arr[0];

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < minArr){
                minArr= arr[i];
            }
        }
        return minArr;
    }

    public static void main(String[] args) {

         int[] a = {1,2,3,4};
        System.out.println(minVal(a));
    }

}
