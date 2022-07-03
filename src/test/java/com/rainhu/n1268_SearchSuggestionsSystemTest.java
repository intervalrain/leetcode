package com.rainhu;

import java.util.List;

import com.rainhu.util.ListTest;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class n1268_SearchSuggestionsSystemTest {
    
    n1268_SearchSuggestionsSystem clz = new n1268_SearchSuggestionsSystem();
    String[] products;
    String searchWord;
    List<List<String>> expected, actual;

    @Test
    public void test1(){
        products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        searchWord = "mouse";
        expected = Arrays.asList(Arrays.asList("mobile", "moneypot", "monitor"),
                                 Arrays.asList("mobile", "moneypot", "monitor"),
                                 Arrays.asList("mouse", "mousepad"),
                                 Arrays.asList("mouse", "mousepad"),
                                 Arrays.asList("mouse", "mousepad"));
        actual = clz.suggestedProducts(products, searchWord);
        assertTrue(ListTest.strEquals(expected, actual));
    }

    @Test
    public void test2(){
        products = new String[]{"havana"};
        searchWord = "havana";
        expected = Arrays.asList(Arrays.asList("havana"),Arrays.asList("havana"),Arrays.asList("havana"),Arrays.asList("havana"),Arrays.asList("havana"),Arrays.asList("havana"));
        actual = clz.suggestedProducts(products, searchWord);
        assertTrue(ListTest.strEquals(expected, actual));
    }

}
