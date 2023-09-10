package assessment;

public class LongestPrefix {
    String prefixString = "";

    public LongestPrefix(String[] strings) {
        prefixString = prefixCheck(strings);
    }

    protected String prefixCheck(String[] strings) {
        if (strings.length == 1) {
            return strings[0];
        }
        String output = "";
        String firstWord = strings[0];
        for (int i = 1; i < strings.length; i++) {
            String secondWord = strings[i];
            for (int j = 0; j <= firstWord.length() - 1; j++) {
                if (output.length() == secondWord.length()) {
                    break;
                }
                char charOne = firstWord.charAt(j);
                char charTwo = secondWord.charAt(j);
                if (firstWord.equals(output)) {
                    return output;
                } else if (isMatch(charOne, charTwo)) {
                    output += charOne;
                } else {
                    return output;
                }
            }
        }
        return output;
    }

    protected boolean isMatch(char a, char b) {
        return (a == b);
    }
}
