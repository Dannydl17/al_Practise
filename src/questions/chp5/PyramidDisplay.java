package questions.chp5;

import java.util.Scanner;

import static java.lang.System.in;

public class PyramidDisplay {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        System.out.print("Enter an integer from 1 to 15:  ");
        int numberOfLine = keyboardInput.nextInt();

        if (numberOfLine >= 1 && numberOfLine <=15){
          for (int count = 1; count <= numberOfLine; count++){
              for (int whiteSpace = numberOfLine - count; whiteSpace > 0; whiteSpace--) {
                  System.out.print("   ");
              }
              for (int firstTriangle = count; firstTriangle > 0; firstTriangle--) {
                  System.out.print(firstTriangle + "  ");
              }
              for (int secondTriangle = 2; secondTriangle <= count; secondTriangle++){
                  System.out.print(secondTriangle + "  ");
              }
              System.out.println();
          }

        }else {
            System.out.print("Number is not between 1 to 15, can not build triangle");
        }

    }

    public int printingPyramid(int nums) {
        if (nums >= 1 && nums <=15){
            for (int count = 1; count <= nums; count++){
                for (int whiteSpace = nums - count; whiteSpace > 0; whiteSpace--) {
                    System.out.print("   ");
                }
                for (int firstTriangle = count; firstTriangle > 0; firstTriangle--) {
                    System.out.print(firstTriangle + "  ");
                }
                for (int secondTriangle = 2; secondTriangle <= count; secondTriangle++){
                    System.out.print(secondTriangle + "  ");
                }
                System.out.println();
            }

        }else {
            System.out.print("Number is not between 1 to 15, can not build triangle");
        }
        return nums;
    }
}
