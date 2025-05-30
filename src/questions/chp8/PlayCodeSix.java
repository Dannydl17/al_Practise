package questions.chp8;

import java.util.Random;

public class PlayCodeSix {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int n = random.nextInt(2);
            System.out.print(n);
        }

    }
}
