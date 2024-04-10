public class ArmStrongNumber {
    public static void main(String[] args) {
        int n = 153, temp = n;
        int len =(int)Math.log10(n)+1;
        // System.out.println(len);
        int sum = 0;
        while(temp>0) {
            // System.out.print(Math.pow(temp%10, len)+" ");
            sum+=Math.pow(temp%10, len);
            temp/=10;
        }
        // System.out.println(sum);
        System.out.println(sum == n? "ArmstrongNumber" :"Not ArmstrongNumber" );
    }
}
