//Min Stack
package fourthWeekAssignemnt.module11;

import java.util.Scanner;
import java.util.Stack;
public class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack obj = new MinStack();
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        System.out.println("1 x -> push");
        System.out.println("2 -> pop");
        System.out.println("3 -> top");
        System.out.println("4 -> getMin");

        for (int i = 0; i < n; i++) {
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    int val = sc.nextInt();
                    obj.push(val);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    System.out.println("Top: " + obj.top());
                    break;

                case 4:
                    System.out.println("Min: " + obj.getMin());
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        sc.close();
    }
}