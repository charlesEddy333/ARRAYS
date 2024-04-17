import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SORT {
    public static void main(String[] args) {
//        int[] arrays = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        //calculate the value for each array element
//        System.out.printf("%5s %8s\n", "index", "values");
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
            System.out.printf("%5s %8s\n", "index", "values");
//            System.out.printf("%5d %8d\n", counter, arrays[counter]);
        }
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d %8d\n", counter, array[counter]);
//            System.out.printf("%5d %8d\n", counter, arrays[counter]);
        }
    }
}
