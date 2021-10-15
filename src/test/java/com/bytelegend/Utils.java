package com.bytelegend;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Assertions;

public class Utils {
    public static void hasAuthor(String html) {
        Assertions.assertTrue(
                selectFromJavadoc(html, "span.simpleTagLabel").stream()
                                .anyMatch(element -> element.text().contains("Author:"))
                        || hasDtTagWithText(html, "Author:"));
    }

    // javadoc 17
    private static boolean hasDtTagWithText(String html, String text) {
        return selectFromJavadoc(html, "dt").stream()
                .anyMatch(element -> element.text().contains(text));
    }

    public static void hasSee(String html) {
        Assertions.assertTrue(
                !selectFromJavadoc(html, "span.seeLabel").isEmpty()
                        || hasDtTagWithText(html, "See Also:"));
    }

    public static void hasParameters(String html) {
        Assertions.assertTrue(
                !selectFromJavadoc(html, "span.paramLabel").isEmpty()
                        || hasDtTagWithText(html, "Parameters"));
    }

    public static void hasReturn(String html) {
        Assertions.assertTrue(
                !selectFromJavadoc(html, "span.returnLabel").isEmpty()
                        || hasDtTagWithText(html, "Returns"));
    }

    public static void hasThrows(String html) {
        Assertions.assertTrue(
                !selectFromJavadoc(html, "span.throwsLabel").isEmpty()
                        || hasDtTagWithText(html, "Throws"));
    }

    private static Elements selectFromJavadoc(String html, String cssSelector) {
        Document document = Jsoup.parse(html);
        return document.select(cssSelector);
    }
}
