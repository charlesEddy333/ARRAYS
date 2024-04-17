import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NAME {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Ivy", "Jack"};
        String[] array = new String[ARRAY_LENGTH];

        // Assign names to array elements
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = names[counter];
        }

        // Display array elements with their corresponding index
        System.out.printf("%5s %8s\n", "Index", "Name");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d %8s\n", counter, array[counter]);
        }
    }
}
