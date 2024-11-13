package questions.chp5;

public class PatternTwo {
    public static void main(String[] args) {
        for (int count = 1; count <= 4; count++) {
            for (int innerCount = 1; innerCount <= count; innerCount++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int innerC = 3; innerC >0; innerC--) {
            for (int index = innerC; index > 0; index--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
