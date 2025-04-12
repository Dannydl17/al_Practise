package questions.chp7;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class Combination {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter ten number:  ");
        int nOn = keyboardInput.nextInt();
        numbers.add(nOn);

        int nT = keyboardInput.nextInt();
        numbers.add(nT);

        int nTh = keyboardInput.nextInt();
        numbers.add(nTh);

        int nF = keyboardInput.nextInt();
        numbers.add(nF);

        int nFi = keyboardInput.nextInt();
        numbers.add(nFi);

        int nSi = keyboardInput.nextInt();
        numbers.add(nSi);

        int nSe = keyboardInput.nextInt();
        numbers.add(nSe);

        int nEi = keyboardInput.nextInt();
        numbers.add(nEi);

        int nNi = keyboardInput.nextInt();
        numbers.add(nNi);

        int nTe = keyboardInput.nextInt();
        numbers.add(nTe);

    }
}
