package Collections;

import java.util.Stack;

public class EvenPositionOddStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(17);
        stack.push(2);
        stack.push(14);
        stack.push(16);
        stack.push(17);
        stack.push(18);
        int i = 1;
        for(int j = 0;j<stack.size();j++) {
            if(j%2==0){
                stack.set(j, i);
                i+=2;
            }
        }
        System.out.println(stack);
    }
}
