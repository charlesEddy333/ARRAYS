import java.util.Scanner;

public class Response {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] responses = new int[10];

        System.out.println("Customer Response: 1-Very Poor, 2-Poor, 3-Fair, 4-Good, 5-Very Good (1-5):");

        for (int i = 0; i < responses.length; i++) {
            System.out.print("Customer " + (i + 1) + " response: ");
            int response = scanner.nextInt();
            while (response < 1 || response > 5) {
                System.out.println("Invalid response! Please enter a number between 1 and 5.");
                System.out.print("Customer " + (i + 1) + " response: ");
                response = scanner.nextInt();
            }
            responses[i] = response;
        }

        System.out.println("\nIndividual Responses:");
        for (int i = 0; i < responses.length; i++) {
            System.out.print("Customer " + (i + 1) + " response: ");
            switch (responses[i]) {
                case 1:
                    System.out.println("Very Poor");
                    break;
                case 2:
                    System.out.println("Poor");
                    break;
                case 3:
                    System.out.println("Fair");
                    break;
                case 4:
                    System.out.println("Good");
                    break;
                case 5:
                    System.out.println("Very Good");
                    break;
            }
        }

        int[] counts = new int[5];
        for (int i = 0; i < responses.length; i++) {
            counts[responses[i] - 1]++;
        }


        System.out.println("\nNumber of Each Response:");
        String[] labels = {"Very Poor", "Poor", "Fair", "Good", "Very Good"};
        int totalResponses = 0;
        int weightedSum = 0;
        for (int i = 0; i < counts.length; i++) {
            System.out.println(labels[i] + ": " + counts[i]);
            totalResponses += counts[i];
            weightedSum += counts[i] * (i + 1);
        }

        double averageRating = (double) weightedSum / totalResponses;
        System.out.println("\nAverage Rating: " + averageRating);

        int minCountIndex = 0, maxCountIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] < counts[minCountIndex]) {
                minCountIndex = i;
            }
            if (counts[i] > counts[maxCountIndex]) {
                maxCountIndex = i;
            }
        }

        System.out.println("Least Common Response: " + labels[minCountIndex] + " (" + counts[minCountIndex] + " times)");
        System.out.println("Most Common Response: " + labels[maxCountIndex] + " (" + counts[maxCountIndex] + " times)");
    }
}
