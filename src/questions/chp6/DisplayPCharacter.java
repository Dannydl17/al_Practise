package questions.chp6;

public class DisplayPCharacter {
    public static void main(String[] args) {
        char ch1 = '1';
        char ch2 = 'Z';
        int numPerLine = 10;
        printChars(ch1, ch2, numPerLine);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
       int count = 0;

        for (int counter = ch1; counter <= (int) ch2; counter++) {
//              while (counter > 57 && counter < 65){
//                  counter++;
//              }
              char ch = (char) counter;
              System.out.print(ch + " ");
               count++;
               if (count % numberPerLine == 0) {
                   System.out.println();
                   count = 0;
               }
        }


    }
}
