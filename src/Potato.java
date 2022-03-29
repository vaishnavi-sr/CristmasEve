public class Potato {

    public static int potatoes(String str){
       int numOfPotatoes = str.split("potato").length+1;
        return  numOfPotatoes;
    }

    public static void main(String[] args) {
        System.out.println(potatoes("potato"));

        System.out.println(potatoes("potatopotato"));
    }
}
