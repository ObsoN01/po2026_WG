package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat cb = new CodingBat();
    @Test
    public void icyHot() {
        assertEquals(true, cb.icyHot(120, -1));
        assertEquals(true, cb.icyHot(-1, 120));
        assertEquals(false, cb.icyHot(2, 120));
        assertEquals(false, cb.icyHot(-1, 100));
        assertEquals(false, cb.icyHot(-2, -2));
        assertEquals(false, cb.icyHot(120, 120));
    }

    @Test
    public void in1020() {
        assertEquals(true, cb.in1020(12, 99));
        assertEquals(true, cb.in1020(21, 12));
        assertEquals(false, cb.in1020(8, 99));
        assertEquals(true, cb.in1020(99, 10));
        assertEquals(true, cb.in1020(20, 20));
        assertEquals(false, cb.in1020(21, 21));
        assertEquals(false, cb.in1020(9, 9));
    }

    @Test
    public void has22() {
        assertEquals(true, cb.has22(new int[]{1, 2, 2}));
        assertEquals(false, cb.has22(new int[]{1, 2, 1, 2}));
        assertEquals(false, cb.has22(new int[]{2, 1, 2}));
        assertEquals(true, cb.has22(new int[]{2, 2, 1, 2}));
        assertEquals(false, cb.has22(new int[]{1, 3, 2}));
        assertEquals(true, cb.has22(new int[]{1, 3, 2, 2}));
        assertEquals(true, cb.has22(new int[]{2, 3, 2, 2}));
        assertEquals(true, cb.has22(new int[]{4, 2, 4, 2, 2, 5}));
        assertEquals(false, cb.has22(new int[]{1, 2}));
        assertEquals(true, cb.has22(new int[]{2, 2}));
        assertEquals(false, cb.has22(new int[]{2}));
        assertEquals(false, cb.has22(new int[]{}));
        assertEquals(true, cb.has22(new int[]{3, 3, 2, 2}));
        assertEquals(false, cb.has22(new int[]{5, 2, 5, 2}));
    }

    @Test
    public void right2() {
        assertEquals("loHel", cb.right2("Hello"));
        assertEquals("vaja", cb.right2("java"));
        assertEquals("Hi", cb.right2("Hi"));
        assertEquals("deco", cb.right2("code"));
        assertEquals("atc", cb.right2("cat"));
        assertEquals("45123", cb.right2("12345"));
    }

    @Test
    public void array123() {
        assertEquals(true, cb.array123(new int[]{1, 1, 2, 3, 1}));
        assertEquals(false, cb.array123(new int[]{1, 1, 2, 4, 1}));
        assertEquals(true, cb.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertEquals(false, cb.array123(new int[]{1, 1, 2, 1, 2, 1}));
        assertEquals(true, cb.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertEquals(true, cb.array123(new int[]{1, 2, 3}));
        assertEquals(false, cb.array123(new int[]{1, 1, 1}));
        assertEquals(false, cb.array123(new int[]{1, 2}));
        assertEquals(false, cb.array123(new int[]{1}));
        assertEquals(false, cb.array123(new int[]{}));
    }
}