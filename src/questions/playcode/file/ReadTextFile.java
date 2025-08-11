package questions.playcode.file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        try(Scanner keyboardInput = new Scanner(Paths.get("clients.txt"))){
            System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                    "First Name", "Last Name", "Balance");

            while (keyboardInput.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n", keyboardInput.nextInt(),
                keyboardInput.next(), keyboardInput.next(), keyboardInput.nextDouble());
            }
        }
        catch (IOException | NoSuchElementException |
        IllegalStateException e){
           e.printStackTrace();
        }
    }
}
