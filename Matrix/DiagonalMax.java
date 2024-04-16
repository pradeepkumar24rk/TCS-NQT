package Matrix;

public class DiagonalMax {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = 3,col = 3,max = Integer.MIN_VALUE;
        for(int i=0;i<row;i++) {
            for(int j = 0;j<col;j++) {
                if(i==j && arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
