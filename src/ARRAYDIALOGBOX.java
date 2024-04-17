import javax.swing.JOptionPane;

public class ARRAYDIALOGBOX {
    public static void main(String[] args) {
        int[] responses = new int[10];

        // Display input dialog to get responses from the user
        for (int i = 0; i < responses.length; i++) {
            String responseString = JOptionPane.showInputDialog(null, "Customer " + (i + 1) + " response (1-5):");
            int response = Integer.parseInt(responseString);
            while (response < 1 || response > 5) {
                JOptionPane.showMessageDialog(null, "Invalid response! Please enter a number between 1 and 5.");
                responseString = JOptionPane.showInputDialog(null, "Customer " + (i + 1) + " response (1-5):");
                response = Integer.parseInt(responseString);
            }
            responses[i] = response;
        }


        StringBuilder individualResponses = new StringBuilder("Individual Responses:\n");
        for (int i = 0; i < responses.length; i++) {
            individualResponses.append("Customer ").append(i + 1).append(" response: ");
            switch (responses[i]) {
                case 1:
                    individualResponses.append("Very Poor");
                    break;
                case 2:
                    individualResponses.append("Poor");
                    break;
                case 3:
                    individualResponses.append("Fair");
                    break;
                case 4:
                    individualResponses.append("Good");
                    break;
                case 5:
                    individualResponses.append("Very Good");
                    break;
            }
            individualResponses.append("\n");
        }
        JOptionPane.showMessageDialog(null, individualResponses.toString());


        int[] counts = new int[5];
        for (int i = 0; i < responses.length; i++) {
            counts[responses[i] - 1]++;
        }


        StringBuilder countsMessage = new StringBuilder("Number of Each Response:\n");
        String[] labels = {"Very Poor", "Poor", "Fair", "Good", "Very Good"};
        for (int i = 0; i < counts.length; i++) {
            countsMessage.append(labels[i]).append(": ").append(counts[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, countsMessage.toString());

        int totalResponses = responses.length;
        int weightedSum = 0;
        for (int i = 0; i < counts.length; i++) {
            weightedSum += counts[i] * (i + 1);
        }
        double averageRating = (double) weightedSum / totalResponses;
        JOptionPane.showMessageDialog(null, "Average Rating: " + averageRating + " rating");


        int minCountIndex = 0, maxCountIndex = 0;
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] < counts[minCountIndex]) {
                minCountIndex = i;
            }
            if (counts[i] > counts[maxCountIndex]) {
                maxCountIndex = i;
            }
        }


        JOptionPane.showMessageDialog(null, "Least Common Response: " + labels[minCountIndex] + " (" + counts[minCountIndex] + " times)");
        JOptionPane.showMessageDialog(null, "Most Common Response: " + labels[maxCountIndex] + " (" + counts[maxCountIndex] + " times)");
    }
}
