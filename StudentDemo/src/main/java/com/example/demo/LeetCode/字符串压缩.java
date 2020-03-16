package com.example.demo.LeetCode;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/3/4 9:19
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * 示例1:
 *
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 * 示例2:
 *
 *  输入："abbccd"
 *  输出："abbccd"
 *  解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/compress-string-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 字符串压缩 {
    public static void main(String[] args) {
        System.out.println( compressString("aabcccccaaa"));
    }
    public static  String compressString(String S) {
      StringBuilder stringBuilder = new StringBuilder( );
      int i = 0;
      while (i<S.length()){
          int j = i + 1;
          while (j<S.length() && S.charAt(i)==S.charAt(j)){
              j++;
          }
          stringBuilder.append(String.valueOf(S.charAt(i)) + String.valueOf(j - i));
          i = j;
      }
        return S.length()>stringBuilder.toString().length()? stringBuilder.toString():S;

    }
}
