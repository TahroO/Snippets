package assessment;

public class LongestPrefix {
    String prefixString = "";

    public LongestPrefix(String[] strings) {
        prefixString = prefixCheck(strings);
    }

    protected String prefixCheck(String[] strings) {
        String output = "";
        String firstWord = strings[0];
        for (int i = 1; i < strings.length; i++) {
            String secondWord = strings[i];
            for (int j = i - 1; j < firstWord.length(); j++){
                char charOne = firstWord.charAt(j);
                char charTwo = secondWord.charAt(j);
                if (isMatch(charOne, charTwo)) {
                    output += charOne;
                    break;
                } else {
                    return output;
                }
            }
        }
        return output;
    }


    protected boolean isMatch(char a, char b) {
        return(a == b);
    }
}
