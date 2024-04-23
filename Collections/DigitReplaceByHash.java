package Collections;

import java.util.Stack;

public class DigitReplaceByHash {
    public static void main(String[] args) {
        String s = "k1234Mn3";
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++) {
            
            stack.push(s.charAt(i)>= '0' && s.charAt(i) <='9' ? '#': s.charAt(i) );
        }
        System.out.println(stack);
    }
}
