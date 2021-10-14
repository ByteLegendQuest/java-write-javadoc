package com.bytelegend;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Assertions;

public class Utils {
    public static void hasAuthor(String html) {
        Assertions.assertTrue(
                selectFromJavadoc(html, "span.simpleTagLabel").stream()
                        .anyMatch(element -> element.text().contains("Author:")));
    }

    public static void hasSee(String html) {
        Assertions.assertFalse(selectFromJavadoc(html, "span.seeLabel").isEmpty());
    }

    public static void hasParameters(String html) {
        Assertions.assertFalse(selectFromJavadoc(html, "span.paramLabel").isEmpty());
    }

    public static void hasReturns(String html) {
        Assertions.assertFalse(selectFromJavadoc(html, "span.returnLabel").isEmpty());
    }

    public static void hasThrows(String html) {
        Assertions.assertFalse(selectFromJavadoc(html, "span.returnLabel").isEmpty());
    }

    private static Elements selectFromJavadoc(String html, String cssSelector) {
        Document document = Jsoup.parse(html);
        return document.select(cssSelector);
    }
}
