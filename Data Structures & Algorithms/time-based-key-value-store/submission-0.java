class TimeMap {
    
    class Pair{
          int timestamp;
          String value;
          Pair(int timestamp,String value){
               this.timestamp = timestamp;
               this.value = value;
          }
    }
    private HashMap<String,List<Pair>>map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
         map.putIfAbsent(key,new ArrayList<>());
         map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
         String ans = "";
         if(!map.containsKey(key)) return ans;
         int left = 0;
         List<Pair>list = map.get(key);
         int right = list.size()-1;
         while(left<=right){
              int mid = left + (right - left)/2;
              if(list.get(mid).timestamp == timestamp){
                    return list.get(mid).value;
              }

              if(list.get(mid).timestamp < timestamp){
                       ans = list.get(mid).value;
                       left = mid+1;
              }else{
                        right = mid-1;
              }
         }
         return ans;
    }
}
