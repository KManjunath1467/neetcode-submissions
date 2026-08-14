class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map = new HashMap<>();
        for(String str : strs){
               char ch[] = str.toCharArray();
               Arrays.sort(ch);
               String sort = new String(ch);
               if(!map.containsKey(sort)){
                     map.put(sort,new ArrayList<>());
               }
               map.get(sort).add(str);
        }
      List<List<String>>result = new ArrayList<>();
      for(List list : map.values()){
            result.add(new ArrayList<>(list));
      }
      return result;
    }
}
