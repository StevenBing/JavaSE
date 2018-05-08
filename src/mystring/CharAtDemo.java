package mystring;
/**
 * char charAt(int index)
 * 获取指定位置对应的字符
 * @author StevenBing
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";		
		//查看第5个字符是什么?
		char c = str.charAt(4);
		System.out.println(c);
		
		/*
		 * 回文
		 * 上海自来水来自海上
		 * 我爱罗爱我
		 * 
		 * 检测规律:正数位置的字符与倒数位置的字符
		 * 都一样的就是回文
		 *             0 1 2      6 7 8
		 */            
		String info = "上海来自水来自海上";
		for(int i=0;i<info.length()/2;i++){
			if(
				info.charAt(i)!=
				info.charAt(info.length()-1-i)
			){
				System.out.println("不是回文");
				/* 当方法的返回值类型为void时，
				 * return是可以单独使用的，作用是
				 * 结束方法。*/
				return;
			}
		}
		System.out.println("是回文");
	}
}








