import java.util.Arrays;

public class RailwayTimeFormate {
    public String largestTimeFromDigits(int[] arr)
    {
        Arrays.sort(arr);
        String result = "";
        for (int h = 23; h >= 0; h--)
        {
            for (int m = 59; m >= 0; m--)
            {
                int[] digits = { h / 10, h %10, m / 10, m % 10 };
                Arrays.sort(digits);
                if (Arrays.equals(arr, digits))
                {
                    result = String.format("%02d:%02d", h, m);
                    return result;
                }
            }
        }
        return result;
    }  
}
