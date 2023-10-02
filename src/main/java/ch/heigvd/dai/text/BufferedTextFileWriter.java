package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, java.nio.charset.StandardCharsets.UTF_8))) {
            bw.write("a".repeat(Math.max(0, sizeInBytes)));
        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
