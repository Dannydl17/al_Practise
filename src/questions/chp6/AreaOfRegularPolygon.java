package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class AreaOfRegularPolygon {
    public static void main(String[] args) {
        double area = 0.0;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter the number of sides: ");
        int num = keyboardInput.nextInt();

        System.out.print("Enter the side: ");
        double side = keyboardInput.nextDouble();

        area = canCalculateAreaOfRegularPolygon(num, side);

        System.out.println("The area of the polygon is  " + area);

    }
    public static double canCalculateAreaOfRegularPolygon(int numOfSides, double side) {
        double raiseNum = side * side;
        double calculateNum = numOfSides * raiseNum;

        double num = 4.0 * Math.tan(Math.PI/numOfSides);

        double area = calculateNum / num;
        return area;

    }
}
