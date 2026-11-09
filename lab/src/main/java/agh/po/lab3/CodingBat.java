package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
//    Warmup1
    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        else {
            return false;
        }
    }

//    Warump1 in1020
    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (a >= 10 && b <= 20)) {
            return true;
        }
        else {
            return false;
        }
    }

//    array2 has22
    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2) {
                if (i == 0) {
                    if (nums[i+1] == 2) {
                        return true;
                    }
                }
                else if (i == nums.length) {
                    if (nums[i-1] == 2) {
                        return true;
                    }
                }
                else if ((nums[i-1] == 2) || (nums[i+1] == 2)) {
                    return true;
                }
            }
        }
        return false;
    }

//    String1 right2
    public String right2(String str) {
        if (str.length() <= 2) {
            return str;
        }
        return str.substring(str.length()-2, str.length()) + str.substring(0, str.length()-2);
    }

//    Warmup2 array123
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                return true;
            }
        }
        return false;
    }

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aVal = map.get("a");
            String bVal = map.get("b");

            int lenA = aVal.length();
            int lenB = bVal.length();

            if (lenA > lenB) {
                map.put("c", aVal);
            } else if (lenB > lenA) {
                map.put("c", bVal);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            if (s.length() < 1) {
                continue;
            }
            String first = String.valueOf(s.charAt(0));
            String last = String.valueOf(s.charAt(s.length() - 1));
            map.put(first, last);
        }

        return map;
    }

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "aa");
        testMap.put("b", "bbb");
        testMap.put("c", "cake");

        System.out.println(cb.mapAB4(testMap));

//        System.out.println(cb.icyHot(120, -1));
//
//        System.out.println(cb.in1020(12, 99));
//
//        System.out.println(cb.has22(new int[]{1,2,2}));
//
//        System.out.println(cb.array123(new int[]{1,2,2}));
//
//        System.out.println(cb.right2("Hello2"));
    }
}
