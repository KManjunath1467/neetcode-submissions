class Solution {

    public String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();

    for (String str : strs) {
        sb.append("$");
        sb.append(str.length());
        sb.append("#");
        sb.append(str);
    }

    return sb.toString();
    }

    public List<String> decode(String str) {
              int i = 0;
    List<String> list = new ArrayList<>();

    while (i < str.length()) {

        i++; // skip $

        int n = 0;

        while (str.charAt(i) != '#') {
            n = n * 10 + (str.charAt(i) - '0');
            i++;
        }

        i++; // skip #

        StringBuilder sb = new StringBuilder();

        for (int j = 0; j < n; j++) {
            sb.append(str.charAt(i));
            i++;
        }

        list.add(sb.toString());
        }
        return list;
    }
}
