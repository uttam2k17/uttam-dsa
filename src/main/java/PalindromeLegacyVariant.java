import java.util.Arrays;

public class PalindromeLegacyVariant {
    public static void main(String[] args) {
        String str = "racecar madam";
        boolean allWordsPalindrome = Arrays.stream(str.split("\\s+"))
                .allMatch(word -> word.equals(new StringBuilder(word).reverse().toString()));

        //below code is to check whole sentence is a palindrome by removing spaces
        //if want word wise check can do split and travserse every word in that method
//        String[] words = str.split("\\s+");
//
//        boolean allWordsPalindrome = true;
//        for (String word : words) {
//            if (!isPalindrome(word)) {
//                allWordsPalindrome = false;
//                break; // stop early if one fails
//            }
//        }
        int left = 0;
        int right = str.length()-1;
       boolean p = extracted(left, right, str);
       System.out.println(p ? "palindrome" : "not palindrome");
    }

    private static boolean extracted(int left, int right, String str) {
        while (left < right) {
            char i = str.charAt(left);
            char j = str.charAt(right);
            while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
                i = str.charAt(left);
            }
            while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
                j = str.charAt(right);
            }
            if (i != j) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
