package find_repeat_1;

import java.util.ArrayList;
import java.util.Stack;

public class Test6 {

	public ArrayList<Integer> printListFromTail(ListNode listNode) {
		/**
		 * 输入一个链表，从尾到头打印链表每个节点的值
		 * 这个题只要知道栈这个数据结构，还是很好想解决方案的
		 * 但是我的确是没想到用递归也可以用来解这道题，虽说递归在这个题中的的解法并非
		 * 最优，但是没想到用递归说明还是对递归的理解还不够深，需留心
		 */
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode != null){
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!stack.isEmpty()){
			list.add(stack.pop());
		}
        return list;
	}
}
