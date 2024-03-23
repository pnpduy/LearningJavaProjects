public class Main {
    public static void main(String[] args) {
        boolean leapYear = LeapYear.isLeapYear(-1600);
        boolean leapYear1 = LeapYear.isLeapYear(1600);
        boolean leapYear2 = LeapYear.isLeapYear(2000);
        boolean leapYear3 = LeapYear.isLeapYear(2017);

        System.out.println(leapYear);
        System.out.println(leapYear1);
        System.out.println(leapYear2);
        System.out.println(leapYear3);
    }
}
