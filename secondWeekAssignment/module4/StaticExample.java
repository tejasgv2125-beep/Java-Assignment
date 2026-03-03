package secondWeekAssignment.module4;
class Student {

    static String collegeName = "ABC College";

    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class StaticExample {
    public static void main(String[] args) {

        Student.displayCollege();

        Student s1 = new Student("Anita", 101);
        Student s2 = new Student("Rahul", 102);

        s1.display();
        s2.display();

        Student.collegeName = "XYZ College";

        System.out.println("After changing college name:");

        s1.display();
        s2.display();
    }
}