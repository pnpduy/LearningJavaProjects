public class Main {
    public static void main(String[] args) {

        double area = AreaCalculator.area(5.0);
        System.out.println(area);
        double area1 = AreaCalculator.area(-1);
        System.out.println(area1);
        double area2 = AreaCalculator.area(5.0, 4.0);
        System.out.println(area2);
        double area3 = AreaCalculator.area(-1.0, 4.0);
        System.out.println(area3);
    }
}