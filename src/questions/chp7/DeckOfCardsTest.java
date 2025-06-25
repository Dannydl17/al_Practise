package questions.chp7;

public class DeckOfCardsTest {

    public static void main(String[] args) {
        DeckOfCardsO myDeckOfCardsO = new DeckOfCardsO();

        myDeckOfCardsO.shuffle();

        for (int count = 1; count <= 52; count++) {
            System.out.printf("%-19s", myDeckOfCardsO.dealCard());

            if (count % 4 == 0) {
                System.out.println();
            }
        }
    }
}
