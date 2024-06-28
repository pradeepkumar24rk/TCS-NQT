import java.util.HashMap;
import java.util.Map;

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
    static boolean advancedAnagram(String a, String b) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int n1 = a.length(),n2 = b.length();
        for(int i=0;i<n1;i++) {
            if(map1.containsKey(a.charAt(i)))
                map1.put(a.charAt(i), map1.get(a.charAt(i))+1);
            else
                map1.put(a.charAt(i), 1);
        }
        for(int i=0;i<n1;i++) {
            if(map2.containsKey(a.charAt(i)))
                map2.put(a.charAt(i), map2.get(a.charAt(i))+1);
            else
                map2.put(a.charAt(i), 1);
        }
        System.out.println(map1+" "+map2);
        for(Map.Entry m: map1.entrySet()) {
            if(!((map2.containsKey(m.getKey()))&& (map2.get(m.getKey())==m.getValue()))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "abcd",b = "bcad";
        System.out.println(isAnagram(a, b));
        
        a = "hari";
        b = "ranjth";
        System.out.println(advancedAnagram(a, b));
        
    }
}
