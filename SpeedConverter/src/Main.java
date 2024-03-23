public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.05));
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(SpeedConverter.toMilesPerHour(25.42));

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.05);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);

    }
}