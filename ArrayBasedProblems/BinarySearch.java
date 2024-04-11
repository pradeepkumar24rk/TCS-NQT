package ArrayBasedProblems;
import java.util.Arrays;

public class BinarySearch {

    static boolean binearSearch(int arr[],int target) {
        int i = 0,j=arr.length-1;
        while(i<j) {
            int mid = (i+j)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid]<target)
                i=mid+1;
            else if(arr[mid]>target)
                j=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {4,7,11,14,88,77};
        Arrays.sort(a);
        int target = 89;
        System.out.println(binearSearch(a, target)? "founded":"not founded");
    }
}
