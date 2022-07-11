package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * 
 * @author:xuyupeng
 * 
 */
public class ChallengeZhHans {
    /*
     * @see:使用UTF-8编码读取一个文本文件并返回其内容
     *
     * @param:参数filePath：要读取的文件路径
     * @return:返回值：读取到的文本内容字符串
     * @throws:抛出IOException：如果无法读取
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
