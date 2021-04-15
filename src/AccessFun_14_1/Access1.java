package AccessFun_14_1;

/**
 * @author: Jakub Marciniak
 * #14.1
 */

public class Access1 {

    /** default , public ,private, protected */

    int hours =3;
    int minutes = 39;

    public int hoursPublic = 2;
    public int minutesPublic = 35;

    private int hoursPrivate = 7;
    private int minutesPrivate = 56;

    protected int hoursProtected = 4;
    protected int minutesProtected = 29;

    public int getHoursPublic() {return hoursPrivate; }
    public int getMinutesPublic() {return minutesPrivate;}

    private int getHoursPrivate() {return hoursPrivate;}
    private int getMinutesPrivate() {return minutesPrivate; }

    protected int getHoursProtected() {return hoursPrivate; }
    protected int getMinutesProtected() {return minutesPrivate;}
}
