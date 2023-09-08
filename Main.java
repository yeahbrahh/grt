//What is your name? Ian
// Where are you from? Florida
// How old are you (years)? 23
// Hello Ian from Florida. You are 23 years old.
// What's something you like to do? play guitar
// Have fun next time you play guitar!
// How much would you like to donate today? 24.50
// You will donate $24.50 today. Yay!

import java.util.Scanner; // imports Scanner class
public class Main {
    static Scanner sc = new Scanner(System.in);

   //Outputs Questions: Name, Age, State
    // Receives user Input//
    static String[] firstSet() {
            System.out.print("What is your name? ");
            String yourName = sc.nextLine();
            System.out.print("How old are you?:  ");
             int yourAge = sc.nextInt();
             sc.nextLine();
             System.out.print("Which state in the U.S are you from?:  ");
             String yourState = sc.nextLine();
           return new String[]{yourName, Integer.toString(yourAge), yourState};

    }
    //Outputs Question
    // User Input: Hobby
    static String secondSet() {
        System.out.print("What is something you enjoy doing?: ");
        String hobby = sc.nextLine();
        return hobby;

    }
   //Outputs Question: Donation
   // User Input
    static double thirdSet() {
        System.out.println("How much would you like to donate today?: ");
        double donor = sc.nextDouble();
        return donor;
    }
   //Outputs Result of First set of Questions//
    static void outputOne(String yourName, int yourAge, String yourState) {
        System.out.print("Hello " + yourName);
        System.out.println(" from " + yourState+ ".");
        System.out.print("You are " +yourAge+ " years old.\n");
    }
   //Outputs Result of Second Question.//
    static void outputTwo(String hobby) {
        System.out.println("Have fun next time you are doing " +hobby+"!" );

    }
    //Outputs Result of Question 3//
    static void outputThree(double donor) {
        System.out.println("You chose to donate $" +donor+" today. Thanks For Your Generosity!");
    }
//Main Method
    //Creates array[] userDetails for firstSet() to output the different return types.
    //Creates new variables and assigns them index[] of array.
    //Creates new variables for Q2 and Q3 and assigns them to their respective set of questions.
    // Calls methods firstSet(),secondSet(),thirdSet();
    public static void main(String[] args) {
        String[] userDetails = firstSet();
        String yourName = userDetails[0];
        int yourAge = Integer.parseInt(userDetails[1]);
        String yourState = userDetails[2];
        outputOne(yourName, yourAge, yourState);
        String userHobby = secondSet();
        outputTwo(userHobby);
        double donation = thirdSet();
        outputThree(donation);

    }

}

