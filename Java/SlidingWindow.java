import java.util.LinkedHashMap;
import java.util.Map;

final class SlidingWindow {

    SlidingWindow(){
        System.out.println(lengthOfLongestSubstring("abba"));
        System.out.println(lengthOfLongestSubstring("au"));
    }
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int len = s.length();
        // System.out.println(s.isBlank());
        // if(len==0) return 0;
        // if(s.isBlank()) return 1;
        // if(len==1) return 1;

        int globalLen=0;
        int i=0,j=0;
        while(j<len){
            char c = s.charAt(j);
            if(map.containsKey(c)){
               i=Math.max(map.get(c),i);
               globalLen = Math.max(globalLen,j - i + 1);
               // System.out.println(map.toString() + " " + c);
               // System.out.println(globalLen +"---" +  s.charAt(i) + i + " "+ s.charAt(j)+j);
             }
                globalLen = Math.max(globalLen,j-i+1);
                map.put(c,j+1);
                j++;
        }
      // System.out.println();
      return globalLen;
    }

    public static void main(String[] args) {
        SlidingWindow solution = new SlidingWindow();
    }
}
