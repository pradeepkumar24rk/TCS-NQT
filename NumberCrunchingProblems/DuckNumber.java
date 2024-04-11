package NumberCrunchingProblems;
public class DuckNumber {
    static boolean isDuckNumber(int n) {
        String s = n+"";
        if(s.charAt(0) == '0')
            return false;
        int flag=0;
        while(n>0) {
            if(n%10 == 0)
                flag = 1;
            n/=10;
        }
        if(flag == 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        int n = 1071;
        System.out.println(isDuckNumber(n)?"DuckNumber": "Not DuckNumber");
    }
}
