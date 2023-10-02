package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        try (FileReader fr = new FileReader(filename, java.nio.charset.StandardCharsets.UTF_8)) {

            int character;
            while ((character = fr.read()) != -1) {
                char c = (char) character;
                // Process each character here, you can print it or perform other operations
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }

        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
