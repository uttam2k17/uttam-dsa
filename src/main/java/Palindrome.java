import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        //rev of word is a palindrome
        String str = "racecar";
        //tostring can be replace by contentEquals
        System.out.println(str.contentEquals(new StringBuilder(str).reverse()) ?
               "palindrome" : "not palindrome");

        //reversing whole word and checking palindrome or not
        String rev = IntStream.range(0, str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length()-1-i)))
                .collect(Collectors.joining());
        System.out.println(rev.equals(str) ? "palindrome "+ rev : "not palindrome " + rev);

        //every word is a palindrome or not
        String words = Arrays.stream(str.split("\\s+"))
                .map(w -> IntStream.range(0, w.length())
                        .mapToObj(j -> String.valueOf(w.charAt(w.length()-1-j)))
                        .collect(Collectors.joining())).collect(Collectors.joining(" "));
        System.out.println(words.equals(str) ? "palindrome "+ words +"hello" : "not palindrome " + words);

    }
}
