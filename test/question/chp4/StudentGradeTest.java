package question.chp4;

import questions.chp4.StudentGrade;

public class StudentGradeTest {
    public static void main(String[] args) {
        StudentGrade account1 = new StudentGrade("Jane Green", 93.5);
        StudentGrade account2 = new StudentGrade("John Blue", 72.75);

        System.out.printf("%s's letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",account2.getName(), account2.getLetterGrade());
    }
}
