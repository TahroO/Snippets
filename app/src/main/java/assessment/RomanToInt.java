package assessment;

/**
 * This class represents a converter class to generate integer values out of a given "roman" String.
 *
 * @author TahroO
 * @version v.2023.09.10
 *
 */
public class RomanToInt {

    int value = 0;

    /**
     * constructor for converter
     * @param input The String which holds roman letters in Format "III"
     *              Allowed letters are: "I","V","X","L","C","D","M"
     */
    public RomanToInt(String input) {
        value = calculateValue(input);
    }

    /**
     * Method which converts a provided String from "roman" to its integer representation.
     * @param input The String which should be converted.
     * @return The integer representation of the whole input String.
     */
    protected int calculateValue(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int number = convertRomToInt(input.charAt(i));
            char actualChar = input.charAt(i);
            if (i + 1 != input.length()) {
                char nextChar = input.charAt(i + 1);
                // check if position is left to subtract instead of add
                if (actualChar == 'I' && (nextChar == 'V' || nextChar == 'X')) {
                    result -= number;
                    continue;
                } else if (actualChar == 'X' && (nextChar == 'L' || nextChar == 'C')) {
                    result -= number;
                    continue;
                } else if (actualChar == 'C' && (nextChar == 'D' || nextChar == 'M')) {
                    result -= number;
                    continue;
                }
            }
            result += number;
        }
        return result;
    }

    /**
     * Helper method to convert a given roman format char into its integer representation.
     * @param character The roman char which should be converted.
     * @return The integer representation of the provided char.
     */
    protected int convertRomToInt(char character) {
        switch (character) {
            case 'I' -> {
                return 1;
            }
            case 'V' -> {
                return 5;
            }
            case 'X' -> {
                return 10;
            }
            case 'L' -> {
                return 50;
            }
            case 'C' -> {
                return 100;
            }
            case 'D' -> {
                return 500;
            }
            case 'M' -> {
                return 1000;
            }
        }
        return 0;
    }
}
