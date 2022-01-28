package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class n211_DesignAddandSearchWordsDataStructureTest {

    n211_DesignAddandSearchWordsDataStructure clz = new n211_DesignAddandSearchWordsDataStructure();

    @Test
    public void test1(){
        
        clz.addWord("bad");
        clz.addWord("dad");
        clz.addWord("mad");
        boolean param_1, param_2, param_3, param_4;
        param_1 = clz.search("pad");
        param_2 = clz.search("bad");
        param_3 = clz.search(".ad");
        param_4 = clz.search("b..");
        assertFalse(param_1);
        assertTrue(param_2);
        assertTrue(param_3);
        assertTrue(param_4);
    }
    
}
