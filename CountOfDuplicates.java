import java.util.ArrayList;

public class CountOfDuplicates {

    // Write a function that will return the count of distinct case-insensitive
    // alphabetic characters and numeric digits that occur more than once in the input string.
    // The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
    public static void main(String[] args) {

        System.out.println(duplicateCount("abcdeaB"));

    }

    /**
     * Method that will count the number of duplicate characters in a String
     *
     * <pre>
     *
     * "abcde" -> 0 # no characters repeats more than once
     * "aabbcde" -> 2 # 'a' and 'b'
     * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
     * "indivisibility" -> 1 # 'i' occurs six times
     * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
     * "aA11" -> 2 # 'a' and '1'
     * "ABBA" -> 2 # 'A' and 'B' each occur twice
     *
     * </pre>
     *
     * @param text {@link String} String to work with
     *
     * @return int with the number of characters that are duplicated in the Stirng
     */
    public static int duplicateCount(String text){

        String textLower = text.toLowerCase();
        ArrayList<Character> duplicatesChars = new ArrayList<Character>();

        for(int i = 0 ; i < textLower.length() ; i++){

            char a = textLower.charAt(i);

            for(int x = i ; x < textLower.length() ; x++){

                if(x != i && textLower.charAt(x) == textLower.charAt(i) && !duplicatesChars.contains((Character) a)){
                    duplicatesChars.add((Character) a);
                }

            }

        }

        return duplicatesChars.size();
    }

    //OTHER SOLUTIONS

    /*public static int duplicateCount(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toLowerCase().toCharArray()) {
            map.put(c, map.containsKey(c) ? 1 : 0);
        }
        return (int) map.values().stream().filter(e -> e > 0).count();
    }*/

    /*public static int duplicateCount(String text) {
        Set<String> count = new HashSet<>();

        for (String string : text.toLowerCase().split("")) {
            if (text.toLowerCase().indexOf(string) != text.toLowerCase().lastIndexOf(string)) count.add(string);
        }

        return count.size();
    }*/
}
