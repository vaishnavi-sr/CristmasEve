public class LargestSwap {
    public static boolean largestSwap(int num){

       int num1 = (num/10)+(num%10)*10;
        System.out.println(num1);

       if(num1 < num){
           return true;
       }else{
           return false;
       }
    }

    public static void main(String[] args) {
        System.out.println(largestSwap(27));
        System.out.println(largestSwap(43));
    }
}
