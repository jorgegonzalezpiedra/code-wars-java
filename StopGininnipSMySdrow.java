import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StopGininnipSMySdrow {

    // Write a function that takes in a string of one or more words,
    // and returns the same string, but with all five or more letter words reversed
    // (Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
    // Spaces will be included only when more than one word is present.

    public static void main(String[] args) {
        System.out.println(spinWords("Just kidding there is still one more"));
    }

    /**
     * Method to swap all words of >= 5 characters
     *
     * <pre>
     *
     * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
     * spinWords( "This is a test") => returns "This is a test"
     * spinWords( "This is another test" )=> returns "This is rehtona test"
     *
     * </pre>
     *
     * @param sentence with the words to reverse
     * @return String sentence with reversed words
     */
    public static String spinWords(String sentence) {
        String result = "";

        result = Stream.of(sentence.split(" "))
                .map(word -> {
                    if (word.length() >= 5) {
                        return new StringBuilder(word).reverse();
                    }else{
                        return word;
                    }
                })
                .collect(Collectors.joining(" "));

        return result;
    }

}
