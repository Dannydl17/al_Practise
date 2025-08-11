package questions.playcode.file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static java.lang.System.in;

public class CreateTextFile {
    public static void main(String[] args) {
        try(Formatter output = new Formatter("clients.txt")){
            Scanner keyboardInput = new Scanner(in);
            System.out.printf("%s%n%s%n? ",
                    "Enter account number, first name, last name and balance.",
                    "Enter end-of-file indicator to end input.");
            while (keyboardInput.hasNext()){
                try{
                    output.format("%d %s %s %.2f%n", keyboardInput.nextInt(),
                            keyboardInput.next(), keyboardInput.next(), keyboardInput.nextDouble());
                }
                catch (NoSuchElementException elementException){
                    System.err.println("Invalid input. Please try again.");
                    keyboardInput.nextLine();
                }
                System.out.print("?  ");
            }
        }
        catch (SecurityException | FileNotFoundException |
                FormatterClosedException e){
                e.printStackTrace();
        }
    }
}
