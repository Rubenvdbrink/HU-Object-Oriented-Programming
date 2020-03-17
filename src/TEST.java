import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TEST {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("C:\\Users\\Ruben\\Desktop/nieuw.txt");
        BufferedWriter out = Files.newBufferedWriter(p);
    }
}
