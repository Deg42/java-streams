package es.fpdual.terminalOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class ReduceOp {
    public static void main(String[] args) {

        int[] numbers = { 21, 77, 77, 59, 2, 51, 70, 95, 75, 93, 64, 88, 80, 27, 72, 11, 86, 82, 58, 24 };

        /*
         * int sum = IntStream.of(numbers)
         * .reduce(0, new IntBinaryOperator() {
         * 
         * @Override
         * public int applyAsInt(int left, int right) {
         * return left + right;
         * }
         * });
         */

        int sum = IntStream.of(numbers)
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers is: " + sum);

        Path path = Paths.get("src/main/resources/note.txt");
        String text = "";
        try (Stream<String> lines = Files.lines(path)) {
            text = lines.map(line -> line.replace(", ", "")).reduce("",
                    (line1, line2) -> line1.concat("\n").concat(line2));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/note2.txt"))) {
            bw.write(text);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
