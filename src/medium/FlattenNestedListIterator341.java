package medium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlattenNestedListIterator341 implements Iterator<Integer> {
    private List<Integer> flattenList;
    private int counter = 0;

    public FlattenNestedListIterator341(List<NestedInteger> nestedList) {
        flattenList = new ArrayList<>();
        flatten(nestedList);
    }

    public void flatten(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                flattenList.add(nestedInteger.getInteger());
            } else {
                flatten(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return flattenList.get(counter++);
    }

    @Override
    public boolean hasNext() {
        return counter < flattenList.size();
    }
}
