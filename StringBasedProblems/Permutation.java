public class Permutation {

    public static void display(String s, String res) {
        if(s.length()==0) {
            System.out.println(res);
            return;
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            String r = s.substring(0, i)+s.substring(i+1);
            display(r, res+ch);
        }
    }
    public static void main(String[] args) {
        String s = "123";
        display(s,"");
    }
}
