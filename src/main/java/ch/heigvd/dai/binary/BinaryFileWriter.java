package ch.heigvd.dai.binary;

import ch.heigvd.dai.Writable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BinaryFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        // TODO : implement this method
        try (OutputStream fos = new FileOutputStream(filename)) {

            for (int i = 0; i < sizeInBytes; i++) {
                fos.write(1);
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }

        //  throw new UnsupportedOperationException("Not implemented yet");
    }
}
