package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class n1396_DesignUndergroundSystemTest {

    @Test
    public void test1(){
        n1396_DesignUndergroundSystem clz = new n1396_DesignUndergroundSystem();
        List<Double> expected = new ArrayList<>();
        List<Double> actual = new ArrayList<>();
        expected = Arrays.asList(null,null,null,null,null,null,null,14.00000,11.00000,null,11.00000,null,12.00000);
        actual.add(null);
        actual.add(null); clz.checkIn(45, "Leyton", 3);
        actual.add(null); clz.checkIn(32, "Paradise", 8);
        actual.add(null); clz.checkIn(27, "Leyton", 10);
        actual.add(null); clz.checkOut(45, "Waterloo", 15);
        actual.add(null); clz.checkOut(27, "Waterloo", 20);
        actual.add(null); clz.checkOut(32, "Cambridge", 22);
        actual.add(clz.getAverageTime("Paradise", "Cambridge"));
        actual.add(clz.getAverageTime("Leyton", "Waterloo"));
        actual.add(null); clz.checkIn(10, "Leyton", 24);
        actual.add(clz.getAverageTime("Leyton", "Waterloo"));
        actual.add(null); clz.checkOut(10, "Waterloo", 38);
        actual.add(clz.getAverageTime("Leyton", "Waterloo"));
        assertEquals(expected, actual);
    }
}
