import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKCharacters {

    public static String findLongestSubstring(String str, int k)
    {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
        //Map to hold the frequency of each characters
        Map<Character,Integer> map = new HashMap<>();

        int end = 0; int begin  =0 ;

        for (int low = 0, high  = 0 ;  high < str.length() ; high ++) {
            map.put(str.charAt(high), map.getOrDefault(str.charAt(high), 0) + 1);

            //if the size of the window have exceeded  check for the left most character, if the frequency becomes zero it should also be removed from map
            while (map.size() > k){
                map.put(str.charAt(low), map.get(str.charAt(low)) - 1 );
                if (map.get(str.charAt(low)) == 0) {
                    map.remove(str.charAt(low));
                }
                low++;

            }
            if (end - begin < high - low) {
                end = high;
                begin = low;
            }
        }
        return str.substring(begin, end + 1);

        }

    public static void main(String[] args)
    {
        String str = "abcbdbdbbdcdabd";
        int k = 3;

        System.out.print(findLongestSubstring(str, k));
    }
}
