package find_repeat_1;
import java.util.Scanner;
public class replaceSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入任意字符:");
		String str=sc.nextLine();
		long startTime=System.nanoTime();   //获取开始时间
		System.out.println(replace1(str));
		long endTime=System.nanoTime(); //获取结束时间
		 
		System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
	}
	public static String replcae(String str){
		/*
		 * 替换空格
		 */
		int countSpace = 0;
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				countSpace++;
			}
		}
		int newLengh = str.length() + countSpace * 2;
		char[] ss = new char[newLengh];
		
		int newIndex = newLengh - 1;
		for(int i = str.length()-1; i >= 0; i--){
			if(str.charAt(i) == ' '){
				ss[newIndex--] = '0';
				ss[newIndex--] = '2';
				ss[newIndex--] = '%';
			}else{
				ss[newIndex--] = str.charAt(i);
			}			
		}
		return new String(ss);		
	} 
	
	public static String replace1(String str) {  
        StringBuffer sb = new StringBuffer();  
        for (int i = 0; i < str.length(); i++) {  
            if (str.charAt(i) == ' ') {  
                sb.append("%20");  
            } else {  
                sb.append(str.charAt(i));  
            }  
        }  
        return sb.toString();  
    }
}
