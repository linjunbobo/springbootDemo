package com.example.demo.LeetCode;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/3/2 13:41
 */

import java.util.Arrays;

/**
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 *
 * 示例1:
 *
 *  输入："Mr John Smith    ", 13
 *  输出："Mr%20John%20Smith"
 * 示例2:
 *
 *  输入："               ", 5
 *  输出："%20%20%20%20%20"
 * 提示：
 *
 * 字符串长度在[0, 500000]范围内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-to-url-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class URL化 {
    public static void main(String[] args) {
        System.out.println(replaceSpaces("               ",5));
    }

        public static String replaceSpaces(String S, int length) {
            char[] sChat = S.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i= 0 ; i<length ; i++){
                if (sChat[i] == 32){
                    stringBuilder.append("%20");
                }else {
                    stringBuilder.append(sChat[i]);
                }
            }
            return  stringBuilder.toString();

        }

}
