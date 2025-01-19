package questions.chp6;

import java.util.Scanner;

import static java.lang.System.in;

public class MyTriangle {
    public static void main(String[] args) {
        int count = 0;
        boolean resultC = false;
        boolean result = true;
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter three side of a triangle:  ");
        double fNum = keyboardInput.nextDouble();
        double sNum = keyboardInput.nextDouble();
        double tNum = keyboardInput.nextDouble();

        resultC = isValid(fNum, sNum, tNum);

        if(resultC == result){
            System.out.println(area(fNum, sNum, tNum));
        }
        else {
            System.out.println("The input is invalid");
        }
    }

    public static boolean isValid(double side1, double side2, double side3){
        double sum = 0.0;
        if (side1 > side2) {
            sum = side1 + side2;
        }
        if (side2 > side1) {
            sum = side2 + side1;
        }

        if (sum > side3) {
            return true;
        }
        return false;
    }

    public static double area(double side1, double side2, double side3){
        double cR = 0.0;
        double cRD = 0.0;
        double cRL = 0.0;
        double cRL1 = 0.0;
        double cRF = 0.0;
        double cR1 = 0.0;
        double cR2 = 0.0;
        double cR3 = 0.0;
        double num = 0.0;
        double num2 = 0.0;
        double num3 = 0.0;


        double fS = side1 - side2;
        double r = fS * fS;

        double fT = side1 - side3;
        double r1 = fT * fT;

        double numF = r + r1;

        num = Math.sqrt(numF);

        double sF = side2 - side1;
        double r2 = sF * sF;


        double sT = side2 - side3;
        double rS = sT * sT;


        double numb = r2 + rS;

        num2 = Math.sqrt(numb);

        double tF = side3 - side1;
        double r3 = tF * tF;

        double tS = side3 - side2;
        double rT = tS * tS;


        double number = r3 + rT;

        num3 = Math.sqrt(number);

        cR = num + num2 + num3;

        cRD = cR / 2;

        cR1 = cRD - num;
        cR2 = cRD - num2;
        cR3 = cRD - num3;

        cRL = cR1 * cR2 * cR3;

        cRL1 = cRD * cRL;

        cRF = Math.sqrt(cRL1);

        return cRF;
    }
}
