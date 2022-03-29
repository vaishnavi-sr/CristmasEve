import java.util.GregorianCalendar;

public class GregorianCalender {

    public static boolean timeForMilkAndCookies(GregorianCalendar date){

        int month = date.get(GregorianCalendar.MONTH);
        int day   = date.get(GregorianCalendar.DAY_OF_MONTH);

        if(month == 11 && day == 24){
            return true;
        }else {
            return  false;
        }
    }

    public static void main(String[] args) {

        System.out.println(timeForMilkAndCookies(new GregorianCalendar(2008,11,24)));
    }
}
