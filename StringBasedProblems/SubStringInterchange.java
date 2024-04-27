public class SubStringInterchange {
    public static void main(String[] args) {
        String s = "abcdefgh";
        int k = 4;
        if(k<=s.length()/2) {
            char[] ar = s.toCharArray();
            int n = ar.length;
            for(int i =0,j = n-k;i<k;i++,j++ ) {
                
                char a = ar[i];
                ar[i] = ar[j];
                ar[j] = a;
            }
            s = new String(ar);
            System.out.println(s);
        } else System.out.println("Invalid number");
    }
}
