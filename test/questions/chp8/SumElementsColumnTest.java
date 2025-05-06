package questions.chp8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumElementsColumnTest {

    @Test
    public void testThatSumElementsColumnCanAddColumnAndReturnTheResult(){
        double[][] m = {
                {1.5, 2, 3, 4},
                {5.5, 6, 7, 8},
                {9.5, 1, 3, 1}
        };
        int  n = m.length - 1;
//        System.out.println(n);

        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
//                int nu = m[i].length - 1;
//                double[] num = m[j];
                System.out.println(m[i][j]);
            }
            System.out.println();
//             while (m.length - nu == 0){
//                     if (m.length - (m[i].length - 1) != 0){
//                             count++;
//                         if (count == m[i].length - 1) {
//                             i++;
//                         }
//                     }
//                     if(m.length - (m[i].length - 1) == 0){
//                         System.out.println(Arrays.toString(m[i]));
//                     }
//             }
        }
    }
}
