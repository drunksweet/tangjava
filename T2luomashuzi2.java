import java.util.HashMap;

class Solution2 {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> dictionary = new HashMap<>();
        dictionary.put('I', 1);
        dictionary.put('V', 5);
        dictionary.put('X', 10);
        dictionary.put('L', 50);
        dictionary.put('C', 100);
        dictionary.put('D', 500);
        dictionary.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && dictionary.containsKey(s.charAt(i)) && dictionary.containsKey(s.charAt(i + 1)) && dictionary.get(s.charAt(i)) < dictionary.get(s.charAt(i + 1))) {
                sum -= dictionary.get(s.charAt(i));
            } else {
                sum += dictionary.get(s.charAt(i));
            }
        }

        return sum;
    }
}