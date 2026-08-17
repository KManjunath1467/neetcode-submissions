

class TimeMap {
    class temp{
     String value;
     int stamp;
     temp(){}
     temp(String value,int stamp){
        this.value = value;
        this.stamp = stamp;
     }
}

    HashMap<String,List<temp>>map = new HashMap<>();
    public TimeMap() {
        temp obj = new temp();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
       map.get(key).add(new temp(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        int left = 0;
        int right = map.get(key).size()-1;
        List<temp> list = map.get(key);
        String ans = "";
        while(left<=right){
            int mid = left + (right - left)/2;

            if(list.get(mid).stamp <=timestamp){
                  ans = list.get(mid).value;
                  left = mid+1;
            }else{
                  right = mid-1;
            }
        }
        return ans;
    }
}
