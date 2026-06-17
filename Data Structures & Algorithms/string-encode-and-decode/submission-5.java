class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
          for(String str : strs){
                 sb.append(str.length());
                 sb.append('#');
                 sb.append(str);
          }
          return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {

            int j = i;

            // find #
            while (str.charAt(j) != '#') {
                j++;
            }

            // length before #
            int len = Integer.parseInt(str.substring(i, j));

            // move to starting of word
            i = j + 1;

            // extract word
            list.add(str.substring(i, i + len));

            // move to next encoded string
            i = i + len;
        }

        return list;
    }
}
