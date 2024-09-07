package questions.chp5;

public class PyramidPattern {

    public static void main(String[] args) {
        int nums = 0;
        int counter = 0;
        int result = 0;


        for (int count = 1; count <=8; count++){
            if(nums == 0){
                nums = 1;
            }
             result = counter + result;

            if (result == 0) {
                counter += 1;
                continue;
            }
             nums++;
            for (int column = result; column > 0; column--) {
                System.out.print(column + " ");
            }
            counter+=1;

            nums -= 1;

//            for (int whiteSpace = 8 - count + 1; whiteSpace >= 1; whiteSpace--) {
//                System.out.print(whiteSpace + " ");
//            }
//            for (int firstTriangle = 0; firstTriangle <=count; firstTriangle+=2) {
//                System.out.print(2 * firstTriangle +" ");
//            }
//            for (int secondTriangle = 1; secondTriangle <= count; secondTriangle++){
//                System.out.print(secondTriangle + "  ");
//            }
            System.out.println();
        }
    }
}
