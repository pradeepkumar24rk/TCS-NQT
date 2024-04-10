public class DisAriumNumber {
    public static void main(String[] args) {
        int n =175, len = (int)Math.log10(n)+1,sum = 0,temp = n;
        for(int i = len;i>0;i--) {
            sum+=Math.pow(temp%10, i);
            temp/=10;
        }
        // System.out.println(sum);
        System.out.println(sum == n ? "DisariumNumber":"Not DisariumNumber");
    }
}
