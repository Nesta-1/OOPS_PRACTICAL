package OOPS_PRACTICAL;

public class Circle {
    double radius = 5.0;
    void Area() {
        double area = 3.14159 * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.Area();
   }
}