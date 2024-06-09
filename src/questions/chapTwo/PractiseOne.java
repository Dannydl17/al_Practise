package questions.chapTwo;

public class PractiseOne {
    public static void main(String[] args) {
        int num = 56 % 6;
        System.out.println("The result is:  " + num);

        int numOne = 78 % -4;
        System.out.println("The result is: " + numOne);

        int numTwo = -34 % 5;
        System.out.println("The result is: " + numTwo);

        int numThree = -34 % -5;
        System.out.println("The result is: " + numThree);

        int numFour = 5 % 1;
        System.out.println("The result is:   " + numFour);

        int numFive = 1 % 5;
        System.out.println("The result is:   " + numFive);


//        double result = 25 / 4;
//        System.out.println(result);
//
//        System.out.println(2 * (5 / 2 + 5 / 2));
//        System.out.println(5 / 2 + 2 * 5 / 2);
//        System.out.println(2 * (5 / 2));
//        System.out.println(2 * 5 / 2);


        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);

        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
    }
}
