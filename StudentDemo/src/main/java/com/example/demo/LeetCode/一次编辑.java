package com.example.demo.LeetCode;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/3/3 8:45
 */

/**
 * 字符串有三种编辑操作:插入一个字符、删除一个字符或者替换一个字符。 给定两个字符串，编写一个函数判定它们是否只需要一次(或者零次)编辑。
 *
 *  
 *
 * 示例 1:
 *
 * 输入:
 * first = "pale"
 * second = "ple"
 * 输出: True
 *  
 *
 * 示例 2:
 *
 * 输入:
 * first = "pales"
 * second = "pal"
 * 输出: False
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/one-away-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 一次编辑 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pales","pal"));
    }
    public static boolean oneEditAway(String first, String second) {
        //解题思路 无脑暴力法
        if (Math.abs(first.length()-second.length()) >=2){
        return false;
        } else if (first.length()==second.length()){
            int num =0;
            for(int i = 0; i<first.length()&&i<second.length() ; i++){
                if (  first.charAt(i) != second.charAt(i) )
                    num++;
            }
            return num <2;
        } else {
            for(int i = 0; i<first.length()&&i<second.length() ; i++){
                if (  first.charAt(i) != second.charAt(i) ){
                    char charf = first.length() > second.length() ?  first.charAt(i+1) :  second.charAt(i+1);
                    char chars  = first.length() < second.length() ?   first.charAt(i) :  second.charAt(i);
                    if (charf != chars )
                        return false;
                }

            }
            return  true;
        }


    }
}
