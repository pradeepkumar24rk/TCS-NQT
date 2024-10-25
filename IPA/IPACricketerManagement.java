package IPA;

import java.util.Scanner;

public class IPACricketerManagement {

    static CricketerManagement findCricketerWithMinimumMatchesPlayed(CricketerManagement obj[]) {
        int min = Integer.MAX_VALUE;
        CricketerManagement res = null;
        for (CricketerManagement i : obj) {
            if (i.getMatchesPlayed() < min) {
                min = i.getMatchesPlayed();
                res = i;
            }
        }
        return res;
    }

    static CricketerManagement searchCricketerByld(CricketerManagement obj[], int targetId) {
        int n = obj.length;
        // sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (obj[i].getCricketerId() > obj[j].getCricketerId()) {
                    CricketerManagement temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }
        // binary search
        int left = 0, right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (obj[mid].getCricketerId() == targetId)
                return obj[mid];
            else if (obj[mid].getCricketerId() < targetId)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CricketerManagement obj[] = new CricketerManagement[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int matches = sc.nextInt();
            int runs = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            obj[i] = new CricketerManagement(id, matches, runs, name, team);
        }
        CricketerManagement minMatch = findCricketerWithMinimumMatchesPlayed(obj);
        System.out.println(minMatch);
        int searchId = sc.nextInt();
        CricketerManagement search = searchCricketerByld(obj, searchId);
        System.out.println(
                search == null ? "No Such Cricketer" : search.getCricketerId() + " " + search.getCricketerName());
        sc.close();
    }
}

class CricketerManagement {
    private int cricketerId;
    private int matchesPlayed;
    private int totalRuns;
    private String cricketerName;
    private String team;

    CricketerManagement(int id, int matches, int runs, String name, String team) {
        cricketerId = id;
        matchesPlayed = matches;
        totalRuns = runs;
        cricketerName = name;
        this.team = team;
    }

    public int getCricketerId() {
        return cricketerId;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public String getCricketerName() {
        return cricketerName;
    }

    public String getTeam() {
        return team;
    }

}

/*
 * Cricketer ManagementSystem
 * 
 * Create a class Cricketer with below
 * 
 * attributes:
 * cricketerld - int
 * matchesPlayed - int
 * totalRuns - int
 * cricketerName - String
 * team - String
 *
 * Write getters, setters and parameterized constructor in the above mentioned
 * attribute sequence as required.
 * 
 * Create class Solution with main methed
 * 
 * Implement two static methods - findCricketerWithMinimum MatchesPlayed and
 * searchCricketer Byld in Solution class.
 * 
 * findCricketerWithMinimum Matches Played in the Solution class:
 * This method will take array of Cricketer objects and returns the Cricketer
 * object having the minimum Matches Played.
 * 
 * searchCricketerByld:
 * Create a static method searchCricketerByld in the Solution class.
 * This method will take array of Cricketer objects and Id as input and returns
 * the Cricketer object having the mentioned Id. If the mentioned Id is not
 * found then method should return null.
 * 
 * These methods should be called from the
 * main method
 * Write code to perform the following
 * 
 * tasks:
 * 
 * 1. Take necessary input variable and call
 * findCricketerWithMinimumMatchesPlayed. For this method - The main method
 * should print the Cricketer ID with minimum of mentioned
 * attribute(matchesPlayed).
 * 
 * 2. Take necessary input variable and call searchCricketer Byld. For this
 * method - The main method should print the Cricketer ID and Name(as shown in
 * the sample output) if the returned value is not null. If the returned value
 * is null then it should print "No such Cricketer".
 * The above mentioned static methods should be called from the main method.
 * Also write the code for accepting the inputs and printing the outputs. Don't
 * use any static test or formatting for printing the result. Just invoke the
 * method and print the result
 * 
 * Note:
 * 
 * All String comparison needs to be case in-sensitive
 * 
 * You can use/refer the below given sample input and output to verify your
 * solution. No two object will have the same number of matches played
 * 
 * 
 * Sample Input (below) description:
 * 
 * The 1st input taken in the main section is the number of Cricketer objects to
 * be added to the list of Cricketer.
 * 
 * The next set of inputs are id,matches Played,totalRuns,name,team for each
 * Cricketer object taken one after other and is repeated for number of
 * Cricketer objects given in the first line of input.
 * 
 * The last line of inputs will be the arguments which needs to be passed as
 * parameter to the methods.
 * 
 * Consider below sample input and output to test your code:
 * 
 * Sample Input 1 - public:
 * 
 * 4
 * 1001
 * 100
 * 7000
 * Kohli
 * India
 * 1002
 * 120
 * 4700
 * Yuvi
 * India
 * 1003
 * 80
 * 3200
 * Smith
 * Australia
 * 1004
 * 130
 * 5800
 * Gayle
 * Westindies
 * 1004
 * 
 * Sample output 1
 * 1003
 * 1004
 * Gayle
 * 
 * Sample Input 2 -
 * 
 * 4
 * 1001
 * 100
 * 7000
 * Kohli
 * India
 * 1002
 * 120
 * 4700
 * Yuvi
 * India
 * 1003
 * 80
 * 3200
 * Smith
 * Australia
 * 1004
 * 130
 * 5800
 * Gayle
 * WestIndies
 * 1005
 * 
 * 
 * Sample Output 2:
 * 1003
 * No such Cricketer
 * 
 */