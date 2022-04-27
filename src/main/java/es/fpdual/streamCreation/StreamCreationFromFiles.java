package es.fpdual.streamCreation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamCreationFromFiles {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/resources/note.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(
                    line -> {
                        System.out.println("Line...");
                        System.out.println(line);
                    });
        } catch (IOException err) {
            err.printStackTrace();
        }

        System.out.println("/-----------------/");

        Path dir = Paths.get(".");
        System.out.printf("%nDirectory tree for project %s is %n", dir.toAbsolutePath());

        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}
