package com.rainhu;

import com.rainhu.util.Snippet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class n269_AlienDictionaryTest {
    
    n269_AlienDictionary clz = new n269_AlienDictionary();
    String[] words;
    String expected, actual;

    @Test
    public void test1(){
        words = Snippet.stringToStringArray("[wrt,wrf,er,ett,rftt]");
        expected = "wertf";
        actual = clz.alienOrder(words);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        words = Snippet.stringToStringArray("[z,x]");
        expected = "zx";
        actual = clz.alienOrder(words);
        assertEquals(expected, actual);
    }
}
