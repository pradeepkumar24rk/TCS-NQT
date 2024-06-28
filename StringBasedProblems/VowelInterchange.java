public class VowelInterchange {
    public static void main(String[] args) {
        String s = "team terv pro";
        char r[] = s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j) {
            while(r[i]!='a'&&r[i]!='e'&&r[i]!='i'&&r[i]!='o'&&r[i]!='u') {
                i++;
            }
            while(r[j]!='a'&&r[j]!='e'&&r[j]!='j'&&r[j]!='o'&&r[j]!='u') {  
                j--;
            }
            if(i<j){

                char temp = r[i];
                r[i] = r[j];
                r[j] = temp;
            }
            i++;
            j--;
        }
        System.out.println(r.toString());
    }
}
