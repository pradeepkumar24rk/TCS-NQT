package ArrayBasedProblems;
public class LeftMax {
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,44,50,10,2};
        int max = arr[0],n = arr.length,i=1,count=0;
        while(i<(n/2)){
            if(max<arr[i])
                max = arr[i];
            i++;
        }
        System.out.println("Left max: "+max);
        for(int j = n/2 ;j<n;j++) {
            if(arr[j]%max == 0)
                count++;
        }
        System.out.println("Right Divisible: "+count);
    }
}
