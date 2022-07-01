package com.rainhu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.rainhu.ToolUtility.Snippet;
public class n1423_MaximumPointsYouCanObtainFromCardsTest {
    
    n1423_MaximumPointsYouCanObtainFromCards clz = new n1423_MaximumPointsYouCanObtainFromCards();
    int[] cardPoints;
    int k;
    int expected, actual;

    @Test
    public void test1(){
        cardPoints = Snippet.stringToIntegerArray("[1,2,3,4,5,6,1]");
        k = 3;
        expected = 12;
        actual = clz.maxScore(cardPoints, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        cardPoints = Snippet.stringToIntegerArray("[2,2,2]");
        k = 2;
        expected = 4;
        actual = clz.maxScore(cardPoints, k);
        assertEquals(expected, actual);
    }

    @Test
    public void test3(){
        cardPoints = Snippet.stringToIntegerArray("[9,7,7,9,7,7,9]");
        k = 7;
        expected = 55;
        actual = clz.maxScore(cardPoints, k);
        assertEquals(expected, actual);
    }
}
