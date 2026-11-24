/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgraderecord;

public class LabGradeRecord {

    public static void main(String[] args) {

        // Create two independent student records
        LabGrade ana = new LabGrade("Ana", 80, 90);
        LabGrade ben = new LabGrade("Ben", 101, 85);

        // First Test: The initial scores will be displayed
        //             & The current status of their grade.
        System.out.println("===INITIAL RECORDS===");

        System.out.println(ana.getStudentName() + ": "
                + ana.getFinalGrade() + " - "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        System.out.println(ben.getStudentName() + ": "
                + ben.getFinalGrade() + " - "
                + (ben.isPassing() ? "Passing" : "Not Passing"));

        // Second Test: Checking the invalid input of Ana's updated scores
        System.out.println("ANA UPDATES SCORES TO 95 AND 101");

        System.out.println("Update successful: "
                + ana.updateScores(95, 101));

        System.out.println("Ana's grade: " + ana.getFinalGrade());

        // Third Test: Updating Ana's valid score & Determine the status of her grade
        System.out.println("ANA UPDATES SCORES TO 74 AND 75");

        System.out.println("Update successful: "
                + ana.updateScores(74, 75));

        System.out.println("Ana's grade: " + ana.getFinalGrade());
        System.out.println("Status: "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        // Fourth Test : Another valid update of Ana's score
        //               & Determine the status of her grade.
        System.out.println("ANA UPDATES SCORES TO 75 AND 75");

        System.out.println("Update successful: "
                + ana.updateScores(75, 75));

        System.out.println("Ana's grade: " + ana.getFinalGrade());
        System.out.println("Status: "
                + (ana.isPassing() ? "Passing" : "Not Passing"));

        // Fifth Test : Checking Ben's score again & Determine the status of his grade
        System.out.println("BEN'S RECORD AGAIN");

        System.out.println("Ben's grade: " + ben.getFinalGrade());
        System.out.println("Status: "
                + (ben.isPassing() ? "Passing" : "Not Passing"));
    }
}

/*
Activity 2, Q1:
    Answer: Validating both new scores before updating is a must so that 
the records will only change if the inputs are within the validity range of 
0 to 100 only. And if either of the scores are outside of the validity range, 
neither of the previous recorded scores must not change. This will prevent 
the code to record or innaccurately update the grades of the students.
 */
