class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            map.putIfAbsent(sortedS,new ArrayList<>());
            map.get(sortedS).add(strs[i]);
        }
       return new ArrayList<>(map.values());
    }
}
