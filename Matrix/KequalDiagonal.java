package Matrix;

public class KequalDiagonal {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = 3,col = 3,k= 753;
        if(row==col && row == (int)Math.log10(k)+1){
            for(int i=0;i<row;i++) {
                for(int j = 0;j<col;j++) {
                    if(i==j || j == col-1-i) {
                        if(arr[i][j]==k%10){
                            k/=10;
                            if(i == 0 || i == col-1 )
                            System.out.println(i+" "+ j);
                        }
                    }
                }
            }
        }
        System.out.println(k==0? "yes":"no");
    }
}
