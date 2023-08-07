public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);

        System.out.println("Площадь круга: " + circle1.area());
        System.out.println("Длина окружности: " + circle1.circumference());

        Circle circle2 = new Circle(7);


        System.out.println("Площадь круга: " + circle2.area());
        System.out.println("Длина окружности: " + circle2.circumference());
    }
}