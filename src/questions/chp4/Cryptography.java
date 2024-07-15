package questions.chp4;

public class Cryptography {
    public String encryptNumber(int nums) {
        int firstNumber = nums / 1000;
        int secondNumber = nums % 1000 / 100;
        int thirdNumber = nums % 100 / 10;
        int fourthNumber = nums % 10;

        int firstNum = firstNumber + 7;
        int secondNum = secondNumber + 7;
        int thirdNum = thirdNumber + 7;
        int fourthNum = fourthNumber + 7;

        int fNum = firstNum % 10;
        System.out.println(fNum);
        int sNum = secondNum % 10;
        System.out.println(sNum);
        int tNum = thirdNum % 10;
        System.out.println(tNum);
        int foNum = fourthNum % 10;
        System.out.println(foNum);


        int tempNum = fNum;
        fNum = tNum;
        tNum = tempNum;

        int tempNums = sNum;
        sNum = foNum;
        foNum = tempNums;

        String stringValueOfFirstNum = String.valueOf(fNum);
        String stringValueOfSecondNum = String.valueOf(sNum);
        String stringValueOfThirdNum = String.valueOf(tNum);
        String stringValueOfFourthNum = String.valueOf(foNum);
        return stringValueOfFirstNum + stringValueOfSecondNum + stringValueOfThirdNum + stringValueOfFourthNum;
    }

    public String decryptNumber(int nums) {
        int firstNumber = nums / 1000;
        int secondNumber = nums % 1000 / 100;
        int thirdNumber = nums % 100 / 10;
        int fourthNumber = nums % 10;

        int temp = thirdNumber;
        thirdNumber = firstNumber;
        firstNumber = temp;

        int temps = fourthNumber;
        fourthNumber = secondNumber;
        secondNumber = temps;

        int fNum = firstNumber - 7;
        int sNum = secondNumber - 7;
        int tNum = thirdNumber - 7;
        int foNum = fourthNumber - 7;

        int number1 = fNum + 10;
        int number2 = sNum + 10;
        int number3 = tNum + 10;
        int number4 = foNum + 10;

        int newFNum = number1 % 10;
        int newSNum = number2 % 10;
        int newTNum = number3 % 10;
        int newFoNum = number4 % 10;


        String stringValueOfFirst = String.valueOf(newFNum);
        String stringValueOfSecond = String.valueOf(newSNum);
        String stringValueOfThird = String.valueOf(newTNum);
        String stringValueOfFourth = String.valueOf(newFoNum);

        return  stringValueOfFirst + stringValueOfSecond + stringValueOfThird + stringValueOfFourth;

    }
}
