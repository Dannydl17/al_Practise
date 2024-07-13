package questions.chp4;

public class Practise {
    public static void main(String[] args) {
        int product = 3;
        int g = 12;

        while (product <= 100){
            product = 3 * product;
        }

        g = g % 9;

        System.out.println(product);
        System.out.println(g);
    }
}
