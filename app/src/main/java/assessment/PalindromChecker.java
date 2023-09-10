package assessment;

public class PalindromChecker {

    protected String convertedString = "";
    protected String revertedString = "";
    protected boolean isPalindrom = false;

    public PalindromChecker(int numberToCheck) {
        convertedString = convertIntToString(numberToCheck);
        revertedString = revertString(convertedString);
        isPalindrom = equalCheck(convertedString, revertedString);
    }

    protected boolean equalCheck(String original, String reverted) {
        return (original.equals(reverted));
    }

    protected String revertString(String input) {
        String output = "";
        int length = input.length() - 1;
        while (length >= 0) {
            output += input.charAt(length);
            length -= 1;
        }
        return output;
    }

    protected String convertIntToString(int input) {
        String output = String.valueOf(input);
        return output;
    }
}
