public class MomentOfString {

    public static void displayArr(char arr[]) {
        int n = arr.length;
        for(int g = 0;g<n;g++) {
            System.out.print(arr[g]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String a = "123456";
        String s = "RLTDRRTRS2S1";
        int n = a.length(),sn = s.length();
        char arr[] = a.toCharArray();
        int i = 0,j=0;
        while(i<sn) {
            switch(s.charAt(i)) {
                case 'R':
                    j++;
                    break;
                case 'L':
                    j--;
                    break;
                case 'T':
                    arr[j]++;
                    break;
                case 'D':
                    arr[j]--;
                    break;
                case 'S':
                    int k = Integer.parseInt(s.charAt(i+1)+"")-1;
                    char temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    
            }
            if(s.charAt(i)=='S'){
                i+=2;
                // System.out.println(i);
            }
            else
                i++;
            
        }
        // System.out.println(arr.toString());
        
        
    }
}
