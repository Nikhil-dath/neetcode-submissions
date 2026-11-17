
class Solution {

    public String encode(List<String> strs) {

        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < strs.size(); i++) {

            String current = strs.get(i);

            encoded.append(current.length());
            encoded.append("#");
            encoded.append(current);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {


            int delimiter = str.indexOf('#', i);

          
            int length = Integer.parseInt(
                str.substring(i, delimiter)
            );

            int start = delimiter + 1;


            String current = str.substring(start, start + length);


            decoded.add(current);


            i = start + length;
        }

        return decoded;
    }
}
