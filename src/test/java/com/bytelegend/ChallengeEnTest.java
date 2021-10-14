package com.bytelegend;

import com.github.hcsp.test.helper.ProjectSourceFileReader;

import org.junit.jupiter.api.Test;

public class ChallengeEnTest {
    @Test
    public void test() throws Exception {
        ProjectSourceFileReader.abortTestIfClassNotChanged(
                ChallengeEn.class, "e51d5a84291919e7404a1b94e39e5a91");
        String html =
                ChallengeZhHans.readUtf8Text("target/site/apidocs/com/bytelegend/ChallengeEn.html");
        System.out.println(html);
        Utils.hasAuthor(html);
        Utils.hasSee(html);
        Utils.hasParameters(html);
        Utils.hasReturn(html);
        Utils.hasThrows(html);
    }
}
