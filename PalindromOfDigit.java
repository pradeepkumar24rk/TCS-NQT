public class PalindromOfDigit {
    public static void main(String[] args) {
        String s1 = "161",s2 ="";
        for(int i =s1.length()-1;i>=0;i--){
            s2 += s1.charAt(i)+"";
        }
        if(s1.equals(s2)) {
            System.out.println("yes");
            System.out.println(Integer.parseInt(s2));
        } else {
            System.out.println("no "+s2);
        }
    }
}