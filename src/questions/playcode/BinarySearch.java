 package questions.playcode;

public class BinarySearch {
    public static int binarySearch(int[] elements, int items){
        int low = 0;
        int high = elements.length - 1;

        while (low <= high){
            int mid = (low + high);
            int guess = elements[mid];

            if(guess == items)
                return mid;
            if(guess > items)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        int nums = binarySearch(myList, -1);
        System.out.println(nums);
    }
}
