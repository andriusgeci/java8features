package bookapples.bufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain {

    public static void main(String[] args) throws IOException {
        String oneLine = processFile(BufferedReader::readLine);
        String twoLines = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(oneLine);
        System.out.println(twoLines);
    }

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ageciauskas\\Desktop\\j.txt"))) {
            return p.processFile(br);
        }
    }
}
