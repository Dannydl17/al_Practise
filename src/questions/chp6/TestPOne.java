package questions.chp6;

public class TestPOne {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6){
            method1(i, 2);
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
}
