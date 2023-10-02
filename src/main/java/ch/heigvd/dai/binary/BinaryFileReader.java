package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        // Create an InputStream to read the binary data from the file
        try (InputStream fis = new FileInputStream(filename)) {

            int b; // is -1 if end of file or byte value 0-255
            while ((b = fis.read()) != -1) {
                //do nothing
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
