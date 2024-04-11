/**
 * StringCountEquals
 */
public class StringCountEquals {

    public static void main(String[] args) {
        String s = "**###";
        int starCount = 0, hashCount = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i)=='#')
                hashCount++;
            else
                starCount++;
        }
        if(hashCount == starCount)
            System.out.println("0");
        else
            System.out.println(starCount-hashCount);
    }
}