package assessment;

public class MergeString {

    String output = "";
    public MergeString(String word1, String word2) {
        output = stringBreaker(word1, word2);
    }

    protected String stringBreaker(String word1, String word2) {
        String output = "";
        int length = Math.max(word1.length(), word2.length());
        for(int i = 0; i < length - 1; i++) {
            if (i >= word1.length()) {
                output += word2.substring(i);
                break;
            }
            if (i >= word2.length()) {
                output += word1.substring(i);
                break;
            } else {
                output += word1.charAt(i);

                output += word2.charAt(i);
            }
        }
        return output;
    }
}
