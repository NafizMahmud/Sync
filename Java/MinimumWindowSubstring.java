import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
    Map<Character, Integer> map = new HashMap<Character, Integer>();
    int start = 0, end =0, length = 100001;
    MinimumWindowSubstring() {
        minWindow("bbaa","aba");
    }

    public String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        if(s.equals(t)) return s;
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), 0);
        }

        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            }

        while(checkCountStatus() == 1){
        if((j-i+1)<length) {start = i; end = j; length = (j-i)+1;}
          if(map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
          }
          i++;
        }
        }
        System.out.println(start + "   " + end + " " + length +" " + s.substring(start, end+1));
        if(length> s.length()) return "";
        else return s.substring(start, end+1);
    }

    int checkCountStatus() {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
    }
}
