package ArrayBasedProblems;

public class SubArrayMax {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3, n = a.length;
        
        for(int i = 0;i<=n-k;i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i;j<i+k;j++) {
            System.out.print(a[j]+" ");
                if(max<a[j])
                    max = a[j];
            }
            System.out.println();
            System.out.println(max+" ");
        }
    }
}
