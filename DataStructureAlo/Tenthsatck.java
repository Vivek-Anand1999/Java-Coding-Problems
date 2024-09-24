package DataStructureAlo;

import java.util.Stack;

public class Tenthsatck {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(8);
        // stack.push(18);
        // stack.push(38);
        // stack.push(28);
        // stack.push(68);
        // stack.pop();
        // System.out.println(stack.size());
        // System.out.println(stack.peek());
        // System.out.println(stack);

        String name = "madam";
        StringBuilder stringBuilder = new StringBuilder(name).reverse();
        // StringBuilder c = stringBuilder.reverse();
        System.out.println(name.equals(stringBuilder));

        int n = 10, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);
        for (int i = 2; i < n; i++) {
            int num3 = num1 + num2;
            System.out.print(", " + num3);
            num1 = num2;
            num2 = num3;
        }
        

    }
}
