import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    int x = 45;
    String color = "Blue";
    // Java Method with parameters and arguments
    static void myMethod(String fname) {
        System.out.println( fname + " Refsnes");
    }


    public static void main(String[] args) {



        Student s = new Student();
        s.setName("Sarah Jay");

        System.out.println(s.name);

        // int time = 20;
        // String results;
        // results = (time < 14) ? "Good day." : "Good evening.";
        // System.out.println(results);

        // For Loop
        for(int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        // Nested Loop - Outer and inner loop
        for(int i = 1; i <= 2; i++) {
            System.out.println("Outer loop: " + i);

            for(int j = 1; j <= 3; j++) {
                System.out.println("Inner loop: " + j);
            }
        }

        // Array
        String[] cars = {"Volvo", "Nissan", "Ford", "BMW"};

        // Looping - iterating through an array using for loop
        for (String i : cars) {
            System.out.println(i);
        }

        // Loop - iterating through an array using a for each loop
        for (int i = 0; i < cars.length - 1; i++) {
            System.out.println(cars[i]);
        }

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        Main myObj = new Main();
        System.out.println(myObj.x);



        s.myStudentMethod();

        // iterating through an array java
        int[] num = {1, 7, 3, 4};

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int target = 6;

                if (num[i] + num[j] == target) {

                }

            }


        }

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

       for(int i = 0; i < vowels.length; i++) {
           System.out.println(vowels[i]);
       }

       // iterating through an array using for-each

        // syntax

        for (char i : vowels) {
            System.out.println(i);
        }

        /* ArrayList Declaration */

        ArrayList<String> employeeNames = new ArrayList<String>();


        /* Adding Strings to the String ArrayList Object*/

        employeeNames.add("Melinda");
        employeeNames.add("Lisa");
        employeeNames.add("Nicole");
        employeeNames.add("Bob");

        System.out.println(employeeNames);


    }
//    static void traverseString(String s) {
//        s= "hello";
//
//        for ( int i = 0; i < s.length(); i++) {
//            System.out.println(s.charAt(i) + " ");
//        }
//
//    }


}