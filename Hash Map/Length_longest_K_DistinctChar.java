import java.util.*;

/*
QUestion : 
    if k = 2;
    string = abbcaaa => 4 - caaa
    string = acaaabbb => 6 - aaabbb
    string = aacccbaacc => 5 - aaccc
*/

public class Length_longest_K_DistinctChar {

    static void longest_K_DistinctChar(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = str.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String str = sc.next();

        longest_K_DistinctChar(str, k);
    }
}