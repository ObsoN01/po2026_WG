package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

    @Test
    public void mapAB4() {
        // Przykład 1: różne długości
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        map1.put("c", "cake");

        Map<String, String> expected1 = new HashMap<>();
        expected1.put("a", "aaa");
        expected1.put("b", "bb");
        expected1.put("c", "aaa");

        assertEquals(expected1, cb.mapAB4(map1));

        // Przykład 2: równe długości (a i b stają się pustymi stringami)
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aa");
        map2.put("b", "bbb");
        map2.put("c", "cake");

        Map<String, String> expected2 = new HashMap<>();
        expected2.put("a", "aa");
        expected2.put("b", "bbb");
        expected2.put("c", "bbb");

        assertEquals(expected2, cb.mapAB4(map2));
    }

    @Test
    public void pairs() {
        String[] input1 = {"code", "bug"};
        Map<String, String> expected1 = new HashMap<>();
        expected1.put("b", "g");
        expected1.put("c", "e");
        assertEquals(expected1, cb.pairs(input1));

        String[] input2 = {"man", "moon", "good", "night"};
        Map<String, String> expected2 = new HashMap<>();
        expected2.put("g", "d");
        expected2.put("m", "n");
        expected2.put("n", "t");
        assertEquals(expected2, cb.pairs(input2));

        String[] input4 = {"are", "codes", "and", "cods"};
        Map<String, String> expected4 = new HashMap<>();
        expected4.put("a", "d");
        expected4.put("c", "s");
        assertEquals(expected4, cb.pairs(input4));

        String[] input5 = {};
        Map<String, String> expected5 = new HashMap<>();
        assertEquals(expected5, cb.pairs(input5));

        String[] input6 = {"", "codes", "and", "cods"};
        Map<String, String> expected6 = new HashMap<>();
        expected6.put("a", "d");
        expected6.put("c", "s");
        assertEquals(expected6, cb.pairs(input6));
    }
}