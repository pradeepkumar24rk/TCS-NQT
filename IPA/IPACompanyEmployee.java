package IPA;

import java.util.Scanner;

public class IPACompanyEmployee {

    static int findCountOfEmployeesUsingCompTransport(CompanyEmployee obj[], String targetBranch) {
        int count = 0;
        for (CompanyEmployee i : obj) {
            if (i.getCompanyTransport() && (targetBranch.equals(i.getBranch())))
                count++;
        }
        return count;
    }

    static CompanyEmployee findEmployeeWithSecondHighestRating(CompanyEmployee obj[]) {
        int n = obj.length, count = 0;
        for (CompanyEmployee i : obj) {
            if (i.getCompanyTransport())
                count++;
        }
        if (count == n)
            return null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (obj[i].getRating() < obj[j].getRating()) {
                    CompanyEmployee temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        return obj[1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CompanyEmployee obj[] = new CompanyEmployee[n];
        for (int i = 0; i < n; i++) {
            int employeeId = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double rating = sc.nextDouble();
            boolean companyTransport = sc.nextBoolean();
            obj[i] = new CompanyEmployee(employeeId, name, branch, rating, companyTransport);
        }
        sc.nextLine();
        String targetBranch = sc.nextLine();
        int resFindCountOfEmployeesUsingCompTransport = findCountOfEmployeesUsingCompTransport(obj,
                targetBranch);
        System.out.println(resFindCountOfEmployeesUsingCompTransport == 0 ? "No such Employees"
                : "where " + resFindCountOfEmployeesUsingCompTransport + " is the count");
        CompanyEmployee resFindEmployeeWithSecondHighestRating = findEmployeeWithSecondHighestRating(obj);
        System.out.println(resFindEmployeeWithSecondHighestRating == null ? "All Employees using company transport"
                : resFindEmployeeWithSecondHighestRating.getEmployeeId() + " "
                        + resFindEmployeeWithSecondHighestRating.getName());
        sc.close();
    }
}

class CompanyEmployee {
    private int employeeld;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;

    CompanyEmployee(int employeeld, String name, String branch, double rating, boolean companyTransport) {
        this.employeeld = employeeld;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.companyTransport = companyTransport;
    }

    public int getEmployeeId() {
        return employeeld;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getRating() {
        return rating;
    }

    public boolean getCompanyTransport() {
        return companyTransport;
    }
}

/*
 * Create a class called Employee with the below attributes:
 * 
 * employeeld - int
 * name - String
 * branch - String
 * rating - double
 * company Transport - boolean
 * 
 * The above attributes should be private. write getters, setters and
 * parameterized constructor as required.
 * 
 * Create class MyClass with main method.
 * Implement two static methods findCountOfEmployeesUsingCompTransport and
 * findEmployeeWithSecondHighestRating
 * in MyClass class.
 * 
 * findCountOfEmployeesUsingCompTransport method:
 * ----------------------------------------------
 * This method will take an array of Employee object and a String parameter as
 * input parameters.
 * This method will calculate and return the count of Employees who are all
 * using company transport in the given branch (String parameter passed).
 * If no Employee in the given branch using company transport in the array of
 * Employee objects, then
 * the method should return 0.
 * 
 * findEmployeeWithSecondHighestRating method:
 * --------------------------------------------
 * This method will take an array of Employee objects as an input parameter.
 * This method will return
 * the object of the second highest rating employee from the array of Employee
 * objects who are not using
 * company transport.
 * If all Employees using company transport in the array of Employee objects,
 * then the method should return null.
 * 
 * Note: All the searches should be case sensitive, companyTransport and rating
 * combination of each Employee
 * is unique.
 * 
 * For findCountOfEmployeesUsingCompTransport method, The main method should
 * print the returned count as it
 * is if the returned value is greater than 0, else it should print
 * "No such Employees".
 * Ex: 2 , where 2 is the count
 * 
 * For findEmployeeWithSecondHighestRating method: The main method should print
 * the employeeld and name from
 * the returned object if the returned value is not null. If the returned value
 * is null, then it should
 * print "All Employees using company transport".
 * Ex: 1003
 * Uma
 * where 1003 is the employeeld and Uma is the name.
 * 
 * Before calling these static methods in main, use Scanner object to read the
 * values of four Employee
 * objects referring attributes in the above mentioned attributes sequence.
 * Next, read the value of String
 * parameter for capturing branch.
 * 
 * Input :
 * 
 * 1001
 * Ashwa
 * IT
 * 5
 * true
 * 1002
 * Preeti
 * IT
 * 4
 * true
 * 1003
 * Uma
 * Admin
 * 3
 * false
 * 1004
 * Akash
 * Hardware
 * 4.5
 * false
 * IT
 * 
 * 
 * 
 * Output :
 * 
 * 2
 * 1003
 * Umak
 */