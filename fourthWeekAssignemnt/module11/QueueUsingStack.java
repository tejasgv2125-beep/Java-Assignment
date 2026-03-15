//Implement Queue using Stacks
package fourthWeekAssignemnt.module11;
import java.util.*;
class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
public class QueueUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue obj = new MyQueue();

        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();

        System.out.println("1 x -> push");
        System.out.println("2 -> pop");
        System.out.println("3 -> peek");
        System.out.println("4 -> empty");

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int val = sc.nextInt();
                    obj.push(val);
                    break;

                case 2:
                    System.out.println("Removed: " + obj.pop());
                    break;

                case 3:
                    System.out.println("Front: " + obj.peek());
                    break;

                case 4:
                    System.out.println("Is Empty: " + obj.empty());
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}