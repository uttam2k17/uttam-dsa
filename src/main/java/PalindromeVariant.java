import java.util.Arrays;
import java.util.stream.IntStream;

public class PalindromeVariant {
    public static void main(String[] args) {
        String word = "racecar";
        //every word is a palindrome just check previous variant has reverse logic
        boolean b = IntStream.range(0, word.length()/2)
                .allMatch(i -> word.charAt(i) == word.charAt(word.length()-1-i));
        System.out.println(b ? "single palindrome" : "single words not palindrome");

        boolean rev = Arrays.stream(word.split("\\s+"))
                .allMatch(w -> IntStream.range(0, w.length()/2)
                        .allMatch(i -> w.charAt(i) == w.charAt(w.length()-1-i)));
        System.out.println(rev ? "all words palindrome" : "words not palindrome");

    }
}
