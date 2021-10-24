package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Zhaofeng Zhou
 * @see <a href="https://github.com/ByteLegendQuest/java-write-javadoc/blob/main/src/main/java/com/bytelegend/ChallengeZhHans.java">ChallengeZhHans</a>
 */
public class ChallengeZhHans {
    /**
     * 使用UTF-8编码读取一个文本文件并返回其内容
     *
     * @param filePath 要读取的文件路径
     * @return 读取到的文本内容字符串
     * @throws IOException 如果无法读取
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
