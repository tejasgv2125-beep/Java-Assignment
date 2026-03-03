package secondWeekAssignment.module4;

abstract class Shape {


    abstract double area();
}


class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    double area() {
        return Math.PI * radius * radius;
    }
}


class Rectangle extends Shape {
    double length;
    double width;


    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}


public class Main {
    public static void main(String[] args) {

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}