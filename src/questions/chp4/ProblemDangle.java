package questions.chp4;

public class ProblemDangle {
    public static void main(String[] args) {
        int x = 8;
        int y = 3;
        if (x > 5)
             if (y > 5)
               System.out.println("x and y are > 5");
        else
        System.out.println("x is <= 5");
    }
}
