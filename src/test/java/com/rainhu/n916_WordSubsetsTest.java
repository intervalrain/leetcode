package com.rainhu;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.rainhu.util.Snippet;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class n916_WordSubsetsTest {

    n916_WordSubsets clz = new n916_WordSubsets();
    String[] words1, words2;
    List<String> expected, actual;

    Boolean isValid(List<String> expected, List<String> actual){
        if (expected.size() != actual.size())
            return false;
        for (String s : expected){
            actual.remove(s);
        }
        return actual.isEmpty();
    }

    @Test
    public void test1(){
        words1 = Snippet.stringToStringArray("[amazon,apple,facebook,google,leetcode]");
        words2 = Snippet.stringToStringArray("[e,o]");
        expected = Arrays.asList(Snippet.stringToStringArray("[facebook,google,leetcode]"));
        actual = clz.wordSubsets(words1, words2);
        assertTrue(isValid(expected, actual));
    }

    @Test
    public void test2(){
        words1 = Snippet.stringToStringArray("[amazon,apple,facebook,google,leetcode]");
        words2 = Snippet.stringToStringArray("[l,e]");
        expected = Arrays.asList(Snippet.stringToStringArray("[apple,google,leetcode]"));
        actual = clz.wordSubsets(words1, words2);
        assertTrue(isValid(expected, actual));
    }

    @Test
    public void test(){
        words1 = Snippet.stringToStringArray("[amazon,apple,facebook,google,leetcode]");
        words2 = Snippet.stringToStringArray("[e,oo]");
        expected = Arrays.asList(Snippet.stringToStringArray("[facebook,google]"));
        actual = clz.wordSubsets(words1, words2);
        assertTrue(isValid(expected, actual));
    }
    
}
