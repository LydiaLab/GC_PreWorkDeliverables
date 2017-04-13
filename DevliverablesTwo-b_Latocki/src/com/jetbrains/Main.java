package com.jetbrains;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
        // initiate methods to be run in program
        dateOne();
        dateTwo();
        DateDifference();
        ToString();  /* not clear on why issue here */

    }

    public static void DateDifference(DateTime d1, DateTime d2) {
        // standards used to determine calendar calculations between dates
         int[] monthDay = new int[13] {31,31,-1,31,30,31,30,31,31,30,31,30,31}; // may determine leap year consideration
         DateTime fromDate;
         DateTime toDate;
         int year;
         int month;
         int day;
         int increment;

            if (d1 >d2) { // determine which date is older
                this.fromDate = d2; // older date
                this.toDate = d1; // more current date
            }
            else {
                this.fromDate = d1; // older date
                this.toDate = d2; // more current date
            }

            // now determine diff in days between dates
            increment = 0;

            if (this.fromDate.Day > this.toDate.Day) {
            increment = this.monthDay[this.toDate.Month - 1];
            }

            // February? do this for leap year
            if (increment== -1) {
                if (DateTime.IsLeapYear(this.toDate.Year)) {
                increment = 29;
                }
                else {
                increment = 28;
                }
            }

            if (increment != 0) {  // continue determine diff in days between dates
                day = (this.toDate.Day+ increment) - this.fromDate.Day;
                increment = 1;
            }
            else {
                day = this.toDate.Day - this.fromDate.Day;
            }

            // determine diff between months
            if ((this.fromDate.Month + increment) > this.toDate.Month) {
                this.month = (this.toDate.Month+ 12) - (this.fromDate.Month + increment);
                increment = 1;
            }
            else {
                this.month = (this.toDate.Month) - (this.fromDate.Month + increment);
                increment = 0;
            }

            this.year = this.toDate.Year - (this.fromDate.Year + increment); // equation finding diff between years

             int year;
             int month;
             int day;

            return diff;
    }
    public override string ToString() {
        return this.year + "Year(s), " + this.month + " month(s), " + this.day + " day(s)";
    }

    public static void dateOne() {    // parse date entered to determine if it is a true date

        Scanner scanner = new Scanner(System.in);
        String str[] = {"year", "month", "day"};
        String str_date1 = "";
        Date d1;
        int i = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter first date " + str[i] + ". Date format should be year(xxxx), month(xx) and day(xx).  ");
            str_date1 = str_date1 + scanner.next() + "/";
            try {
                //String str[i] = "";      FIXIT redundant already defined above
                SimpleDateFormat formatter ;
                //Date d1 ;  FIXIT redundant already defined above
                formatter = new SimpleDateFormat("yyyy/MM/dd");
                formatter.setLenient(false);
                d1 = (Date)formatter.parse(str_date1);
                System.out.println("First date is " + d1 ); }
            catch (ParseException e) {
                System.out.println("Exception :"+e);
            }

        }

        str_date1 = str_date1.substring(0, str_date1.length() - 1);
        d1 = str_date1;

        return d1;

        }

        public static void dateTwo() {   // parse date entered to determine if it is a true date

            Scanner scanner = new Scanner(System.in);
            String str[] = {"year", "month", "day"};
            String str_date2 = "";
            Date d2;
            int i = 0;

            for (int i = 0; i < 3; i++) {
                System.out.println("Enter second date " + str[i] + ". Date format should be year(xxxx), month(xx) and day(xx).  ");
                str_date2 = str_date2 + scanner.next() + "/";
                try {
                    //String str[i] = "";      FIXIT redundant already defined above
                    SimpleDateFormat formatter ;
                    //Date d2 ;  FIXIT redundant already defined above
                    formatter = new SimpleDateFormat("yyyy/MM/dd");
                    formatter.setLenient(false);
                    d2 = (Date)formatter.parse(str_date2);
                    System.out.println("Second date is " + d2 ); }
                catch (ParseException e) {
                    System.out.println("Exception :"+e);
                }

            }

            str_date2 = str_date2.substring(0, str_date2.length() - 1);
            d2 = str_date2;

            return d2;

        }

}