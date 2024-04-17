

import java.util.Scanner;

public class MaxWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<str.length;i++) {
            if(max<str[i].length())
                max = str[i].length();
        }
        System.out.println(max);
        sc.close();
    }
}
