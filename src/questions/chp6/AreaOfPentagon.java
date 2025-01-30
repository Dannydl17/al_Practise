package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class AreaOfPentagon {
    public static void main(String[] args) {
        double area = 0.0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the side: ");
        double side = keyboardInput.nextDouble();

        area = canCalculateArea(side);

        System.out.println("The area of the pentagon is  " + area);
    }
    public static double canCalculateArea(double side) {
        double raiseNum = side * side;
        double calculateNum = 5 * raiseNum;

        double num = 4.0 * Math.tan(Math.PI/5);

        double area = calculateNum / num;
        return area;
    }
}
