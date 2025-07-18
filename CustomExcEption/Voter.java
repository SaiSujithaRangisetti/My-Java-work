package ExcEption.CustomExcEption;

import java.util.Scanner;

public class Voter {
    public void getVoteValidation(int age) throws VoterEligibility {
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            throw new VoterEligibility("Hello Sujitha");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        Voter v = new Voter();
        try {
            v.getVoteValidation(age);
        } catch (VoterEligibility e) {
            System.out.println("Exception caught: and message given by me  " + e.getInfo());
        }
    }
}
