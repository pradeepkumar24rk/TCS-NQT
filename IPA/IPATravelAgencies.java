package IPA;

import java.util.Scanner;

public class IPATravelAgencies {

    static int findAgencyWithHighestPackagePrice(TravelAgencies obj[]) {
        int max = 0;
        for (TravelAgencies i : obj) {
            if (i.getPrice() > max)
                max = i.getPrice();
        }
        return max;
    }

    static TravelAgencies agencyDetailsForGivenldAndType(TravelAgencies obj[], int regNo, String packageType) {
        for (TravelAgencies i : obj) {
            if ((i.getPackageType().equals(packageType)) && (i.getRegNo() == regNo) && i.getFlightFacility())
                return i;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TravelAgencies obj[] = new TravelAgencies[n];
        for(int i=0;i<n;i++) {
            int regNo = sc.nextInt();
            sc.nextLine();
            String agencyName = sc.nextLine();
            String packageType = sc.nextLine();
            int price = sc.nextInt();
            boolean flightFacility = sc.nextBoolean();
            obj[i] = new TravelAgencies(regNo, agencyName, packageType, price, flightFacility);
        }
        System.out.println(findAgencyWithHighestPackagePrice(obj));
        int targetRegNo = sc.nextInt();
        sc.nextLine();
        String targetPackageType = sc.nextLine();
        TravelAgencies agency = agencyDetailsForGivenldAndType(obj, targetRegNo, targetPackageType);
        System.out.println(agency==null?"Not founded":agency.getAgencyName()+" "+agency.getPrice());
        System.out.println();
        sc.close();
    }
}

class TravelAgencies {
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility) {
        this.regNo = regNo;
        this.agencyName = agencyName;
        this.packageType = packageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public String getPackageType() {
        return packageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean getFlightFacility() {
        return flightFacility;
    }
}

/*
 * ## Problem Statement
 * 
 * Create a class TravelAgencies with below attributes:
 * regNo - int
 * agencyName - String
 * packageType - String
 * price - int
 * flightFacility - boolean
 * 
 * Write getters, setters for the above attributes . Create constructor which
 * takes parameter in the above sequence.
 * 
 * Create class Solution with main method. Implement two static methods -
 * findAgencyWithHighestPackagePrice and agencyDetailsforGivenIdAndType in
 * Solution clas
 ** 
 * findAgencyWithHighestPackagePrice method :**
 * 
 * This method will take array of TravelAgencies objects as an input parameter
 * and return the highest package price from the given array of objects.
 ** 
 * agencyDetailsForGivenldAndType method :**
 * 
 * This method will take three input parameters -array of TravelAgencies
 * objects, int parameter regNo and String parameter packageType. The method
 * will return
 * 
 * 1. FlightFacility should be available.
 * 2. The input parameters(regNo and packageType) should matched with the regNo
 * and packageType of TravelAgencies object.
 * 
 * If any of the above conditions are not met, then the method should return
 * null.
 * Note : Same Travel agency can have more than one package type. Travel agency
 * and package type combination is unique. All the searches should be case
 * insensi
 * 
 * The above mentioned static methods should be called from the main method.
 * 
 * For findAgencyWithHighestPackagePrice method - The main method should print
 * the highestPackagePrice as it is.
 * agencyDetailsForGivenldAndType method -The main method should print the
 * AgencyName and price of the returned object.
 * 
 * ## Input
 * 
 * 4
 * 123
 * A2Z Agency
 * Platinum
 * 50000
 * true
 * 345
 * SSS Agency
 * Gold
 * 30000
 * false
 * 987
 * Cox and Kings
 * Diamond
 * 40000
 * true
 * 888
 * Global Tours
 * Silver
 * 20000
 * false
 * 987
 * Diamond
 * 
 * ## Output
 * 50000
 * Cox and Kings
 * 40000
 */