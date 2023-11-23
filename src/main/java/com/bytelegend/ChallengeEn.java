package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 *
 * @author Eloi
 * @see <a href="https://github.com/ByteLegendQuest/java-write-javadoc/blob/main/src/main/java/com/bytelegend/ChallengeEn.java">...</a>
 */
public class ChallengeEn {
    /**
     * Read a text file with UTF-8 encoding and return its content.
     *
     * @param filePath: path of the file to be read
     * @return the content string of the text file
     * @throws IOException upon failures
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
