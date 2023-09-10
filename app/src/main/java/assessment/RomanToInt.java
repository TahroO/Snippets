package assessment;

public class RomanToInt {

    int value = 0;

    public RomanToInt(String input) {
        value = calculateValue(input);
    }

    protected int calculateValue(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int number = convertRomToInt(input.charAt(i));
            char actualChar = input.charAt(i);
            if (i + 1 != input.length()) {
                char nextChar = input.charAt(i + 1);
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
