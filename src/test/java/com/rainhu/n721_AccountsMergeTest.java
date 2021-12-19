package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n721_AccountsMergeTest {
    
    n721_AccountsMerge clz = new n721_AccountsMerge();
    List<List<String>> accounts;
    List<List<String>> expected;
    List<List<String>> actual;

    @Test
    public void test1(){
        accounts = List.of(List.of("John","johnsmith@mail.com","john_newyork@mail.com"),
                           List.of("John","johnsmith@mail.com","john00@mail.com" ),
                           List.of("Mary","mary@mail.com"),
                           List.of("John","johnnybravo@mail.com"));
        expected = List.of(List.of("John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"),
                           List.of("Mary","mary@mail.com"),
                           List.of("John","johnnybravo@mail.com"));
        actual = clz.accountsMerge(accounts);
        assertTrue(equals(expected, actual));
    }

    @Test
    public void test2(){
        accounts = List.of(List.of("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"),
                           List.of("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"),
                           List.of("Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"),
                           List.of("Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"),
                           List.of("Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co"));
        expected = List.of(List.of("Ethan","Ethan0@m.co","Ethan4@m.co","Ethan5@m.co"),
                           List.of("Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"),
                           List.of("Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"),
                           List.of("Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"),
                           List.of("Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co"));
        actual = clz.accountsMerge(accounts);
        assertTrue(equals(expected, actual));
    }

    public boolean equals(List<List<String>> a, List<List<String>> b){
        if (a == null && b == null) return false;
        if ((a == null && b != null) || (a != null && b == null) || a.size() != b.size()) return false;
        ArrayList<String> c = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        c = new ArrayList<String>(c);
        d = new ArrayList<String>(d);

        Collections.sort(c);
        Collections.sort(d);        
        
        return c.equals(d);
    }
}
