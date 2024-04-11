package ArrayBasedProblems;
/** 
 * MinMax
 */
import java.util.Arrays;
public class MinMax {
    public static void main(String[] args) {
        int arr[] = {44, 67, 7, 11, 0, 4, 3, 18}, n = arr.length;
        for(int i = 0;i<n-1;i++) {
            for(int j = i+1;j<n;j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0;i<n/2;i++) {
            System.out.println("MIN: "+ arr[i]+ " Max: "+ arr[n-1-i]);
        }
    }
}