package questions.chp4;

public class CheckerBoard {

    public static int canPrintCheckerBoard(int numberRoll, int numberColumn) {
        for (int row = 1; row < numberRoll; row++) {
            for (int count = 0; count <= numberColumn; count++) {
                for (int innerCount = 0; innerCount < 1; innerCount++) {
                    System.out.print("*");
                }
                for (int innerCount = 0; innerCount < 1; innerCount++) {
                     System.out.print(" ");
                }
            }
            System.out.println();
            for (int count = 0; count <= numberColumn; count++) {
                for (int innerCount = 0; innerCount < 1; innerCount++) {
                    System.out.print(" ");
                }
                for (int innerCount = 0; innerCount < 1; innerCount++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        return numberColumn;
    }
}
