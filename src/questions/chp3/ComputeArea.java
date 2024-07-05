package questions.chp3;

import java.util.Scanner;

import static java.lang.System.in;

public class ComputeArea {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);


        System.out.println("Enter a number for radius: ");
        double radius = keyboardInput.nextDouble();

        if(radius < 0){
            System.out.println("Incorrect input");
        }
        else {
            double area = radius * radius * 3.14159;
            System.out.println("Area is " + area);
        }

        double radius1 = 1;
        System.out.println(radius1 > 0);

    }
}
