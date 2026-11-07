class Solution {
    List<List<String>>result = new ArrayList<>();
    public List<List<String>> partition(String s) {
        search(0,s,new ArrayList<>());
        return result;
    }

    public void search(int index,String s,List<String>list){
                 if(index == s.length()){
                       result.add(new ArrayList<>(list));
                       return;
                 }

                 for(int i=index;i<s.length();i++){
                        String sub = s.substring(index,i+1);
                        if(ispalindrom(sub)){
                              list.add(sub);
                              search(i+1,s,list);
                              list.remove(list.size()-1);
                        }
                 }
    }

    public boolean ispalindrom(String s){
         int left = 0;
         int right = s.length()-1;
         while(left <= right){
             if(s.charAt(left) != s.charAt(right)){
                   return false;
             }
             left++;
             right--;
         }
         return true;
    }
}
