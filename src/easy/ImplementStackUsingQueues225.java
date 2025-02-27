package easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImplementStackUsingQueues225 {
    private Queue<Integer> store;
    private Queue<Integer> tmp;

    public ImplementStackUsingQueues225() {
        store = new LinkedList<>();
        tmp = new LinkedList<>();
    }

    public void push(int x) {
        while (!store.isEmpty()) {
            tmp.add(store.poll());
        }
        store.add(x);
        store.addAll(tmp);
        tmp.clear();
//        while (!tmp.isEmpty()) {
//            store.add(tmp.poll());
//        }
    }

    public int pop() {
        return store.poll();
    }

    public int top() {
        return store.peek();
    }

    public boolean empty() {
        return store.isEmpty();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueues225 myStack = new ImplementStackUsingQueues225();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
