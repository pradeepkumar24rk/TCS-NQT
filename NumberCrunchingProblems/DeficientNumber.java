package NumberCrunchingProblems;
public class DeficientNumber {
    public static void main(String[] args) {
        int n = 21,sum = 0;
        for(int i=1;i<=n;i++)
            if(n%i == 0)
                sum+=i;
        System.out.println(sum < n*2? "DeficientNumber": "Not DeficientNumber");
    }
}
