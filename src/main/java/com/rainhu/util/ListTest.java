package com.rainhu.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 * A simple equal test for List of generic's List.
 */
public class ListTest{

    public static boolean intEquals(List<List<Integer>> expected, List<List<Integer>> actual){
        // if two lists are both null return false.
        if (expected == null && actual == null) return false;

        // if two lists' size are different return false.
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        // create two list of string, add all elements as string.
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < expected.size(); i++){
            c.add(expected.get(i).toString());
            d.add(actual.get(i).toString());
        }

        Collections.sort(c);
        Collections.sort(d);

        return c.equals(d);
    }

    public static boolean strEquals(List<List<String>> expected, List<List<String>> actual){
        // if two lists are both null return false.
        if (expected == null && actual == null) return false;

        // if two lists' size are different return false.
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        // create two list of string, add all elements as string.
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < expected.size(); i++){
            c.add(expected.get(i).toString());
            d.add(actual.get(i).toString());
        }

        Collections.sort(c);
        Collections.sort(d);

        return c.equals(d);
    }


    public static boolean chrEquals(List<List<Character>> expected, List<List<Character>> actual){
        // if two lists are both null return false.
        if (expected == null && actual == null) return false;

        // if two lists' size are different return false.
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        // create two list of string, add all elements as string.
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < expected.size(); i++){
            c.add(expected.get(i).toString());
            d.add(actual.get(i).toString());
        }

        Collections.sort(c);
        Collections.sort(d);

        return c.equals(d);
    }


    public static boolean dblEquals(List<List<Double>> expected, List<List<Double>> actual){
        // if two lists are both null return false.
        if (expected == null && actual == null) return false;

        // if two lists' size are different return false.
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        // create two list of string, add all elements as string.
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < expected.size(); i++){
            c.add(expected.get(i).toString());
            d.add(actual.get(i).toString());
        }

        Collections.sort(c);
        Collections.sort(d);

        return c.equals(d);
    }

    public static boolean boolEquals(List<List<Boolean>> expected, List<List<Boolean>> actual){
        // if two lists are both null return false.
        if (expected == null && actual == null) return false;

        // if two lists' size are different return false.
        if ((expected == null && actual != null) || (expected != null && actual == null) || expected.size() != actual.size()) return false;

        // create two list of string, add all elements as string.
        List<String> c = new ArrayList<>();
        List<String> d = new ArrayList<>();
        for (int i = 0; i < expected.size(); i++){
            c.add(expected.get(i).toString());
            d.add(actual.get(i).toString());
        }

        Collections.sort(c);
        Collections.sort(d);

        return c.equals(d);
    }
}
