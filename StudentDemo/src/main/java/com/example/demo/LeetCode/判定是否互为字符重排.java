package com.example.demo.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/2/28 17:12
 */

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 *
 * 示例 1：
 *
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 *
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 * 说明：
 *
 * 0 <= len(s1) <= 100
 * 0 <= len(s2) <= 100
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 判定是否互为字符重排 {
    public static  boolean  CheckPermutation(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if (s1Array.length != s2Array.length) return false;
        for (int i = 0; i < s1Array.length; i++) {
            if (s1Array[i] != s2Array[i]) {
                return false;
            }
        }
        return true;
    }
    public static void tets( List<Integer> list){
        if (list.isEmpty() )
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println(CheckPermutation("abc","bad"));

        List<Integer> list = new ArrayList<>();
        tets(list);

    }

}
