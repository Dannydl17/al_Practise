package questions.chp5;

public class Pattern {
    public static void main(String[] args) {
        for (int count = 5; count > 0; count--) {
            for (int index = count; index > 0; index--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
