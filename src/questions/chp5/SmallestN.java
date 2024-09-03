package questions.chp5;

public class SmallestN {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n, 2) < 12000) {
//            System.out.println(Math.pow(n, 3));
            n++;
        }
        n--;
        System.out.println("The smallest integer n such that n^2 > 12,000 is: " + n);
    }
}


