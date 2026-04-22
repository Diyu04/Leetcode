class Solution {
        public List<String> twoEditWords(String[] queries, String[] dictionary) {
        
       List<String> list = new ArrayList<>();
        for(int i=0; i<queries.length; i++) {
            for(int j=0; j<dictionary.length; j++) {
                if(queries[i].equals(dictionary[j])) {
                    list.add(queries[i]);
                    break;
                }
                
                int k = diff(queries[i], dictionary[j]);
                if(k<=2) {
                    list.add(queries[i]);
                    break;
                }
            }
        }
        
        return list;
        
    }
    
    
    public static int diff(String a, String b) {

        int n = a.length();
        int s = 0;
        for(int i=0; i<n; i++) {
            if(a.charAt(i)==b.charAt(i)) s++;
        }
        int count = n-s;
        return count;
    }
    }