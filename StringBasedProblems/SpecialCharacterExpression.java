public class SpecialCharacterExpression {
    static String filter(String s) {
        String r = "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '>' || s.charAt(i) == '<' || s.charAt(i) == '#')
                r += s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {
        String s = ">12>><##>>#>>>";
        s = filter(s);
        System.out.println(s);
        int k = 7, len = s.length();
        int i = 0;
        while (i < len) {
            while (i < len && s.charAt(i) == '>') {
                k++;
                i++;
            }
            while (i < len && s.charAt(i) == '<') {
                k--;
                i++;
            }
            int flag = 0;
            while (i < len && s.charAt(i) == '#') {
                if (flag == 0)
                    k = 0;
                if (flag == 1)
                    k--;
                flag = 1;
                i++;
            }
        }
        System.out.println(k);
    }
}
