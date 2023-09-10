package assessment;

/**
 * This class represents a palindrome checker for integer values.
 *
 * @author TahroO
 * @version v.2023.09.10
 *
 */
public class PalindromeChecker {

    protected String convertedString = "";
    protected String revertedString = "";
    protected boolean isPalindrome = false;

    /**
     * constructor
     * @param numberToCheck The Number which should be checked for palindrome.
     */
    public PalindromeChecker(int numberToCheck) {
        convertedString = convertIntToString(numberToCheck);
        revertedString = revertString(convertedString);
        isPalindrome = equalCheck(convertedString, revertedString);
    }

    /**
     * Helper Method to check if two provided Strings are equal.
     *
     * @param original The first String.
     * @param reverted The second String.
     * @return true if both Strings are equal.
     */
    protected boolean equalCheck(String original, String reverted) {
        return (original.equals(reverted));
    }

    /**
     * Helper method to reverse a given String.
     *
     * @param input The String which should be reverted.
     * @return The reverted representation of the provided String.
     */
    protected String revertString(String input) {
        String output = "";
        int length = input.length() - 1;
        while (length >= 0) {
            output += input.charAt(length);
            length -= 1;
        }
        return output;
    }

    /**
     * Helper method to convert a given integer value to a String.
     *
     * @param input The integer value.
     * @return The String representation of the input integer value.
     */
    protected String convertIntToString(int input) {
        String output = String.valueOf(input);
        return output;
    }
}
