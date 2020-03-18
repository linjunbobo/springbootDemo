package com.example.demo.LeetCode;

import lombok.val;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:linjunbo
 * @Description:
 * @Date: 2020/3/17 10:13
 */

/**
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 * 示例2:
 * <p>
 * 输入：[1, 1, 1, 1, 2]
 * 输出：[1, 2]
 * 提示：
 * <p>
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicate-node-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 移除重复节点 {
    public static ListNode removeDuplicateNodes(ListNode head) {
        //解题思路。 使用set集合 判断add添加是否能成功  如果不成功则说明存在重复 将前一个结点的的next指向当前结点的next
        //当前节点
        ListNode thisNode = head;
        //上一个节点
        ListNode beforeNode = null;
        Set<Integer> set = new HashSet<>();
        while (thisNode != null) {
            if (!set.add(thisNode.val)) {

                beforeNode.next = thisNode.next;
                thisNode.next = null;
                thisNode = beforeNode.next;


            } else {
                beforeNode = thisNode;
                thisNode = thisNode.next;

            }
        }

        return head;

    }

    public static void main(String[] args) {
        ListNode testNode = null;
        Integer[] a = new Integer[]{1, 2, 3, 3, 2, 1};

        for (Integer integer : a) {
            if (testNode == null) {
                testNode = new ListNode(integer);
            } else {
                testNode.add(integer);
            }


        }
        testNode.print();
        ListNode removeDuplicateNodes = removeDuplicateNodes(testNode);
        System.out.println("结果");
        removeDuplicateNodes.print();


    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    ListNode() {
    }

    // 打印链表
    public void print() {
        System.out.print(this.val);
        if (this.next != null) {
            System.out.print("-->");
            this.next.print();
        }
    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if (this.next == null)
            this.next = newNode;
        else
            this.next.add(newval);
    }

}