package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class InsertDeleteGetRandomO_1_380 {
    Map<Integer, Integer> mapValue;
    Map<Integer, Integer> mapIndex;
    int idx = 0;

    public InsertDeleteGetRandomO_1_380() {
        mapValue = new HashMap<>();
        mapIndex = new HashMap<>();
    }

    public boolean insert(int val) {
        if (mapValue.containsKey(val)) return false;
        mapValue.put(val, idx);
        mapIndex.put(idx, val);
        idx++;
        return true;
    }

    public boolean remove(int val) {
        if (!mapValue.containsKey(val)) return false;
        int index = mapValue.get(val);
        mapValue.remove(val);
        mapIndex.remove(index);
        return true;
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * idx);
        while (!mapIndex.containsKey(randomIndex)) {
            randomIndex = (int) (Math.random() * idx);
        }
        return mapIndex.get(randomIndex);
    }

    // Best Solution
//    private HashMap<Integer, Integer> map;
//    private ArrayList<Integer> list;
//    private Random random;
//
//    public RandomizedSet() {
//        map = new HashMap<>();
//        list = new ArrayList<>();
//        random = new Random();
//    }
//
//    public boolean insert(int val) {
//        if (map.containsKey(val)) {
//            return false;
//        }
//        map.put(val, list.size());
//        list.add(val);
//        return true;
//    }
//
//    public boolean remove(int val) {
//        if (!map.containsKey(val)) {
//            return false;
//        }
//
//        Integer index = map.get(val);
//        Integer lastElement = list.get(list.size() - 1);
//
//        //swap
//        list.set(index, lastElement);
//        map.put(lastElement, index);
//
//        list.remove(list.size() - 1);
//        map.remove(val);
//
//        return true;
//    }
//
//    public int getRandom() {
//        return list.get(random.nextInt(list.size()));
//    }
}
