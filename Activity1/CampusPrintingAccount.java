/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campusprintingaccount;

public class CampusPrintingAccount {

    public static void main(String[] args) {

        // Create two independent accounts for Mia and Luis.
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        // Display the starting credits
        System.out.println("===Starting Accounts:===");
        System.out.println(mia.getStudentName() + ": " +mia.getCredits());
        System.out.println(luis.getStudentName() + ": " +luis.getCredits());

        // First Test: Mia prints 4 pages.
        System.out.println("Mia prints 4 pages: "+mia.printPages(4));
        System.out.println("Mia's credits: "+mia.getCredits());

        // Second Test: Mia tries to print 7 pages.
        System.out.println("Mia tries to print 7 pages: "+mia.printPages(7));
        System.out.println("Mia's credits: "+mia.getCredits());

        // Third Test: Mia tries to add negative credits
        System.out.println("Mia tries to add -3 credits: "
                + mia.addCredits(-3));
        System.out.println("Mia's credits: "+mia.getCredits());

        // Fourth Test: Mia adds 4 credits.
        System.out.println("Mia adds 4 credits: "+mia.addCredits(4));

        // Displays their final account ballances
        System.out.println("Final Accounts:");
        System.out.println(mia.getStudentName() + ": "+mia.getCredits());
        System.out.println(luis.getStudentName() + ": "+luis.getCredits());
    }
}

/*
1. Prompt Used:
"Help me understand and implement a Java program for a Campus Printing Account using Object-Oriented Programming. 
The program should have private attributes, a constructor, and methods for adding printing credits, printing pages, 
and checking the remaining credits. Make sure that invalid inputs do not change the account's existing credits."

2. What I Accepted or Rejected:
I accepted the suggested use of private attributes, constructors, and methods to manage the printing account.
I also used the suggested validation conditions to prevent negative or invalid credit transactions and ensure 
that students cannot print more pages than their available credits. 
I organized the code into separate Java files to follow the laboratory requirements.

3. How I Checked the Solution:
I checked the solution by compiling and running the Java program.
I tested the required scenarios, including creating accounts with valid and negative starting credits,
printing pages with sufficient and insufficient credits, and adding both negative and positive credit amounts. 
I compared the actual console output with the expected results provided in the laboratory handout to 
verify that the program worked correctly.
*/
