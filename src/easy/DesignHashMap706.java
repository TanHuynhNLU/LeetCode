package easy;

import java.util.ArrayList;

public class DesignHashMap706 {
    private int SIZE=1000;
    private ArrayList<Data>[] buckets;
    public DesignHashMap706() {
        buckets = new ArrayList[SIZE];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }
    public int hashFunction(int key){
        return key % SIZE;
    }

    public void put(int key, int value) {
        Data data = new Data(key,value);
        int hashCode = hashFunction(key);
        ArrayList<Data> bucket = buckets[hashCode];
        int keyIndex = bucket.indexOf(data);
        if(keyIndex>=0){
            bucket.set(keyIndex,data);
        }else {
            bucket.add(data);
        }
    }

    public int get(int key) {
        Data data = new Data(key,0);
        int hashCode = hashFunction(key);
        ArrayList<Data> bucket = buckets[hashCode];
        int keyIndex = bucket.indexOf(data);
        if(keyIndex>=0){
            return bucket.get(keyIndex).value;
        }else return -1;
    }

    public void remove(int key) {
        Data data = new Data(key,0);
        int hashCode = hashFunction(key);
        ArrayList<Data> bucket = buckets[hashCode];
        int keyIndex = bucket.indexOf(data);
        if(keyIndex>=0) bucket.remove(keyIndex);
    }
    private class Data{
        int key;
        int value;

        public Data(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Data) {
                return this.key == ((Data) obj).key;
            }
            return false;
        }
    }
}

