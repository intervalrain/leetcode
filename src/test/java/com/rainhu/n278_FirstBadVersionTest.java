package com.rainhu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.rainhu.n278_FirstBadVersion.VersionControl;

import org.junit.jupiter.api.Test;

public class n278_FirstBadVersionTest {
    
    n278_FirstBadVersion clz = new n278_FirstBadVersion();

    int bad;
    int n;
    int actual, expected;

    @Test
    public void test1(){
        n = 5;
        bad = 4;
        // VersionControl vc = new VersionControl(n, bad);
        actual = clz.firstBadVersion(n);
    }

    @Test
    public void test2(){
        n = 1;
        bad = 1;
    }


    @Test
    public void testVersionControl(){
        VersionControl vc = new VersionControl(5, 4);
        assertFalse(vc.isBadVersion(1));
        assertFalse(vc.isBadVersion(2));
        assertFalse(vc.isBadVersion(3));
        assertTrue(vc.isBadVersion(4));
        assertTrue(vc.isBadVersion(5));
    }
}
