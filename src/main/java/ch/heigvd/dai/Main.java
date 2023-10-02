package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // 1B, 1KiB, 1MiB, 5MiB
        int[] sizes = {1, 1024, 1024 * 1024, 5 * 1024 * 1024};

        // Measure the time to write a file (e.g : 1 byte, no buffer and binary file)
/*        for(Boolean buffered : new Boolean[]{false, true}) {
            for (Measure.FileType fileType : Measure.FileType.values()) {
                for (int size : sizes) {
                    String str = fileType == Measure.FileType.TEXT ? "txt"  : "bin";
                    System.out.println("Writing " + fileType + " file of size " + size + "B with " + (buffered ? "" : "no ") + "buffer");
                    for (int i = 0; i < 5; i++) {
                        Measure.write(fileType + "_" + size + "B." + str, size, buffered, fileType);
                    }
                }
            }
        }*/

        for(Boolean buffered : new Boolean[]{false, true}) {
            for (Measure.FileType fileType : Measure.FileType.values()) {
                for (int size : sizes) {
                    String str = fileType == Measure.FileType.TEXT ? "txt"  : "bin";
                    System.out.println("Reading " + fileType + " file of size " + size + "B with " + (buffered ? "" : "no ") + "buffer");
                    for (int i = 0; i < 5; i++) {
                        Measure.read(fileType + "_" + size + "B." + str, buffered, fileType);
                    }
                }
            }
        }


        // Measure.write("binary_1B.bin", 1, false, Measure.FileType.BINARY);

        // Measure the time to read the same file

        // Measure.read("binary_1B.bin", false, Measure.FileType.BINARY);
    }
}
