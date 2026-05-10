import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "racecar madam";
        str.equals(new StringBuilder(str).reverse().toString());
        String rev = IntStream.range(0, str.length())
                .mapToObj(i -> String.valueOf(str.charAt(str.length()-1-i)))
                .collect(Collectors.joining());
        System.out.println(rev.equals(str) ? "palindrome "+ rev : "not palindrome " + rev);

        String words = Arrays.stream(str.split("\\s+"))
                .map(w -> IntStream.range(0, w.length())
                        .mapToObj(j -> String.valueOf(w.charAt(w.length()-1-j)))
                        .collect(Collectors.joining())).collect(Collectors.joining(" "));
        System.out.println(words.equals(str) ? "palindrome "+ words : "not palindrome " + words);

    }
}
