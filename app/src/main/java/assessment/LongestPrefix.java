package assessment;

public class LongestPrefix {
    String prefixString = "";

    public LongestPrefix(String[] strings) {

    }

    protected String prefixCheck(String[] strings) {
        String output = "";
        String firstWord = strings[0];
        for (int i = 1; i < strings.length; i++) {
            String secondWord = strings[i];
            if (isMatch(firstWord, secondWord)) {

            }
        }
        return output;
    }

    protected boolean isMatch(String firstWord, String secondWord) {
        for(int i = 0; i < firstWord.length(); i++) {
            char firstChar = firstWord.charAt(i);
            char secondChar = secondWord.charAt(i);
            if (firstChar != secondChar) {
                return false;
            }
        }
        return true;
    }
}
