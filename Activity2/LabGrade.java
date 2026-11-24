/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labgraderecord;

public class LabGrade {

    // Private attributes for the students information
    private String studentName;
    private int quizScore;
    private int labScore;

    // Constructor
    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;

        // To validate quiz score independently
        //To handle invalid quiz score inputs
        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
        } else {
            this.quizScore = 0;
        }

        //  To validate lab scores independently
        // To handle invalid lab score inputs
        if (labScore >= 0 && labScore <= 100) {
            this.labScore = labScore;
        } else {
            this.labScore = 0;
        }
    }

    // If both scores are valid, this method will update the scores
    public boolean updateScores(int quizScore, int labScore) {

        if (quizScore < 0 || quizScore > 100
                || labScore < 0 || labScore > 100) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;

        return true;
    }

    // A method that computes the weighted final grade
    public double getFinalGrade() {
        return (this.quizScore * 0.40) + (this.labScore * 0.60);
    }

    // This method will check if the student will pass or not
    public boolean isPassing() {
        return this.getFinalGrade() >=75.0;
    }

    // This method will get the name of the student
    public String getStudentName() {
        return this.studentName;
    }

}
