public class ARRAY2 {
    public static void main(String[] args) {

        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int totalSum = 0;


        for (int num : numbers) {
            totalSum += num;
        }


        System.out.println("The sum of numbers between 0 and 10 is: " + totalSum);
    }
}