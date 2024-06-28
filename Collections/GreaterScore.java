package Collections;

import java.util.Arrays;


public class GreaterScore {
    public static void main(String[] args) {
        int score[] = {20,50,40,30,10,90,70};
        String name[] = {"pradeep","kumar","ajith","pradeep","krish","lolita","nisha"};
        int n = score.length;
        for(int i=0;i<n-1;i++) {
            for(int j = i+1;j<n;j++) {
                if(score[i]<score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                    String t = name[i];
                    name[i] = name[j];
                    name[j] = t;
                }
            }
        }
        
        System.out.println(Arrays.toString(name));
        System.out.println(Arrays.toString(score));
        for(int i = 0;i<3;i++) {
            System.out.println(name[i]+" "+score[i]);
        }
    }
}
