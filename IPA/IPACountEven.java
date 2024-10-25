package IPA;

public class IPACountEven {
    public static void main(String[] args) {
        int n = 136465279,count=0;
        while(n!=0){
            int rem = n%10;
            if(rem%2==0)
                count++;
            n/=10;
        }
        if(count>3)
            System.out.println(count);
        else
            System.out.println("IT IS NOT A VALID NUMBER");
    }
}

/*
 * COUNT EVEN NUMBER
 * 
 * GIVEN A INT NUMBER PRINT THE NUMBER OF EVEN DIGITS IF IT IS GREATER THAN 3 PRINT RESULT
 * OTHER THAN PRINT " IT IS NOT A VALID NUMBER "
 * 
 * INPUT 1.----> 4536782
 * 
 * OUTPUT 1.----> 4
 * 
 * 
 * INPUT 2---> 1365279
 * 
 * OUTPUT 2 --> IT IS NOT A VALID NUMBER
 */