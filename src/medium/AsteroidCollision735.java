package medium;

import java.util.Stack;

public class AsteroidCollision735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (asteroid > 0 || stack.isEmpty()) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty()) {
                    int prev = stack.peek();
                    if (prev > 0) {
                        if (prev == Math.abs(asteroid)) {
                            stack.pop();
                            break;
                        }
                        if (prev > Math.abs(asteroid)) {
                            break;
                        }
                        if (prev < Math.abs(asteroid) && stack.size() == 1) {
                            stack.pop();
                            stack.push(asteroid);
                            break;
                        }
                        if (prev < Math.abs(asteroid)) {
                            stack.pop();
                        }
                    } else {
                        stack.push(asteroid);
                        break;
                    }
                }
            }
        }
        int[] res = new int[stack.size()];
        int i = 0;
        for (int asteroid : stack) {
            res[i++] = asteroid;
        }
        return res;
    }

    //Best Solution
//    public int[] asteroidCollision(int[] asteroids) {
//        int[] stack = new int[asteroids.length];
//        int top = -1;
//        for (int asteroid : asteroids) {
//            boolean destroyed = false;
//            while (top >= 0 && stack[top] > 0 && asteroid < 0) {
//                if (stack[top] < -asteroid) {
//                    top--;
//                } else if (stack[top] == -asteroid) {
//                    top--;
//                    destroyed = true;
//                    break;
//                } else {
//                    destroyed = true;
//                    break;
//                }
//            }
//            if (!destroyed) {
//                stack[++top] = asteroid;
//            }
//        }
//        return Arrays.copyOf(stack, top + 1);
//    }
}
