class Solution {
    public int findNumbers(int[] nums) {
       int count = 0;
       for (int num:nums){
        String numStr = Integer.toString(num);
        int numDigits = numStr.length();
        if (numDigits % 2 == 0){
           count++;
        }
    }
    return count;
}
}
