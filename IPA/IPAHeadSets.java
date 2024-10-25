package IPA;

import java.util.Scanner;

public class IPAHeadSets {

    public static int findTotalPriceForGivenBrand(String brand, HeadSets hs[]) {
        int sum = 0;
        for (HeadSets i : hs) {
            if (i.getBrand().equals(brand)) {
                sum += i.getPrice();
            }
        }
        return sum;
    }

    public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets hs[]) {
        int n = hs.length;
        int count = 0;
        for (HeadSets i : hs) {
            if (i.getAvailable())
                count++;
        }
        HeadSets[] newHeadSets = new HeadSets[count];
        int len = 0;
        for (int i = 0; i < n; i++) {
            if (hs[i].getAvailable()) {
                newHeadSets[len] = hs[i];
                len++;
            }
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {

                if (newHeadSets[i].getPrice() > newHeadSets[j].getPrice()) {
                    HeadSets temp = newHeadSets[i];
                    newHeadSets[i] = newHeadSets[j];
                    newHeadSets[j] = temp;
                }
            }
        }
        if (count > 0)
            return newHeadSets[1];
        else
            return null;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HeadSets hs[] = new HeadSets[4];
        hs[0] = new HeadSets("boAt BassHeads", "boAt", 1220, true);
        hs[1] = new HeadSets("Over Ear Wired", "boAt", 549, true);
        hs[2] = new HeadSets("In Ear with Mic", "JBL", 450, true);
        hs[3] = new HeadSets("Buds 2 Neo", "RealMe", 500, true);

        int price = findTotalPriceForGivenBrand("boAt", hs);
        System.out.println(price > 0
                ? "Where " + price + " is the total Headset price"
                : "No Headsets availabe with the given brand");
        HeadSets secondMinPrice = findAvailableHeadsetWithSecondMinPrice(hs);
        System.out.println(secondMinPrice == null ? "No Headset availabe"
                : "Where " + secondMinPrice.getBrand() + " is the headsetName and " + secondMinPrice.getPrice()
                        + " is the price");
        sc.close();
    }
}

class HeadSets {
    private String headsetName, brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available) {
        this.headsetName = headsetName;
        this.available = available;
        this.price = price;
        this.brand = brand;
    }

    public String getHeadsetName() {
        return headsetName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailable() {
        return available;
    }

}