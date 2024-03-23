public class Main {
    public static void main(String[] args) {

        boolean sum1 = EqualSumChecker.hasEqualSum(1, 1, 1);
        boolean sum2 = EqualSumChecker.hasEqualSum(1, 1, 2);
        boolean sum3 = EqualSumChecker.hasEqualSum(1, -1, 0);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }
}