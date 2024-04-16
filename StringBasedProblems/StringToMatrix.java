package StringBasedProblems;

import java.util.Arrays;

public class StringToMatrix {
    public static void main(String[] args) {
        String s = "pradeepkumar24rk";
        char a[][] = new char[4][4];
        int k =0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
                a[i][j] = s.charAt(k);
                k++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
