package ArrayBasedProblems;
public class EvenIndexNegative {
    public static void main(String[] args) {
        int arr[] = {1,-2,-3,5,6,-5,-1};
        for(int i = 0;i<arr.length;i++) {
            if(i%2==0 && arr[i]<0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
