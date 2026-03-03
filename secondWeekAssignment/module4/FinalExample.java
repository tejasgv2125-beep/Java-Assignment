package secondWeekAssignment.module4;

final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}


class Parent {

    final int x = 10;

    final void show() {
        System.out.println("This is a final method.");
    }
}


class Child extends Parent {


    void display() {
        System.out.println("Value of final variable x = " + x);

    }
}

public class FinalExample {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.show();
        obj.display();

        FinalClass fc = new FinalClass();
        fc.display();

    }
}