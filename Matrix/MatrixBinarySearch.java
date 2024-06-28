package Matrix;

import java.util.Arrays;

public class MatrixBinarySearch {

    public static int[] BinarySearch(int arr[][],int target) {
        int row = 0,col=arr[0].length-1;
        while(row<arr.length && col>=0) {
            if(arr[row][col] == target)
                return new int[] {row,col};
            else if(arr[row][col] < target)
                row++;
            else
                col--;
        }
        return new int[] {-1,-1};
    }
    
    public static int[] BinarySearchMethod2(int arr[][],int target) {
        int row = 0,col=arr[0].length;
        int l = 0,r = row*col-1;
        while(l<=r) {
            int mid = (l+r)/2;
            int tr = mid/col;
            int tc = mid%col;
            int val = arr[tr][tc];
            if(val == target)
                return new int[] {tr,tc};
            else if(val>target)
                r = mid-1;
            else
                l=mid+1;
        }
        return new int[] {-1,-1};
        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Arrays.toString(BinarySearch(arr,7)));
        System.out.println(Arrays.toString(BinarySearchMethod2(arr,7)));
    }
}
