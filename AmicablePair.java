public class AmicablePair {
    public static void main(String[] args) {
        int x = 220, y = 284;
        int i=1,sum1=0,sum2 = 0, n = x;
        while(i<n) {
            if(n%i==0 && n==x)
                sum1+=i;
            else if (n%i==0 && n==y)
                sum2+=i;
                
            if(i==n-1 && n==x){
                n=y;
                i=0;
            }
            if(i==n-1 && n==y)
                break;
            i++;
        }
        System.out.println(sum1+" "+sum2);
        System.out.println(sum1==y && sum2 == x? "AmicablePair":"Not AmicablePair");
    }
}
