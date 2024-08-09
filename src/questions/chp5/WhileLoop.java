package questions.chp5;

public class WhileLoop {
    public static void main(String[] args) {
        long sum = 0;
//        int i = 0;
//
//        while (i <= 1000){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

//        int i = 1;
//        while (i < 10)
//            if (i % 2 == 0)
//                System.out.println(i);

//        int i = 1;
//        while (i < 10)
//            if (i % 2 == 0)
//                System.out.println(i++);

        int i = 1;
        while (i < 10)
            if ((i++) % 2 == 0)
                System.out.println(i);
    }
}
