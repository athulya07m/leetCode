public class Solution {

    // Method to find the length of the last word
    public int lengthOfLastWord(String s) {
        // Trim any leading or trailing whitespace
        s = s.trim();

        // Split the string by spaces
        String[] words = s.split(" ");

        // Return the length of the last word
        return words[words.length - 1].length();
    }
}
