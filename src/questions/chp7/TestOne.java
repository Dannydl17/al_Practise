package questions.chp7;

public class TestOne {
    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5, 6};

        for (int count = 1; count < list.length; count++) {
              list[count] = list[count - 1];
        }
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + " ");
        }
    }
}
