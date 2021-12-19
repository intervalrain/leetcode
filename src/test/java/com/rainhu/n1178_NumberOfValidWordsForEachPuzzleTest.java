package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n1178_NumberOfValidWordsForEachPuzzleTest {
    
    n1178_NumberOfValidWordsForEachPuzzle clz = new n1178_NumberOfValidWordsForEachPuzzle();
    String[] words;
    String[] puzzles;
    List<Integer> expected;
    List<Integer> actual;
    
    @Test
    public void test1(){
        words = new String[]{"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        puzzles = new String[]{"aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz"};
        actual = clz.findNumOfValidWords(words, puzzles);
        expected = Arrays.asList(1,1,3,2,4,0);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        words = new String[]{"apple", "pleas", "please"};
        puzzles = new String[]{"aelwxyz", "aelpxyz", "aelpsxy", "saelpxy", "xaelpsy"};
        actual = clz.findNumOfValidWords(words, puzzles);
        expected = Arrays.asList(0,1,3,2,0);
        assertEquals(expected, actual);
    }
}
