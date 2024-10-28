package Stack;

import java.util.*;

public class GetMinAtTop {

    public static Stack<Integer> _push(int arr[], int n) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        return stack;
    }

    public static void _getMinAtPop(Stack<Integer> s) {
        int min = Integer.MIN_VALUE;

        while (!s.empty()) {

        }
    }

}
