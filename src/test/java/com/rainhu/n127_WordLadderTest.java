package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class n127_WordLadderTest {
    
    n127_WordLadder clz = new n127_WordLadder();
    String beginWord, endWord;
    int expected, actual;
    List<String> wordList;

    @Test
    public void test1(){
        beginWord = "hit";
        endWord = "cog";
        wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");
        expected = 5;
        actual = clz.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        beginWord = "hit";
        endWord = "cog";
        wordList = List.of("hot", "dot", "dog", "lot", "log");
        expected = 0;
        actual = clz.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        beginWord = "a";
        endWord = "c";
        wordList = List.of("a", "b", "c");
        expected = 2;
        actual = clz.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void test4(){
        beginWord = "lost";
        endWord = "miss";
        wordList = List.of("most", "mist", "miss", "lost", "fist", "fish");
        expected = 4;
        actual = clz.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }

    @Test
    public void test5(){
        beginWord = "leet";
        endWord = "code";
        wordList = List.of("lest", "leet", "lose", "code", "lode", "robe", "lost");
        expected = 6;
        actual = clz.ladderLength(beginWord, endWord, wordList);
        assertEquals(expected, actual);
    }
}
