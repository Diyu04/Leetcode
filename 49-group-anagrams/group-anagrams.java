class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();

       for(String word:strs){
           char[] wordArray=word.toCharArray();
           Arrays.sort(wordArray);
           String sortedstr=new String(wordArray);

           if(!map.containsKey(sortedstr)){
               map.put(sortedstr,new ArrayList<>());
           }
           map.get(sortedstr).add(word);
           }
        return new ArrayList<>(map.values());
    }
}