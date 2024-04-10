public class DivisibleOfTen {
    public static void main(String[] args) {
        int n1 = 15,n2 = 30;
        String s1 = "",s2 ="";
        for(int i = n1;i<=n2;i++) {
            if(i%10==0)
                s1+=i+" ";
            else 
                s2+=i+" ";
                
        }
        System.out.println(s1+s2);
    }
}
