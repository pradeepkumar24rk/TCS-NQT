package ArrayBasedProblems;
public class DecreaseOrder {

    static boolean isDecreaseOrder(int arr[]) {
        int max = Integer.MAX_VALUE;
        for(int i: arr) {
            if(max>i){
                max = i;
            } else 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {67,17,7,10,4,3};
        System.out.println(isDecreaseOrder(arr)? arr[0]:arr[arr.length-1]);
    }
}
