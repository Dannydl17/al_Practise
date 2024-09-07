package questions.chp5;

public class DisplayPatterns {
    public int printingPatterns(int nums) {
        for (int counter = 0; counter < 1; counter++) {
            System.out.printf("%5s    %5s          %5s    %5s%n", "Pattern A", "Pattern B ", "Pattern C", "Pattern D");
        }

        for (int count = 1; count <= nums; count++) {
            for (int innerCount = 1; innerCount <= count; innerCount++) {
                System.out.print(innerCount +  " ");
            }
            for (int column = 1; column <=nums - count; column++) {
                System.out.print(" " + " ");
            }
            for (int innerCount = 1; innerCount <= nums - count + 1; innerCount++) {
                System.out.print(" " + innerCount);
            }
            for (int innerCount = count; innerCount > 0; innerCount--) {
                System.out.print(" " + " ");
            }
            for (int innerCount = 1; innerCount <= nums - count + 1; innerCount++) {
                System.out.print(" " + " ");
            }
            for (int innerCount = count; innerCount > 0; innerCount--) {
                System.out.print(innerCount + " ");
            }
            for (int innerCount = 1; innerCount <= count; innerCount++) {
                System.out.print(" " +  " ");
            }
            for (int column = 1; column <=nums - count + 1; column++) {
                System.out.print(" " + column);
            }
            for (int innerCount = 1; innerCount <= nums - count + 1; innerCount++) {
                System.out.print(" " + " ");
            }
            System.out.println();
        }
        return nums;
    }
}
