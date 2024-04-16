package StringBasedProblems;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV";
        int n = roman.length(), sum = 0;
        int curr = 0, prev = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = roman.charAt(i);
            switch (ch) {
                case 'I':
                    curr = 1;
                    break;
                case 'V':
                    curr = 5;
                    break;
                case 'X':
                    curr = 10;
                    break;
                case 'L':
                    curr = 50;
                    break;
                case 'C':
                    curr = 100;
                    break;
                case 'D':
                    curr = 500;
                    break;
                case 'M':
                    curr = 1000;
                    break;
            }
            if (curr < prev)
                sum -= curr;
            else
                sum += curr;
            prev = curr;

        }
        System.out.println(sum);
        
    }

}
