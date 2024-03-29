public class SharedDigit {
    // write code here
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if (firstNumber < 10 || firstNumber > 99 || secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        while (firstNumber > 0) {
            int digit = firstNumber % 10;
            int temp = secondNumber;
            while (temp > 0) {
                if (temp % 10 == digit) {
                    return true;
                }
                temp /= 10;
            }
            firstNumber /= 10;
        }
        return false;
    }
}