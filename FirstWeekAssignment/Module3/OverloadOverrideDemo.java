package FirstWeekAssignment.Module3;
class OverloadingDemo {

    void show(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    void show(int a, int b) {
        System.out.println("Method with two parameters: " + (a + b));
    }
}

class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class method (Overridden)");
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {

        OverloadingDemo obj1 = new OverloadingDemo();
        obj1.show(10);
        obj1.show(10, 20);

        Child obj2 = new Child();
        obj2.display();
    }
}
