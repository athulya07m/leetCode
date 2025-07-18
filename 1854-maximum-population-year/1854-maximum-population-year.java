class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] delta = new int[101]; 
        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            delta[birth - 1950] += 1;  
            delta[death - 1950] -= 1;  
        }
        int maxPopulation = 0;
        int yearOfMax = 1950;
        int currentPopulation = 0;
        for (int i = 0; i <= 100; i++) {
            currentPopulation += delta[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                yearOfMax = 1950 + i;
            }
        }
        return yearOfMax;
    }
}
