public class Vowels {
    public static int getCount(String str) {

        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowelCount += 1;
            }
        }
       return vowelCount;
    }

    public static void main(String[] args) {
        System.out.println(getCount("Celebration"));
        System.out.println(getCount("Prediction"));

    }
}
