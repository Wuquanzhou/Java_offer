package find_repeat_1;

import java.util.ArrayList;
import java.util.Stack;

public class Test6 {

	public ArrayList<Integer> printListFromTail(ListNode listNode) {
		/**
		 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ
		 * �����ֻҪ֪��ջ������ݽṹ�����Ǻܺ�����������
		 * �����ҵ�ȷ��û�뵽�õݹ�Ҳ��������������⣬��˵�ݹ���������еĵĽⷨ����
		 * ���ţ�����û�뵽�õݹ�˵�����ǶԵݹ����⻹�����������
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
