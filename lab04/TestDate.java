package lab04;

public class TestDate {
    public static void main(String[] args) {
        //Test contructor and toString()
        Date d1 = new Date(2020, 2, 8 );
        System.out.println(d1); //toString()
        //02/08/2020

        //Test Setters and Getters
        d1.setYear(2020);
        d1.setMonth(9);
        d1.setDay(23);
        System.out.println(d1);
        //12/23/2012
        System.out.println("Year is: " + d1.getYear());
        //Year is:2012
        System.out.println("Month is: " + d1.getMonth());
        //Month is:12
        System.out.println("Day is: " + d1.getDay());
        //Day is:23

        //Test setDate()
        d1.setDate(2022, 1, 2);
        System.out.println(d1);
        //01/02/2022

    }
}
