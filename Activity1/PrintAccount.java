/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package campusprintingaccount;

public class PrintAccount {

    //Private attributes for student info
    private String studentName;
    private int credits;

    //Contructor, If the starting credit is negative, it will
    //automatically becomes zero.
    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }
    
    //This wil add credits only if the amount is positive
    public boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }

        this.credits += amount;
        return true;
    }

    //If there are enough credits available, this will print pages.
    public boolean printPages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    // To get the credits
    public int getCredits() {
        return this.credits;
    }

    // to get the name of student
    public String getStudentName() {
        return this.studentName;
    }

}
