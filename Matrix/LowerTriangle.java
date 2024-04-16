package Matrix;

public class LowerTriangle {

    static boolean isLowerTriangle(int arr[][], int row, int col) {
        for(int i = 0 ;i<row;i++ ) {
            for(int j = i+1;j<col-1;j++) {
                if(arr[i][j]!=0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[][] = {{0,1,0}, 
                       {4,5,0},
                       {5,8,9}};
        int row = 3,col = 3;
        System.out.println(isLowerTriangle(arr, row, col));
        
    }
}
