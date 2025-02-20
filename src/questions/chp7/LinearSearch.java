package questions.chp7;

public class LinearSearch {
    public static int linearSearch(int[] list, int key){
        for (int count = 0; count < list.length; count++) {
            if (key == list[count]) {
                return count;
            }
        }
        return - 1;
    }


    public static void main(String[] args) {
        int[] list = {1, 4, 4, 2, 5, -3, 6, 2};
        int i = linearSearch(list, 4);
        int j = linearSearch(list, -4);
        int k = linearSearch(list, -3);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        // it return the index of where the number is in the array.
    }
}
