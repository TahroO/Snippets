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
            for (int j = i - 1; j < firstWord.length() - 1; j++){
                char charOne = firstWord.charAt(j);
                char charTwo = secondWord.charAt(j);
                if (output.length() == secondWord.length()) {
                    break;
                }
                if (firstWord.equals(output)) {
                    return output;
                }else if (isMatch(charOne, charTwo)) {
                    output += charOne;
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
