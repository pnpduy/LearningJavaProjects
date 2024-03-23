public class Main {
    public static void main(String[] args) {

        boolean a = BarkingDog.shouldWakeUp (true, 1);
        boolean b = BarkingDog.shouldWakeUp (false, 2);
        boolean c = BarkingDog.shouldWakeUp (true, 8);
        boolean d = BarkingDog.shouldWakeUp (true, -1);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
