package stackQuiz;

import java.util.Scanner;
import java.util.Stack;

public class StackQuiz {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("확인하고 싶은 괄호들 입력 : ");
        String s = scan.next();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    break;
                }
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty());
    }
}
