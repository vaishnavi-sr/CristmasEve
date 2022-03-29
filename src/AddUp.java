public class AddUp {

    public static int addUpNum(int num){
        int total=0;

        for(int i =0;i<=num;i++){
            total+=i;
        }
        return total;

    }

    public static void main(String[] args) {

        System.out.println(addUpNum(4));

        System.out.println(addUpNum(13));

        System.out.println(addUpNum(600));

    }
}
