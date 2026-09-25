package medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance690 {
    Map<Integer, Integer> map = new HashMap<>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee e : employees) {
            if (e.id == id) {
                if (map.containsKey(id)) return map.get(id);
                int total = e.importance;
                for (int i : e.subordinates) {
                    total += getImportance(employees, i);
                }
                map.put(id, total);
                return total;
            }
        }
        return 0;
    }

    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    // Best solution
//    private static final int MAX = 2001;
//    private int getImportance(Employee[] employees, int id) {
//        Employee emp = employees[id];
//        int importance = emp.importance;
//        for (int subordinate : emp.subordinates)
//            importance += getImportance(employees, subordinate);
//        return importance;
//
//    }
//
//    public int getImportance(List<Employee> employees, int id) {
//        Employee[] map = new Employee[MAX];
//        for (Employee employee : employees)
//            map[employee.id] = employee;
//        return getImportance(map, id);
//    }
}
