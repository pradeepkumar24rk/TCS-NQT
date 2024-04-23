import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagram {

    // static List<Integer> groupAnagram(String[] arr) {
            // Map<String, List<String>> map = new HashMap();
            // for(String word: strs) {
            //     char[] arr = word.toCharArray();
            //     Arrays.sort(arr);
            //     String sortedWord = String.valueOf(arr);
                
            //     map.putIfAbsent(sortedWord, new ArrayList());
            //     map.get(sortedWord).add(word);
            // }
            
            // return new ArrayList(map.values());
    // }
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list1 = new ArrayList<>();
        String arr[] = { "ddddddddddg","dgggggggggg" };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            ArrayList<String> list2 = new ArrayList<>();
            if (arr[i] == "")
                continue;
            list2.add(arr[i]);
            for (int j = i + 1; j < n; j++) {
                if (arr[i].length() == arr[j].length()) {
                    char s1[] = arr[i].toCharArray(),s2[] = arr[j]. toCharArray();
                    Arrays.sort(s1);
                    Arrays.sort(s2);
                    String c1 = new String(s1), c2 = new String(s2);
                    System.out.println(c1+" "+c2);
                    if (c1.equals(c2)) {
                        list2.add(arr[j]);
                        arr[j] = "";
                    }
                }
            }
            list1.add(list2);
        }
        System.out.println(list1);
    }
}
