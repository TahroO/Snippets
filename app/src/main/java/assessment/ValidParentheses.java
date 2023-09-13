package assessment;

public class ValidParentheses {

    boolean isValid = false;

    public ValidParentheses(String input) {
        isValid = checkParentheses(input);
    }

    private boolean checkParentheses(String input) {
        if (input.length() <= 1) {
            return false;
        }
        if (input.length() == 2) {
            char char1 = input.charAt(0);
            char char2 = input.charAt(1);
            if (char1 == '(' && char2 != ')') {
                return false;
            }
            if (char1 == '{' && char2 != '}') {
                return false;
            }
            if (char1 == '[' && char2 != ']') {
                return false;
            }
            return true;
        }
        for (int i = 0; i < input.length(); i++) {
            char charToCheck = input.charAt(i);
            if (i <= input.length() - 2) {
                if (charToCheck == '(' && input.charAt(i + 1) != ')') {
                    return false;
                }
                if (charToCheck == '{' && input.charAt(i + 1) != '}') {
                    return false;
                }
                if (charToCheck == '[' && input.charAt(i + 1) != ']') {
                    return false;
                }
            }
        }
        return true;
    }

}
