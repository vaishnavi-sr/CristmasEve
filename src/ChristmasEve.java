import jdk.internal.access.JavaIOFileDescriptorAccess;


import java.util.Calendar;
import java.util.GregorianCalendar;
public class ChristmasEve {
    // Java program to demonstrate simple GregorianCalendar
// operations


    public static class GregorianCalendarGFG {
        public static void main(String args[])

        {

            System.out.println(ChristmasEve(2016,11,24));

            System.out.println(ChristmasEve(2018,10,23));

        } // end of main function
        public static boolean ChristmasEve(int year,int month, int date){

            if(year > 0 && month == 11 && date == 24 ){
                return  true;
            }else{
                return false;
            }

        }


    } // end of class


}
