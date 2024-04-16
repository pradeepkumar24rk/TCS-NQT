package StringBasedProblems;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        String s = "pradeeppradeep", ans = "" ;
        for(int i =0;i<s.length();i++){
            if(ans.indexOf(s.charAt(i))==-1)
                ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}
