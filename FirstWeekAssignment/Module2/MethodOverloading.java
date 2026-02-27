package FirstWeekAssignment.Module2;
public class MethodOverloading {

 
    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }


    void display(double a) {
        System.out.println("Double value: " + a);
    }

    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();

        obj.display(10);
        obj.display(10, 20);
        obj.display(5.5);
    }
}