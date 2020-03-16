package com.example.demo.LeetCode;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/3/5 17:03
 */

/**
 * 给定一幅由N × N矩阵表示的图像，其中每个像素的大小为4字节，编写一种方法，将图像旋转90度。
 *
 * 不占用额外内存空间能否做到？
 *
 *  
 *
 * 示例 1:
 *
 * 给定 matrix =
 * [
 *   [1,2,3],
 *   [4,5,6],
 *   [7,8,9]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [7,4,1],
 *   [8,5,2],
 *   [9,6,3]
 * ]
 * 示例 2:
 *
 * 给定 matrix =
 * [
 *   [ 5, 1, 9,11],
 *   [ 2, 4, 8,10],
 *   [13, 3, 6, 7],
 *   [15,14,12,16]
 * ],
 *
 * 原地旋转输入矩阵，使其变为:
 * [
 *   [15,13, 2, 5],
 *   [14, 3, 4, 1],
 *   [12, 6, 8, 9],
 *   [16, 7,10,11]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-matrix-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 旋转矩阵 {
    //解题思路 翻转=对角线交换+每一行数字对称换位
    public void rotate(int[][] matrix) {
        //遍历对角线交换
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<i ; j++){
               // if (matrix[i][j] == matrix[0][0] || matrix[i][j] == matrix[i][0] || matrix[i][j] == matrix[0][0] ||matrix[i][j] == matrix[0][0])
              matrix[i][j] =  matrix[i][j] + matrix[j][i];
              matrix[j][i] =  matrix[i][j] - matrix[j][i];
              matrix[i][j] =  matrix[i][j] - matrix[j][i];
            }
        }
        //每一行翻转
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length/2; j++) {
                matrix[i][j]=matrix[i][j]+matrix[i][matrix[0].length-1-j];
                matrix[i][matrix[0].length-1-j]=matrix[i][j]-matrix[i][matrix[0].length-1-j];
                matrix[i][j]=matrix[i][j]-matrix[i][matrix[0].length-1-j];
            }
        }

    }
}
