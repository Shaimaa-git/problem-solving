import java.util.Arrays;
public class StatsCalculator {
    public static void main(String[] args) {
        double[] numbers = {12.5, 7.2, 9.8}; // Array of three numbers
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        double mode = calculateMode(numbers);
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }
    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2;
        } else {
            return numbers[numbers.length / 2];
        }
    }
    public static double calculateMode(double[] numbers) {
        // Count occurrences of each number
        int[] counts = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    counts[i]++;
                }
            }
        }
        // Find the mode
        int maxCount = 0;
        double mode = numbers[0];
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > maxCount) {
                maxCount = counts[i];
                mode = numbers[i];
            }
        }
        return mode;
    }
}









