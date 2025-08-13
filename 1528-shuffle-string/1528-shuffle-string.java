class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] result = new char[n];
        for (int i = 0; i < n; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        String output = sol.restoreString(s, indices);
        System.out.println(output);
    }
}
