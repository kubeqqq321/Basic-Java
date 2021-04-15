package AccessFun_14_2;

/**
 * @author: Jakub Marciniak
 * #14.2
 */


import AccessFun_14_1.Access1;

public class Access3 extends Access1{
    public static void main(String[] args) {
        Access1 a1 = new Access1();
        System.out.println("\nDefault");
        //System.out.println(a1.hours);
        //System.out.println(a1.minutes);
        System.out.println("\nPublic");
        System.out.println(a1.hoursPublic);
        System.out.println(a1.minutesPublic);
        System.out.println("\nPrivate");
        //System.out.println(a1.hoursPrivate);
        //System.out.println(a1.minutesPrivate);
        System.out.println("\nProtected");
        //System.out.println(a1.hoursProtected);
        //System.out.println(a1.minutesProtected);


        System.out.println("\ngetPublic()");
        System.out.println(a1.getHoursPublic());
        System.out.println(a1.getMinutesPublic());
        System.out.println("\ngetPrivate()");
        //System.out.println(a1.getHoursPrivate());
        //System.out.println(a1.getMinutesPrivate());
        System.out.println("\ngetProtected()");
        //System.out.println(a1.getHoursProtected());
        //System.out.println(a1.getMinutesProtected());


    }

}
