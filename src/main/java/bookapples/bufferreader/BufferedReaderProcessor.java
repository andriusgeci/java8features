package bookapples.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;


@FunctionalInterface
public interface BufferedReaderProcessor {
    String processFile(BufferedReader b) throws IOException;
}
