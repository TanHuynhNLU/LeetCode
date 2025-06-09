package medium;

import java.util.Stack;

public class VerifyPreorderSerializationOfABinaryTree331 {
    public static boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        Stack<String> stack = new Stack<>();
        for (String node : nodes) {
            while (!stack.isEmpty() && stack.peek().equals("#") && node.equals("#")) {
                stack.pop();
                if (!stack.isEmpty()) stack.pop();
                else return false;
            }
            stack.push(node);
        }
        return stack.size() == 1 && stack.peek().equals("#");
    }

    // Common solution
//    public boolean isValidSerialization(String preorder) {
//        String[] nodes = preorder.split(",");
//        int slots = 1;  // one slot for root
//
//        for (String node : nodes) {
//            // one node occupies one slot
//            slots--;
//            if (slots < 0) return false;
//
//            // non-null node generates two additional slots
//            if (!node.equals("#")) {
//                slots += 2;
//            }
//        }
//
//        return slots == 0;
//    }

    // Best runtime
//    int checkNextValidSerialization(String preorder, int start) {
//        if (start >= preorder.length())
//            return start;
//        char c;
//        c = preorder.charAt(start);
//        if (c == '#') {
//            return start + 2;
//        }
//        while (true) {
//            c = preorder.charAt(start);
//            if (c == ',') {
//                start++;
//                break;
//            }
//            start++;
//            if (start >= preorder.length())
//                break;
//        }
//        start = checkNextValidSerialization(preorder, start);
//        if (start == -1 || start >= preorder.length())
//            return -1;
//        start = checkNextValidSerialization(preorder, start);
//        return start;
//    }
//
//    public boolean isValidSerialization(String preorder) {
//        int next_pos = checkNextValidSerialization(preorder, 0);
//        return next_pos >= preorder.length();
//    }
}
