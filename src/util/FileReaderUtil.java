package util;

import java.io.*;

public class FileReaderUtil {

    public static String readFile(String path) throws IOException {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        }
        return data.toString();
    }
}