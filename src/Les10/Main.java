package Les10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Path pad = Path.of("C:\\Users\\Ruben\\Desktop\\test.txt");
        BufferedWriter out = Files.newBufferedWriter(pad);
        out.write("test");
        out.close();

        BufferedReader lees = Files.newBufferedReader(pad);
        String regel = lees.readLine();
        System.out.println(regel);
        lees.close();

    }
}
