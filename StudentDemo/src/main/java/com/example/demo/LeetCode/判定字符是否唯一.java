package com.example.demo.LeetCode;

/**
 * @Author:linjunbo
 * @Description:
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 *
 * 示例 1：
 *
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 *
 * 输入: s = "abc"
 * 输出: true
 * 限制：
 *
 * 0 <= len(s) <= 100
 * 如果你不使用额外的数据结构，会很加分。
 * @Date: 2020/2/26 17:27
 */
public class 判定字符是否唯一 {
    //方法一： 使用String中的indexOf方法
    public static boolean isUnique2(String astr) {
        for(int i = 0 ;i<astr.length();i++){
            //找不到返回-1
            if (astr.indexOf(astr.charAt(i),i+1) != -1){
                return false;
            }
        }
        return true;
    }
    //方法二： 使用位运算  ASCIICI一共128个数， 使用两个LONG类型 用位置去记录这个数就可以了
    public static boolean isUnique(String astr) {
        long low64 = 0;
        long high64 = 0;

        for (char c : astr.toCharArray()) {
            if (c >= 64) {
                long bitIndex = 1L << c - 64;
                //如果不等于0的话，说明有位置都为1 出现重复
                if ((high64 & bitIndex) != 0) {
                    return false;
                }

                high64 |= bitIndex;
            } else {
                long bitIndex = 1L << c;
                if ((low64 & bitIndex) != 0) {
                    return false;
                }

                low64 |= bitIndex;
            }

        }

        return true;
    }

    public static void main(String[] args) {

    }
}
