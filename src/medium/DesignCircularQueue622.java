package medium;

public class DesignCircularQueue622 {
    private int k;
    private int[] arr;
    private int head;
    private int tail;

    public DesignCircularQueue622(int k) {
        this.k = k;
        this.arr = new int[k];
        this.head = -1;
        this.tail = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) return false;
        if (head == -1 && tail == -1) {
            head = 0;
            tail = 0;
        }else {
            tail = (tail+1)%k;
        }
        arr[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) return false;
        if (head == tail) {
            head = -1;
            tail = -1;
        } else
            head = (head + 1) % k;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[head];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[tail];
    }

    public boolean isEmpty() {
        return head == -1 && tail == -1;
    }

    public boolean isFull() {
        return (tail + 1) % k == head;
    }
}
