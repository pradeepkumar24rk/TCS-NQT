package IPA;

import java.util.ArrayList;
import java.util.Scanner;

public class IPACourseProgram {

    static int findAvgOfQuizByAdmin(CourseProgram obj[], String targetCourseAdmin) {
        int avg = 0, sum = 0, count = 0;
        for (CourseProgram courseProgram : obj) {
            if (courseProgram.getCourseAdmin().equals(targetCourseAdmin)) {
                sum += courseProgram.getQuize();
                count++;
            }

        }
        avg = sum / count;
        return avg;
    }

    static ArrayList<CourseProgram> sortCourseByHandsOn(CourseProgram obj[], int targetHandson) {
        int n = obj.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (obj[i].getHandson() > obj[j].getHandson()) {
                    CourseProgram temp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        ArrayList<CourseProgram> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (obj[i].getHandson() < targetHandson)
                temp.add(obj[i]);
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CourseProgram obj[] = new CourseProgram[n];
        for (int i = 0; i < n; i++) {
            int courseId = sc.nextInt();
            sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quize = sc.nextInt();
            int handson = sc.nextInt();
            obj[i] = new CourseProgram(courseId, courseName, courseAdmin, quize, handson);
        }
        sc.nextLine();
        String targetCourseAdmin = sc.nextLine();
        int resFindAvgOfQuizByAdmin = findAvgOfQuizByAdmin(obj, targetCourseAdmin);
        System.out.println(resFindAvgOfQuizByAdmin == 0 ? "No Course found." : resFindAvgOfQuizByAdmin);
        int targetHandson = sc.nextInt();
        ArrayList<CourseProgram> resRortCourseByHandsOn = sortCourseByHandsOn(obj, targetHandson);
        if (resRortCourseByHandsOn.size() == 0) {
            System.out.println("No Course found with mentioned attribute.");
        } else {
            for (CourseProgram i : resRortCourseByHandsOn) {
                System.out.println(i.getCourseName());
            }
        }
        sc.close();
    }
}

class CourseProgram {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quize;
    private int handson;

    CourseProgram(int courseId, String courseName, String courseAdmin, int quize, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quize = quize;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuize() {
        return quize;
    }

    public int getHandson() {
        return handson;
    }
}

/*
 * create the class Course with the below Attributes.
 * 
 * courseId- int
 * courseName- String
 * courseAdmin- String
 * quiz- int
 * handson -int
 * 
 * The above methods should be private ,write getter and
 * setter and parametrized constructor as required.
 * 
 * create class courseProgram with main method.
 * 
 * implement two static methods-
 * findAvgOfQuizByAdmin method:this method will take array
 * of Course objects and a String value as input parameters.
 * This method will find out Average (as int) of Quiz questions
 * for given Course Admin (String parametre passed)
 * This method will return Average if found.if there is no course
 * that matches then the method should return 0.
 * 
 * sortCourseByHandsOn method:
 * This method will take an Array of Course Objects and int
 * value as input parameters.
 * This methods should return an Array of Course objects in an
 * ascending order of their handson which are less than the
 * given handson(int parameter passed) value. if there is no
 * such course then the method should return null.
 * 
 * The above mentioned static methods should be called from
 * main methods.
 * 
 * for findAvgOfQuizByAdmin method: The main method
 * should print the average if the returned value is not 0.
 * if the returned value is 0 then it should print "No Course
 * found."
 * 
 * 
 * for sortCourseByHandsOn method:
 * the main method should print the name
 * of the Course from the returned Course object Array if the
 * returned value is not null.if the returned value is null then
 * it should print "No Course found with mentioned attribute."
 * 
 * input1:
 * 4
 * 111
 * kubernetes
 * Nisha
 * 40
 * 10
 * 321
 * cassandra
 * Roshini
 * 30
 * 15
 * 457
 * Apache Spark
 * Nisha
 * 30
 * 12
 * 987
 * site core
 * Tirth
 * 50
 * 20
 * Nisha
 * 17
 * 
 * output1:
 * 35
 * kubernetes
 * Apache Spark
 * cassandra
 * 
 * input2:
 * 111
 * kubernetes
 * Nisha
 * 40
 * 10
 * 321
 * cassandra
 * Roshini
 * 30
 * 15
 * 457
 * Apache Spark
 * Nisha
 * 30
 * 12
 * 987
 * site core
 * Tirth
 * 50
 * 20
 * Shubhamk
 * 5
 * 
 * output 2:
 * No Course found
 * No Course found with mentioned attributes.
 */