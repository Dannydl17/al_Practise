package questions.chp6;

public class sumNumbers {
    public static void main(String[] args) {
        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));
        System.out.println("Sum from 35 to 49 is " + sum(35, 49));
    }

    public static int sum(int firstNumber, int secondNumber){
        int result = 0;
        for (int i = firstNumber; i < secondNumber; i++) {
            result+=i;
        }
        return result;
    }
}
