package find_repeat_1;

public class find_2d {

	public static void main(String[] args) {
		int[][] in = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		int number = 14;
		System.out.println(test(in, 4, 4, number));
	}
	public static boolean test(int in[][], int r, int c, int number){
		/*
		 *二维数组，每行每列，从左到右，从上到下，按递增顺序排列 ，判断某数字是否在该数组中
		 *注：谈下我一开始的思路：
		 *   1.遍历第一行，直到number>in[0][j],然后只保留0~j-1列，若有相等就直接返回
		 *   2.遍历第一列，直到number>in[i][0],然后只保留0~i-1列，若有相等就直接返回
		 *   3.此时，该数字就被锁定到[i][j]矩阵中了，但仔细想想这样有个极端的问题，该数字若在右下角，其实这样的分割法就毫无意义了
		 *之后参考了书中思路，恍然大悟，“分割”这个点想到了，但是遍历的路径选错了，感觉有点固定思维了，总是想着从左上角开始遍历
		 *没有抓住题里给的数字排列顺序背后在规律，今后在处理问题时，应该具有一发散性思维，跳出固定思维处理问题！！！
		 */
		boolean flag = false;
		int i = 0;
		int j = c-1;
		while(i < r && j >= 0){
			if(number == in[i][j]){
				flag = true;
				break;
			}
			if(number < in[i][j]){
				j--;
			}else{
				i++;
			}
		}
		
		
		
		return flag;
	}
}
