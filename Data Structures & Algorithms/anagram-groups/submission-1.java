class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            ArrayList<String> fruits = new ArrayList<>(
                    Arrays.asList(strs));

        HashMap<HashMap<Character,Integer>, List<String>> 
        ans = new HashMap<>();

            for (String fruit : fruits) {

                HashMap<Character, Integer> count = new HashMap<>();


                for(int i=0;i<fruit.length();i++) {
                    char ch = fruit.charAt(i);
                    count.put(ch, count.getOrDefault(ch, 0) + 1);
                }

                if(ans.containsKey(count)) {
                    ans.get(count).add(fruit); }
                else {
                    ans.put(count, new ArrayList<>());
                    ans.get(count).add(fruit); }

            }
        return new ArrayList<>(ans.values());        
        }
    }

