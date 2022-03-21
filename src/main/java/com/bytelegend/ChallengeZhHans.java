package com.bytelegend;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
 * 请使用Javadoc的标准标签 @author @see @param @return @throws，把本类中的所有注释改写成Javadoc。
 * 请勿修改注释内容本身，但是你可以把作者改写成你自己的名字，因为你当之无愧是本代码的作者之一。
 *
 * @author：iwillbe
 * See: https://github.com/ByteLegendQuest/java-write-javadoc/blob/main/src/main/java/com/bytelegend/ChallengeZhHans.java
 */
public class ChallengeZhHans {
    /*
     * 使用UTF-8编码读取一个文本文件并返回其内容
     *
     * 参数filePath：要读取的文件路径
     * 返回值：读取到的文本内容字符串
     * 抛出IOException：如果无法读取
     */
    public static String readUtf8Text(String filePath) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(filePath));
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
