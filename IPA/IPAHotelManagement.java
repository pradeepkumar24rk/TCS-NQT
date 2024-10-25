package IPA;

import java.util.Scanner;

public class IPAHotelManagement {

    static int hotelByHighestRating(HotelManagement obj[], String cabfacility) {
        int max = Integer.MIN_VALUE;
        for (HotelManagement i : obj) {
            if (i.getCabfacility().equals(cabfacility)) {
                if (max < i.getRating())
                    max = i.getRating();
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HotelManagement obj[] = new HotelManagement[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String cabfacility = sc.nextLine();
            int rating = sc.nextInt();
            int fees = sc.nextInt();
            obj[i] = new HotelManagement(id, name, cabfacility, rating, fees);
        }
        int highrate = hotelByHighestRating(obj, "yes");
        System.out.println(highrate > 5 ? highrate : "NO HOTEL WITH GIVEN FACILITY");
        sc.close();
    }
}

class HotelManagement {
    private int id, rating, fees;
    private String name, cabfacility;

    HotelManagement(int id, String name, String cabfacility, int rating, int fees) {
        this.id = id;
        this.name = name;
        this.cabfacility = cabfacility;
        this.rating = rating;
        this.fees = fees;
    }

    public int getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public int getFees() {
        return fees;
    }

    public String getName() {
        return name;
    }

    public String getCabfacility() {
        return cabfacility;
    }

}

/*
 * HOTEL MANAGEMENT QUESTION
 * 
 * CREATE A CLASS HOTEL WITH BELOW ATTRIBUTE
 * 
 * HOTEL-ID - INT
 * HOTEL-NAME - STRING
 * HOTEL-CABFACILITY - STRING
 * HOTEL-RATING - INT
 * HOTEL-FEES - INT
 * 
 * WRITE GETTER , SETTER AND PARAMETERISED CONSTRUTOR AS REQUIRED .
 * 
 * 
 * CREATE A CLASS SOLUTION AND WRITE MAIN METHOD IN IT INSIDE MAIN MAIN METHOD
 * WRITE 1. STATIC METHOD-- { hotelByHighestRating }
 * 
 * 1. hotelByHighestRating -- in this method two input are taken one is array of
 * HOTEL objects and second is string input which is cabficility of HOTEL
 * if rating is greater than 5 and cabfacuility is availble then output the
 * highest rating if it is not greater than 5 then it should return 0 ;
 * 
 * condition 1 --> if hotel rating below 5 then it should be zero so print ---->
 * "NO HOTEL WITH GIVEN FACILITY"
 * condition 2 --> if hoteL rating greater than 5 and CABFACILITY is yes then
 * print hotel rating
 * 
 * Take 4 HOTEL objects as input and one String cabfacility
 * 
 * 
 * INPUT 1.
 * 
 * 101
 * TAJ
 * YES
 * 7
 * 70000
 * 102
 * RAJ
 * NO
 * 5
 * 30000
 * 103
 * J&J
 * NO
 * 6
 * 40000
 * 104
 * ITC
 * YES
 * 5
 * 50000
 * YES
 * 
 * OUTPUT 1 .
 * 
 * 7
 * 
 * 
 * INPUT 2.
 * 
 * 101
 * TAJ
 * YES
 * 5
 * 70000
 * 102
 * RAJ
 * NO
 * 5
 * 30000
 * 103
 * J&J
 * NO
 * 6
 * 40000
 * 104
 * ITC
 * YES
 * 5
 * 50000
 * YES
 * 
 * OUTPUT 2.
 * 
 * NO HOTEL WITH GIVEN FACILITY
 * 
 */