package questions.chp5;

public class LargestN {
    public static void main(String[] args) {
        int n = 1;
//        System.out.println(Math.pow(n, 3));
        while (Math.pow(n, 3) < 12000) {
            System.out.println(Math.pow(n, 3));
            n++;
        }
        n--;
        System.out.println("The largest integer n such that n^3 < 12,000 is: " + n);
    }
}


