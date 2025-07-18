class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; 
        int left = 1, right = x / 2, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid == x / mid) { 
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
                ans = mid; 
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
