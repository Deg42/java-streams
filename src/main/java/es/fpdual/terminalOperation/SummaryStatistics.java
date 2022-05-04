package es.fpdual.terminalOperation;

import java.util.stream.IntStream;

public class SummaryStatistics {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 20).summaryStatistics());

        System.out.println("Sum in range 1 to 20: " +
                IntStream.range(1, 20)
                        .summaryStatistics()
                        .getSum());

        System.out.println("Average in range 1 to 20: " +
                IntStream.range(1, 20)
                        .summaryStatistics()
                        .getAverage());
    }
}
