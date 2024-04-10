public class NeonNumber {
    public static void main(String[] args) {
        int n = 9, sqr = n*n,sum = 0;
        while(sqr>0) {
            sum+=sqr%10;
            sqr/=10;
        }
        System.out.println(sum == n ? "NeonNumber": "NotNeonNumber");
    }
}

//output:
// 9 => 9*9 =>81 =>8+1 => 9