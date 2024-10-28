package IPA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IPAMedicine {
    
    static ArrayList<Integer> getPriceByDisease(Medicine obj[],String targetDisease) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Medicine i : obj) {
            if(i.getDisease().equalsIgnoreCase(targetDisease))
                list.add(i.getPrice());
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Medicine obj[] = new Medicine[n];
        for(int i = 0;i<n;i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String batch = sc.nextLine();
            String disease = sc.nextLine();
            int price = sc.nextInt();
            obj[i] = new Medicine(name, batch, disease, price);
        }
        sc.nextLine();
        String targetDisease = sc.nextLine();
        ArrayList<Integer> resGetPriceByDisease = getPriceByDisease(obj,targetDisease);
        for(int i: resGetPriceByDisease)
            System.out.println(i);
        sc.close();
    }
}

class Medicine {
    private String name;
    private String batch;
    private String disease;
    private int price;

    Medicine(String name, String batch, String disease, int price) {
        this.name = name;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public String getDisease() {
        return disease;
    }

    public int getPrice() {
        return price;
    }
}

/*
 * Create class Medicine with below attributes:
 * 
 * MedicineName - String
 * batch - String
 * disease - String
 * price - int
 * 
 * Create class Solution and implement static method "getPriceByDisease" in the
 * Solution class.
 * This method will take array of Medicine objects and a disease String as
 * parameters.
 * And will return another sorted array of Integer objects where the disease
 * String matches with the
 * original array of Medicine object's disease attribute (case insensitive
 * search).
 * 
 * Write necessary getters and setters.
 * 
 * Before calling "getPriceByDisease" method in the main method, read values for
 * four Medicine objects
 * referring the attributes in above sequence along with a String disease. Then
 * call the "getPriceByDisease"
 * method and print the result.
 * 
 * Input
 * -------------
 * 
 * dolo650
 * FAC124W
 * fever
 * 100
 * paracetamol
 * PAC545B
 * bodypain
 * 150
 * almox
 * ALM747S
 * fever
 * 200
 * aspirin
 * ASP849Q
 * flu
 * 250
 * fever
 * 
 * Output
 * ---------
 * 100
 * 200
 */