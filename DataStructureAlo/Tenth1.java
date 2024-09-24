package DataStructureAlo;

import java.util.Stack;

public class Tenth1 {
    public static void main(String[] args) {
        String word = "google"; // -> elgoog
        reverseWord(word);
    }

    public static void reverseWord(String word) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            char c = stack.pop();
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}
