/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package assessment;

public class App {

    public static void main(String[] args) {
//       PalindromChecker palindromChecker = new PalindromChecker(121);
//        System.out.println(palindromChecker.isPalindrom);

//        RomanToInt romanToInt = new RomanToInt("MCMXCIV");
//        System.out.println(romanToInt.value);

        String[] StringArray = {"flower","flow","flight"};
        LongestPrefix longestPrefix = new LongestPrefix(StringArray);
        System.out.println(longestPrefix.prefixString);

    }
}
