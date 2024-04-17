import java.util.Arrays;

public class Pangram {

    static boolean isPangram(String s) {
        for (char i = 'a'; i <= 'z'; i++) {
            int k = i - 32;
            char c = (char) k;
            if (!(s.contains(i + "") || s.contains(c + ""))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "Qwer".toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            int k = i - 32;
            char c = (char) k;
            if (!(s.contains(i + "") || s.contains(c + ""))) {
                sb.insert(index, i);
                index++;
            }
        }
        char arr[] = sb.toString().toCharArray();
        Arrays.sort(arr);
        s = new String(arr); 
        System.out.println(s);
        System.out.println(sb.length());
    }
}
