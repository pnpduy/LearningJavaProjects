public class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int a = (int) (num1 * 1000);
        int b = (int) (num2 * 1000);
        System.out.println(a == b);
        return a == b;
    }
}