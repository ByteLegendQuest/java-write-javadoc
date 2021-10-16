package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * 挑战在
 *
 * @author MeteorAndy
 * @date 2021/10/16
 * @see <a href="https://github.com/ByteLegendQuest/java-write-javadoc/blob/main/src/main/java/com/bytelegend/ChallengeEn.java">...</a>
 */
public class ChallengeEn {
    /**
     * 读utf8文本
     *
     * @param filePath 文件路径
     * @return {@link String}
     * @throws IOException ioexception
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
