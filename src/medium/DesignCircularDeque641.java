package medium;

public class DesignCircularDeque641 {
    private int k;
    private int[] arr;
    private int head;
    private int tail;

    public DesignCircularDeque641(int k) {
        this.k = k;
        this.arr = new int[k];
        this.head = -1;
        this.tail = -1;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            arr[0] = value;
            head = 0;
            tail = 0;
        } else {
            head = ((head - 1) + k) % k;
            arr[head] = value;
        }
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        if (isEmpty()) {
            arr[0] = value;
            head = 0;
            tail = 0;
        } else {
            tail = (tail + 1) % k;
            arr[tail] = value;
        }
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            head = (head + 1) % k;
        }
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = -1;
            tail = -1;
        } else {
            tail = ((tail - 1) + k) % k;
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return arr[head];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return arr[tail];
    }

    public boolean isEmpty() {
        if (head == -1) return true;
        else return false;
    }

    public boolean isFull() {
        if ((tail + 1) % k == head) return true;
        else return false;
    }

    //Best solution
//    int[] deque;
//    int front, rear, size, capacity;
//
//    public MyCircularDeque(int k) {
//        capacity = k;
//        deque = new int[k];
//        front = 0;
//        rear = -1;
//        size = 0;
//    }
//
//    public boolean insertFront(int value) {
//        if (isFull()) return false;
//
//        front = (front - 1 + capacity) % capacity;
//        deque[front] = value;
//        size++;
//
//        if (size == 1)
//            rear = front;
//
//        return true;
//    }
//
//    public boolean insertLast(int value) {
//        if (isFull()) return false;
//
//        rear = (rear + 1) % capacity;
//        deque[rear] = value;
//        size++;
//
//        if (size == 1)
//            front = rear;
//
//        return true;
//    }
//
//    public boolean deleteFront() {
//        if (isEmpty()) return false;
//
//        if (size == 1) {
//            front = 0;
//            rear = -1;
//        } else {
//            front = (front + 1) % capacity;
//        }
//
//        size--;
//        return true;
//    }
//
//    public boolean deleteLast() {
//        if (isEmpty()) return false;
//
//        if (size == 1) {
//            front = 0;
//            rear = -1;
//        } else {
//            rear = (rear - 1 + capacity) % capacity;
//        }
//
//        size--;
//        return true;
//    }
//
//    public int getFront() {
//        if (isEmpty()) return -1;
//        return deque[front];
//    }
//
//    public int getRear() {
//        if (isEmpty()) return -1;
//        return deque[rear];
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    public boolean isFull() {
//        return size == capacity;
//    }
}
