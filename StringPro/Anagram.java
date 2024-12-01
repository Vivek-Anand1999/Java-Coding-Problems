package StringPro;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "code";
        String str2 = "DOCE";
        String first = "java";
        String second = "python";
//        System.out.println(first.compareTo(second)); //0
        String n = "123";
        Integer k = Integer.valueOf(n);
        int p = Integer.parseInt(n);
        System.out.println(k);

    }

    public static void anagramCheck(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char[] firstWord = str1.toCharArray();
        char[] secondWord = str2.toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);
        if (firstWord.length != secondWord.length || !Arrays.equals(firstWord, secondWord)) {
            System.out.println("Not Anagram");
        } else {
            System.out.println("Anagram");
        }
    }
}
