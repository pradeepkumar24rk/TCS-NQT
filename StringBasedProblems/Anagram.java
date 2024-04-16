package StringBasedProblems;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) 
            return false;
        for(int i = 0;i<a.length();i++) {
            if(! b.contains(a.charAt(i)+""))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "abcd",b = "bcad";
        System.out.println(isAnagram(a, b));
    }
}
