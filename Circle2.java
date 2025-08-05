package OOPS_PRACTICAL;

public class Circle2 {
    void calculateArea(double radius) {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Circle2 c = new Circle2();
        c.calculateArea(4);
    }
}