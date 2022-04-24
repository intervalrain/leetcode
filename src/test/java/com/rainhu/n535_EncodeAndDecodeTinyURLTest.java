package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n535_EncodeAndDecodeTinyURLTest {
    
    n535_EncodeAndDecodeTinyURL clz = new n535_EncodeAndDecodeTinyURL();
    String longUrl, shortUrl;

    @Test
    public void test1(){
        longUrl = "https://leetcode.com/problems/design-tinyurl";
        shortUrl = clz.encode(longUrl); // e.g. https://tinyurl.com/4e9iAk
        assertTrue(shortUrl.length() == "https://tinyurl.com/4e9iAk".length());
        assertNotEquals(longUrl, clz.encode(longUrl));
        assertEquals(longUrl, clz.decode(shortUrl));
    }
        
}
