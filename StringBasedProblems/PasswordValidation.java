

public class PasswordValidation {

    static boolean isValidPassword(String password) {
        int n = password.length();
        if(n<11 || n>20)
            return false;
        int dig = 0, special =0,uppercase =0;
        for(int i =0;i<n;i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch))
                dig++;
            else if(Character.isUpperCase(ch))
                uppercase++;
            else if(!Character.isAlphabetic(ch) && !Character.isDigit(ch))
                special++;
        }
        
        if(dig==0 || special ==0||uppercase == 0 )
            return false;
        else if(dig<3||uppercase<4)
            return false;
        
        return true;
    }
    public static void main(String[] args) {
        String password = "PRADeep123@kumar";
        System.out.println(isValidPassword(password)? "Yes": "No");
    }
}
