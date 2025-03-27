package questions.chp3;

import java.util.Scanner;

import static java.lang.System.in;

public class AccountTest {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(in);

        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:  ");
        String theName = keyboardInput.nextLine();

        myAccount.setName(theName);

        System.out.println();

        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

    }
}
