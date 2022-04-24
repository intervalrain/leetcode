package com.rainhu;

import java.util.HashMap;
import java.util.Map;

/**
 * 535. Encode and Decode TinyURL
 * 
 * Note: This is a companion problem to the System Design problem: Design TinyURL.
 * 
 * TinyURL is URL a shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short URL such as 
 * https://tinyurl.com/4e9iAk.
 * Design a class to encode a URL and decode a tinyurl.
 * 
 * There is no restriction on how your encode/decode algorithm should work.
 * You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 * 
 * Implement the Solution:
 *      + Constructor initializes the object of the system.
 *      + String encode(String longUrl) Returns a tiny URL for the given longUrl.
 *      + String decode(String shorUrl) Returns the original long URL for the given shortUrl.
 *        It is guaranteed that the given shortUrl was encoded by the same object.
 * 
 * @author: Rain Hu
 * @version: 1
 * @since: 2022/4/23
 * @apiNote:
 */

public class n535_EncodeAndDecodeTinyURL {

    Map<String, String> index = new HashMap<>();
    Map<String, String> revIndex = new HashMap<>();
    static String BASE_HOST = "https://tinyurl.com/";

    public String encode(String longUrl) {
        if (revIndex.containsKey(longUrl)) return BASE_HOST + revIndex.get(longUrl);
        String charSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String key = null;
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++){
                int r = (int)(Math.random() * charSet.length());
                sb.append(charSet.charAt(r));
            }
            key = sb.toString();
        } while (index.containsKey(key));
        index.put(key, longUrl);
        revIndex.put(longUrl, key);
        return BASE_HOST + key;
    }

    public String decode(String shortUrl) {
        return index.get(shortUrl.replaceAll(BASE_HOST, ""));
    }
}
