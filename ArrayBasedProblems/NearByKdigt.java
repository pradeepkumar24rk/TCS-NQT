package ArrayBasedProblems;
public class NearByKdigt {
    public static void main(String[] args) {
        int arr[] = {2,5,6,7,8,3};
        int n = arr.length,k=2;
        for(int i = 0 ;i<n;i++){
            if(arr[i] == k)
                if(i-1 >= 0 && i+1 < n) 
                    System.out.println(arr[i-1]+" "+ arr[i]+" "+arr[i+1]);
                else if(i-1 < 0 && i+1 < n)
                    System.out.println("null"+" "+ arr[i]+" "+arr[i+1]);
                else if(i-1 < 0 && i+1 >= n)
                    System.out.println(arr[i-1]+" "+ arr[i]+" "+"null");
        }
    }
}
