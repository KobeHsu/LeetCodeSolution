package algorithms;

import java.util.Arrays;

/**
 * Min Stack
 *
 * @author kobe
 *
 */
public class Problem155 {

    private static final int BASE_SIZE = 1000;

    private int[] stack = new int[BASE_SIZE];
    private int[] minStack = new int[BASE_SIZE];

    private int topIdx = -1;
    private int minIdx = -1;

    private int minValue = Integer.MAX_VALUE;

    public void push(int x) {

        if (topIdx == stack.length - 1) {
            int newSize = stack.length + BASE_SIZE;
            stack = Arrays.copyOf(stack, newSize);
        }

        topIdx++;

        stack[topIdx] = x;

        if (x <= minValue) {

            if (minIdx == minStack.length - 1) {
                int newSize = minStack.length + BASE_SIZE;
                minStack = Arrays.copyOf(minStack, newSize);
            }

            minIdx++;
            minStack[minIdx] = x;
            minValue = x;

        }

    }

    public void pop() {

        int x = stack[topIdx];
        stack[topIdx] = 0;
        topIdx--;

        if (x == minStack[minIdx]) {
            minStack[minIdx] = 0;
            if (minIdx > 0) {
                minIdx--;
                minValue = minStack[minIdx];
            } else {
                minIdx--;
                minValue = Integer.MAX_VALUE;
            }
        }

    }

    public int top() {
        return stack[topIdx];
    }

    public int getMin() {
        return minValue;
    }

    public static void main(String args[]) {

        Problem155 p = new Problem155();
        p.push(2147483646);
        p.push(2147483646);
        p.push(2147483647);
        System.out.println(p.top());
        p.pop();
        System.out.println(p.getMin());
        p.pop();
        System.out.println(p.getMin());
        p.pop();
        p.push(2147483647);
        System.out.println(p.top());
        System.out.println(p.getMin());
        p.push(-2147483648);
        System.out.println(p.top());
        System.out.println(p.getMin());
        p.pop();
        System.out.println(p.getMin());

    }
}
