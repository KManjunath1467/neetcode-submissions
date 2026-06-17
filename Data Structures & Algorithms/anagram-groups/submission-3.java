class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){

              char ch[] = str.toCharArray();
              Arrays.sort(ch);
              String comp = new String(ch);
              if(!map.containsKey(comp)){
                    map.put(comp,new ArrayList<>());
              }
            map.get(comp).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
