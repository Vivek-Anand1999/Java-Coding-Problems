import java.util.Arrays;

//! To compare the content of two array --> Arrays.equals(one, two)

public class Anagram {
    public static void main(String[] args) {
        String word1 = "vivek";
        String word2 = "kevivw";

        if(word1.length() != word2.length()){
            return;
        }

        char[] one = word1.toCharArray();
        char[] two = word2.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);

        if(Arrays.equals(one, two)){
            System.out.println("Angaram");
        }
        else{
            System.out.println("NO Anagram");
        }
    }
}
