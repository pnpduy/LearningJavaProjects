public class Main {
    public static void main(String[] args) {

        boolean num1 = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(num1);
        boolean num2 = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(num2);
        boolean num3 = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println(num3);
    }
}