public class Circle {
    public static final double Pi=3.14159;
     public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Pi * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Pi * radius;
    }

}
