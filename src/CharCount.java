public class CharCount {

    public static void main(String[] args) {


        System.out.println(count('a', "edabit"));

        System.out.println(count('b', "big fat bubble"));

    }

    public static int count( char myChar,String str){

        int letterCount = 0;

        for (int i=0; i<str.length(); i++){

            // checking character in string
            if (str.charAt(i) == myChar)
                letterCount+=1;
        }
        return letterCount;
    }
}

