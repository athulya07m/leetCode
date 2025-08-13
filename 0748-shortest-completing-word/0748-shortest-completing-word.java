class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] need = new int[26];
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                need[ch - 'a']++;
            }
        }

        String best = null;
        for (String w : words) {
            if (completes(w, need)) {
                if (best == null || w.length() < best.length()) {
                    best = w;
                }
            }
        }
        return best;
    }

    private boolean completes(String word, int[] need) {
        int[] have = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                have[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (have[i] < need[i]) return false;
        }
        return true;
    }
}
