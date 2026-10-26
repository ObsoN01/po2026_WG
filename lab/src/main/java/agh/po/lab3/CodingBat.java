package agh.po.lab3;

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

    public static void main(String[] args) {
        CodingBat cb = new CodingBat();

        System.out.println(cb.icyHot(120, -1));

        System.out.println(cb.in1020(12, 99));

        System.out.println(cb.has22(new int[]{1,2,2}));

        System.out.println(cb.array123(new int[]{1,2,2}));

        System.out.println(cb.right2("Hello2"));
    }
}
