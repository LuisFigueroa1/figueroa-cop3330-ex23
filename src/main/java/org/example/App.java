package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 23 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String ans; //answer variable y or n

        //start of the search tree
        System.out.print("Is the car silent when you turn the key? ");
        ans = userInput.nextLine();

        if (ans.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            ans = userInput.nextLine();
            if (ans.equals("y")) {
                System.out.print("Clean terminals and try starting again.");
            } else {
                System.out.print("Replace cables and try again.;");
            }
        }
        else{
            System.out.print("Does the car make a slicking noise? ");
            ans = userInput.nextLine();

            if (ans.equals("y")) {
                System.out.print("Replace the battery. ");
            }
            else{
                System.out.print("Does the car crank up but fail to start? ");
                ans = userInput.nextLine();

                if (ans.equals("y")){
                    System.out.print("Check spark plug connections. ");
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    ans = userInput.nextLine();

                    if(ans.equals("y")){
                        System.out.print("Does you car have fuel injection? ");
                        ans = userInput.nextLine();

                        if(ans.equals("y")){
                            System.out.print("Get it in for service. ");
                        }
                        else{
                            System.out.print("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else{
                        System.out.print("This should not be possible. ");
                    }

                }
            }


        }
    }
}