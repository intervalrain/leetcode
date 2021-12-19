package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.n1032_StreamOfCharacters.StreamChecker;

import org.junit.jupiter.api.Test;

public class n1032_StreamOfCharactersTest{

    n1032_StreamOfCharacters clz = new n1032_StreamOfCharacters();
    StreamChecker streamChecker;
    String[] words;
    
    @Test
    public void test1(){
        words = new String[]{"cd", "f", "kl"};
        streamChecker = clz.new StreamChecker(words);
        assertFalse(streamChecker.query('a'));
        assertFalse(streamChecker.query('b'));
        assertFalse(streamChecker.query('c'));
        assertTrue (streamChecker.query('d'));
        assertFalse(streamChecker.query('e'));
        assertTrue (streamChecker.query('f'));
        assertFalse(streamChecker.query('g'));
        assertFalse(streamChecker.query('h'));
        assertFalse(streamChecker.query('i'));
        assertFalse(streamChecker.query('j'));
        assertFalse(streamChecker.query('k'));
        assertTrue (streamChecker.query('l'));
    }
}