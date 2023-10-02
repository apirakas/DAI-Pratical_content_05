package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedBinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filename))) {

            for (int i = 0; i < 255; i++) {
                bos.write(i);
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }

        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
