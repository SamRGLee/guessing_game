import java.util.Scanner;
public class WhatChocolate
{
    //ask the user for a prompt to input their favorite chocolate
    //collect and analyse input
    //if the chocolate is Bounty, print "gross", otherwise, print "yum"
    public static void main(String[] args)
    {
        System.out.println("What's your favorite chocolate?");
        Scanner reader = new Scanner(System.in); //creates a scanner object, which can be used to grab whatever is typed into the terminal (by user)
        String chocolate = reader.nextLine();

        if(chocolate.equals("Bounty") || chocolate.equals("bounty"))
        {
            System.out.println("GROSS!");
        }

        else if (chocolate == "Crunchie" || chocolate == "crunchie")
        {
            System.out.println("the bestt");
        }

        else
        {
            System.out.println("yum!");
        }

        String result = chocolate.equals("Bounty") || chocolate.equals("bounty") ? "gross" : "yum";
        System.out.println("Ternary result is " + result);
    }

}
