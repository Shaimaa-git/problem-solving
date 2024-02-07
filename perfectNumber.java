
public class PerfectSquareChecker {
    public static void main(String[] args) {
        int number = 9; // Change this to the number you want to check
        boolean isPerfectSquare = checkPerfectSquare(number);
        if (isPerfectSquare) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        }
    }
    public static boolean checkPerfectSquare(int number) {
        // A number is a perfect square if its square root is an integer
        double squareRoot = Math.sqrt(number);
        return squareRoot == Math.floor(squareRoot);
    }
}
