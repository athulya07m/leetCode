import java.util.*;

class Solution {
    public int[][] outerTrees(int[][] trees) {
        Arrays.sort(trees, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int n = trees.length;

        List<int[]> hull = new ArrayList<>();

        for (int[] p : trees) {
            while (hull.size() >= 2 &&
                   cross(hull.get(hull.size()-2), hull.get(hull.size()-1), p) < 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(p);
        }

        int t = hull.size() + 1;
        for (int i = n - 2; i >= 0; i--) {
            int[] p = trees[i];
            while (hull.size() >= t &&
                   cross(hull.get(hull.size()-2), hull.get(hull.size()-1), p) < 0) {
                hull.remove(hull.size() - 1);
            }
            hull.add(p);
        }

     
        if (hull.size() > 1) {
            hull.remove(hull.size() - 1);
        }

      
        Set<String> seen = new HashSet<>();
        List<int[]> result = new ArrayList<>();
        for (int[] p : hull) {
            String key = p[0] + "," + p[1];
            if (!seen.contains(key)) {
                result.add(p);
                seen.add(key);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

    private int cross(int[] a, int[] b, int[] c) {
        return (b[0] - a[0]) * (c[1] - a[1])
             - (b[1] - a[1]) * (c[0] - a[0]);
    }
}
