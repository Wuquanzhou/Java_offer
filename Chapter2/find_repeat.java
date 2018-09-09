package find_repeat_1;

import java.security.PublicKey;

public class find_repeat {
	public static void main(String[] args) {

//		test_1();
		test_2();
		
		}
	
   public static void test_1() {
	   /*
	    * 找出数组中重复的数字（长度为n，每个数字在0~n-1的范围内）
	    */
		int[] in = {2,3,1,0,2,5,3};
		
		for(int i = 0; i < in.length; i++){
			while(i != in[i]){
				if (in[i] == in[in[i]]) {
				    System.out.println("find a repeat number:" + in[i]);
				    break;
				}
			    int k = in[i];
			    in[i] = in[k];
			    in[k] = k;				
			}
	     }	
   }
   
   public static void test_2() {
	/*
	 * 不修改数组找出重复的数字(长度为n+1，每个数字在1~n的范围内)
	 * 时间：O(nlogn),空间(优先)：O(1)
	 * 还可以使用辅助空间O(n),时间上会更快些
	 */
	  int[] in = {2,3,5,4,3,2,6,7};
	  int start = 1;
	  int end = 7;
	  while(start <= end){
		  int middle = (start + end) / 2;
		  System.out.println("middle:"+middle);
		  int count = count_number(in, 8, start, middle);
		  System.out.println("count:"+count);
		  if(start == end){
			  if(count > 1){
				  System.out.println("find a repeat number:" + start);
				  break;
			  }else{
				  System.out.println("have no repeat numbers!");
				  break;
			  }
		  }
		  if(count > (middle-start+1)){
			  end = middle;
		  }else{
			  start = middle + 1;
		  }
	  }
	   
}

	public static int count_number(int in[], int lengh, int start, int end) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < lengh;i++){
			if(in[i] >= start && in[i] <= end){
				count++;
			}
		}
		return count;
	}


}
