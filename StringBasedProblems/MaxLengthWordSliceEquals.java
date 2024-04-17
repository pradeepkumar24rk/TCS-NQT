public class MaxLengthWordSliceEquals {
    static int avalWord(String strarr[], String ss,int index) {
        for(int i = 0;i<strarr.length;i++) {
            if(strarr[i].contains(ss) && index !=i)
                return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "Welcome to wela";
        String strarr[] = str.split(" ");
        String s = strarr[0];
        int index = 0;
        for(int i =1;i<strarr.length;i++) {
            if(s.length()<strarr[i].length()){
                s = strarr[i];
                index = i;
            }
        } 
        String ss = s.substring(0, s.length()/2).toLowerCase();
        System.out.println(avalWord(strarr, ss, index));
        System.out.println(ss);
        
    }
}
