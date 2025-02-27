package easy;

import java.util.ArrayList;

public class DesignHashset705 {
    private int SIZE = 1000;
    private ArrayList<Integer>[] buckets;

    public DesignHashset705() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int hashFunction(int key) {
        return key % SIZE;
    }

    public void add(int key) {
        int hashCode = hashFunction(key);
        ArrayList bucket = buckets[hashCode];
        if(!bucket.contains(key)){
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int hashCode = hashFunction(key);
        ArrayList bucket = buckets[hashCode];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex!=-1){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key) {
        int hashCode = hashFunction(key);
        ArrayList bucket = buckets[hashCode];
        return bucket.contains(key);
    }

    public static void main(String[] args) {
        DesignHashset705 myHashSet =new DesignHashset705();
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.remove(2);
        System.out.println(myHashSet.contains(2));
    }
}
