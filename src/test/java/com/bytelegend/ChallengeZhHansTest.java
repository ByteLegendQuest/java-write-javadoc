package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.junit.jupiter.api.Test;

public class ChallengeZhHansTest {
    @Test
    public void test() throws Exception {
        ProjectSourceFileReader.abortTestIfClassNotChanged(
                ChallengeZhHans.class, "26705718a814d403460deca77dbd7dc2");
        String html =
                ChallengeZhHans.readUtf8Text(
                        "target/site/apidocs/com/bytelegend/ChallengeZhHans.html");
        System.out.println(html);
        Utils.hasAuthor(html);
        Utils.hasSee(html);
        Utils.hasParameters(html);
        Utils.hasReturns(html);
        Utils.hasThrows(html);
    }
}
