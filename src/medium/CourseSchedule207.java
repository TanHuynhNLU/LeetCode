package medium;

import java.util.*;

public class CourseSchedule207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited = new boolean[numCourses];
        for (int[] prerequisite : prerequisites) {
            List<Integer> list = map.getOrDefault(prerequisite[0], new ArrayList<>());
            list.add(prerequisite[1]);
            map.put(prerequisite[0], list);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(map, visited, i)) return false;
        }
        return true;
    }

    public boolean dfs(Map<Integer, List<Integer>> map, boolean[] visited, int course) {
        if (!map.containsKey(course) || map.get(course).isEmpty()) return true;
        if (visited[course]) return false;
        visited[course] = true;
        for (int value : map.get(course)) {
            if (!dfs(map, visited, value)) return false;
        }
        map.put(course, new ArrayList<>());
        return true;
    }

    // Best Solution
//    static class Course {
//        private boolean vis;
//        private boolean done;
//        private ArrayList<Course> pre = new ArrayList<Course>();
//
//        void addPre(Course preCourse) {
//            pre.add(preCourse);
//        }
//
//        boolean isCyclic() {
//            if (done) {
//                return false;
//            }
//            if (vis) {
//                return true;
//            }
//            vis = true;
//
//            for (Course preCourse : pre) {
//                if (preCourse.isCyclic()) {
//                    return true;
//                }
//            }
//
//            vis = false;
//            done = true;
//            return false;
//        }
//    }
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        Course clist[] = new Course[numCourses];
//
//        for (int i = 0; i < numCourses; i++) {
//            clist[i] = new Course();
//        }
//
//        for (int[] couple : prerequisites) {
//            Course c1 = clist[couple[0]];
//            Course c2 = clist[couple[1]];
//            c1.addPre(c2);
//        }
//
//        for (int i = 0; i < numCourses; i++) {
//            if (clist[i].isCyclic()) {
//                return false;
//            }
//        }
//
//        return true;
//    }
}
