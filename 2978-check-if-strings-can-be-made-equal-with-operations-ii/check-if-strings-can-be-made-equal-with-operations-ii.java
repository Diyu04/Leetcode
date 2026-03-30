class Solution {
    public boolean checkStrings(String s1, String s2) {
        //As the difference should be even, it means, that characters at even indexes will remain at even index after any number of swaps and so does characters at odd indexes.
        // So for both the string to be inter convertible, their character-frequency map for character at odd indexes and characters at even indexes should be equal!


         int[] even = new int[26];
        int[] odd = new int[26];
        int n = s1.length();

        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                //even
                even[s1.charAt(i) - 'a']++;
                even[s2.charAt(i) - 'a']--;
            }else{
                //odd
                odd[s1.charAt(i) - 'a']++;
                odd[s2.charAt(i) - 'a']--;
            }
        }

        for (int val : even){
            if (val != 0)
                return false;
        }

        for (int val : odd){
            if (val != 0)
                return false;
        }

        return true;
    }
}