package questions.chp6;

public class RandomCharacters {
    public static void main(String[] args) {
        int numPerLine = 10;
        char ch = RandomCharacter.getRandomUpperCaseLetter();
        char ch1 = RandomCharacter.getRandomDigitCharacter();
        printChars(ch, ch1, numPerLine);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int count = 0;
        int countN = 0;
        int counter = 0;
        while (countN <= 100) {
            System.out.print(ch1+ " ");
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
                count = 0;
            }
            countN++;
            char ch = RandomCharacter.getRandomUpperCaseLetter();
             ch1 = ch;
        }

        while (counter <= 100) {
            System.out.print(ch2+ " ");
            count++;
            if (count % numberPerLine == 0) {
                System.out.println();
                count = 0;
            }
            counter++;
            char ch = RandomCharacter.getRandomDigitCharacter();
             ch2 = ch;
        }
    }
}
