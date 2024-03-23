public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean baking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return baking && (hourOfDay < 8 || hourOfDay >22);
    }
}