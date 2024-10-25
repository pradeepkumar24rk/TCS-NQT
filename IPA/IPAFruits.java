package IPA;

import java.util.Scanner;

public class IPAFruits {

    static Fruits findMaxmumPriceByRating(Fruits obj[], int targetRating) {
        int max = Integer.MIN_VALUE;
        Fruits res = null;
        for (Fruits i : obj) {
            if (i.getPricePerKg() > max && i.getRating() > targetRating) {
                max = i.getPricePerKg();
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fruits obj[] = new Fruits[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int pricePerKg = sc.nextInt();
            int rating = sc.nextInt();
            obj[i] = new Fruits(id, name, pricePerKg, rating);
        }
        int targetRating = sc.nextInt();
        Fruits maxFruits = findMaxmumPriceByRating(obj, targetRating);
        System.out.println(maxFruits == null ? "No such fruits" : maxFruits.getId());
        sc.close();
    }
}

class Fruits {
    private int id;
    private String name;
    private int pricePerKg;
    private int rating;

    Fruits(int id, String name, int pricePerKg, int rating) {
        this.id = id;
        this.name = name;
        this.pricePerKg = pricePerKg;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getRating() {
        return rating;
    }
}

/*
 * CREATE A CLASS FRUITS WITH BELOW ATTRIBUTE :
 * 
 * FRUIT-ID = INT
 * FRUIT-NAME = STRING
 * FRUIT-PRICE = INT(PER KG)
 * FRUIT-RATING - INT
 * 
 * WRITE SETTER, SETTER AND PARAMETERIZED CONSTRUCTOR AS REQUIRED
 * 
 * CREATE A MYCLASS WITH MAIN METHOD
 * 
 * IMPLEMENT ONE STATIC METHOD IN IT findMaxmumPriceByRating in MYCLASS CLASS
 * 
 * findMaxmumPriceByRating - this mehtod will take two inputs
 * 1. arrays of fruits objects
 * 2. int parameter.
 * THIS MEHTOD WILL RETURN MAXIMUM PRICED FRUIT OBJECT FROM ARRAY OF
 * FRUITS OBJECT WHICH HAS RATING GREATER THAN THE GIVEN RATING(INT PARAMETER
 * PASSED)
 * IF NO FRUIT WILL THE ABOVE CONDITION IS PRESENT IN THE ARRAY OF
 * FRUIT OBJECTS THEN THE METHOD SHOULD RETURN NULL
 * 
 * IN MAIN MEHTOD THE RETURNED FRUIT OBJEFCT SHOULD PRINT FRUIT-ID
 * IF IT IS NOT NULL OTHER THAN PRINT "NO SUCH FRUIT"
 * 
 * USE SCANNER TO READ 4 FRUIT OBJECT AND A INT PARAMETER
 * 
 * INPUT 1
 * 111
 * APPLE
 * 200
 * 5
 * 222
 * ORANGE
 * 150
 * 4
 * 333
 * BANANA
 * 100
 * 4
 * 444
 * AVOCADO
 * 250
 * 4
 * 5
 * 
 * OUTPUT 1
 * NO SUCH Fruits
 */