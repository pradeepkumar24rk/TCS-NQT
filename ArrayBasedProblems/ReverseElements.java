package ArrayBasedProblems;
public class ReverseElements {
    public static void main(String[] args) {
        int arr[] = {40,11,78,82,90};
        for(int i=0;i<arr.length;i++) {
            int n = arr[i],rev = 0;
            while(n!=0) {
                rev = rev*10+ n%10;
                n/=10;
            }
            System.out.print(rev+" ");
        }
    }
}
