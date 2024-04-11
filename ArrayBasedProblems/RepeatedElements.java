package ArrayBasedProblems;
import java.util.Arrays;
public class RepeatedElements {
    public static void main(String[] args) {
        int arr[] = {1,2,44,55, 33,44,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length, val = arr[0],count = 1,i=1;
        while(i<n) {
            if(val == arr[i])
                count++;
            else{
                System.out.println("Value: "+val+" "+"count: "+count);
                val = arr[i];
                count = 1;
            } 
            i++;
        }
    }
}
