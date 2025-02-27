package easy;

import java.util.ArrayList;
import java.util.List;

public class OrderedStream1656 {
    private String[] arr;
    private int lastChunk=-1;

    public OrderedStream1656(int n) {
        arr = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        arr[idKey - 1] = value;
        for (int i = idKey-1; i < arr.length; i++) {
            if (arr[i] != null&i==lastChunk+1) {
                list.add(arr[i]);
                lastChunk++;
            } else break;
        }
        return list;
    }
}
