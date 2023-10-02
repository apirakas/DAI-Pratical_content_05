package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        // TODO : implement this method
        try (BufferedInputStream bfr = new BufferedInputStream(new FileInputStream(filename))) {

            int b; // is -1 if end of file or byte value 0-255
            while ((b = bfr.read()) != -1) {
                //do nothing
            }

        } catch (IOException e) {
            // Handle exception
            System.out.println("Exception: " + e);
        }

        //
        // throw new UnsupportedOperationException("Not implemented yet");
    }
}
