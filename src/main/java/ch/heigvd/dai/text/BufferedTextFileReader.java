package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        try (BufferedReader br = new BufferedReader(new FileReader(filename, java.nio.charset.StandardCharsets.UTF_8))) {
            String line;
            // Read and print each line from the file
            while ((line = br.readLine()) != null) {
                //do nothing
            }
        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
