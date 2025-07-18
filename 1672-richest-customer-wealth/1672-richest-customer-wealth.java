class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth = 0;
        for(int i = 0;i<accounts.length;i++){
            int customerwealth=0;
        for(int j =0;j<accounts[i].length;j++){
            customerwealth += accounts[i][j];
            }
            if(customerwealth > maxwealth){
                maxwealth = customerwealth;
            }
        }
        return maxwealth;
    }
}