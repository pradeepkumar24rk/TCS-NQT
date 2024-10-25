package IPA;

import java.util.Scanner;

public class IPAAssociateScore {

    static AssociateScore searchAssociateByScores(int targetScore, AssociateScore obj[], int n) {
        for (int i = 0; i < n; i++) {
            if (obj[i].getScores() == targetScore)
                return obj[i];
        }
        return null;
    }

    static int findAssociateWithMaxExperience(AssociateScore obj[]) {
        int max = Integer.MIN_VALUE, id = 0;
        for (AssociateScore i : obj) {
            if (i.getExperience() > max) {
                max = i.getExperience();
                id = i.getId();

            }
        }
        return id;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        AssociateScore obj[] = new AssociateScore[n];
        for(int i=0;i<n;i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            double score = sc.nextDouble();
            int experience = sc.nextInt();
            obj[i] = new AssociateScore(id, name, score, experience);
            System.out.println(i+" over");
        }
        // obj[0] = new AssociateScore(105, "nisha", 35, 2);
        // obj[1] = new AssociateScore(107, "uma", 15, 3);
        // obj[2] = new AssociateScore(101, "manu", 43, 7);
        // obj[3] = new AssociateScore(112, "delma", 26, 10);
        AssociateScore search = searchAssociateByScores(43, obj, n);
        System.out.println(
                search == null ? "No Associate found with mentioned scores" : search.getId() + " " + search.getName());
        System.out.println(findAssociateWithMaxExperience(obj));
        sc.close();
    }
}

class AssociateScore {
    private int id, experience;
    private String name;
    private double scores;

    AssociateScore(int id, String name, double scores, int experience) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public Double getScores() {
        return scores;
    }
}

/********************************
 * Question
 ********************************************/
/*
 * AssociateScores Management
 * 
 * Create a class Associate with below attributes:
 * 
 * id - int
 * name - String
 * scores - double
 * experience - int (in months)
 * 
 * Write getters, setters and parameterized constructor in the above mentioned
 * attribute sequence as required. Create class Solution with main method
 * Implement two static methods - searchAssociateByScores and
 * findAssociateWithMaxExperience in Solution class.
 * 
 * 
 * 
 * searchAssociateByScores Create a static method searchAssociateByScores in the
 * Solution class. This method will take array of Associate objects and scores
 * as input and returns the Associate object having the mentioned scores. If no
 * associate is found with the given-scores then method returns null.
 * 
 * findAssociateWithMaxExperience Create a static method
 * findAssociateWithMaxExperience in the Solution class. This method will take
 * array of Associate objects and returns the Associate object having the
 * maximum experience.
 * 
 * These methods should be called from the main method.
 * 
 * 
 * Write code to perform the following tasks:
 * 
 * 1. Take necessary input variable and call searchAssociateByScores. For this
 * method - The main method should print the Associate ID and hame (as shown in
 * the sample output) from the returned Associate object array if the returned
 * value is not null. If the returned value is null then it should print
 * "No Associate found with mentioned scores"
 * 
 * 
 * 
 * 2. Take necessary input variable and call findAssociateWithMaxExperience. For
 * this method - The main method should print the Associate ID with the maximum
 * of mentioned attribute (experience). The above mentioned static methods
 * should be called from the main method. Also write the code for accepting the
 * inputs and printing the outputs. Don't use any static test or formatting for
 * printing the result. Just invoke the method and print the result
 * 
 * Note:
 * 
 * All String comparison needs to be case in-sensitive
 * 
 * You can use/refer the below given sample input and output to verify your
 * solution. No two objects will have the same experience.
 * 
 * Sample Input (below) description: The 1st input taken in the main section is
 * the number of Associate objects to be added to the list of Associate.
 * 
 * The next set of inputs are id,name,scores,experience for each Associate
 * object taken one after other and is repeated for number of Associate objects
 * given in the first line of input. The last line of inputs will be the
 * arguments which needs to be passed as parameter to the methods.
 * 
 * Consider below sample input and output to test your code:
 * Sample Input 1 - public
 * 
 * 4
 * 105
 * Nisha
 * 35
 * 2
 * 107
 * Uma
 * 15
 * 3
 * 101
 * manu
 * 43
 * 7
 * 112
 * delma
 * 26
 * 10
 * 43
 * 
 * Sample Output 1
 * 101
 * manu
 * 112
 * 
 * 
 * Sample Input 2-public
 * 
 * 4
 * 105
 * Nisha
 * 35
 * 2
 * 107
 * Uma
 * 15
 * 3
 * 101
 * manu
 * 43
 * 7
 * 112
 * delma
 * 26
 * 10
 * 10
 * 
 * Sample Output 2
 * 
 * No Associate found with mentioned scores
 * 112
 * 
 * Note on using Scanner object: Sometimes scanner does not read the new line
 * character while invoking
 */