package IPA;

public class IPAVowelCount {

    static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return true;
        return false;
    }
    public static void main(String[] args) {
        String str = "PradEep kumar!".toLowerCase();
        int n = str.length();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch))
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println(vowels + " " + consonants);
    }
}

/*
 * ## Problem Statement
 * 
 * Write a Java program to count both vowels and consonants in a given string
 * 
 * ### Conditions
 * 
 * Only alphabets should be considered for counting
 * 
 * ## Input
 * 
 * Hello World!
 * 
 * ## Output
 * 
 * Vowels count - 3
 * Consonants count - 7
 * 
 * ## Explanation
 * 
 * > The vowels in the given string are `e`,`o` and `o` and so the vowels count
 * is 3.
 * > Likewise, the consonants in the given string are `h`,`l`,`l`,`w`,`r`,`l`
 * and `d` and so the count is 7.
 */