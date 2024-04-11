package ArrayBasedProblems;
import java.util.Arrays;
public class KreverseCount {
    public static void main(String[] args) {
        int arr[] = {19,41,22292,33,99,90}, k = 0;
        int temp = 92;
        while(temp!=0){
            k = k*10+temp%10;
            temp/=10;
        }
        
        int mod = (int)Math.pow(10, (int)Math.log10(k)+1),count=0;
        
        for(int i =0;i<arr.length;i++) {
            int n = arr[i],rev = 0;
            while(n!=0) {
                rev = rev*10 + n%10;
                n/=10;
            }
            arr[i] = rev;
            
            while(rev!=0) {
                if(rev%mod == k)
                    count++;
                rev/=10;
            }
        }
        
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}


