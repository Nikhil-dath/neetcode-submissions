
class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        ArrayList<Character> arr = new ArrayList<>();

        for (int i = 0; i < t.length(); i++) {
            arr.add(t.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (arr.contains(ch)) {
                arr.remove(Character.valueOf(ch));
            }
        }

        return arr.size() == 0;
    }
}