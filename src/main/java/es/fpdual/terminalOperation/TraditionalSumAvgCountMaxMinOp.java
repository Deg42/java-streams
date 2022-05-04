package es.fpdual.terminalOperation;

public class TraditionalSumAvgCountMaxMinOp {
    public static void main(String[] args) {

        int[] numbers = { 21, 77, 77, 59, 2, 51, 70, 95, 75, 93, 64, 88, 80, 27, 72, 11, 86, 82, 58, 24 };

        // Sum
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the numbers: " + sum);

        // Average
        double average = sum / numbers.length;

        System.out.println("The average of the numbers: " + average);

        // Count
        System.out.println("The amount of the numbers: " + numbers.length);

        // Max
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The max number: " + max);

        // Min
        int min = numbers[0];
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The min number: " + min);

    }
}
