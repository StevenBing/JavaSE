package mystring;
/**
 * StringBuilder是专门设计用来修改字符串内容的。
 * 内部维护一个可变的字符数组。开销小，性能好。
 * 
 * 所以凡是有频繁修改字符串内容操作时，都应当使用
 * 它来完成。
 * @author adminitartor
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		/*
		 * 默认创建的StringBuilder表示一个空字符串
		 */
//		StringBuilder builder 
//			= new StringBuilder();
		
		StringBuffer builder 
			= new StringBuffer("好好学习java");
		String str = builder.toString();
		System.out.println(str);
		
		/*
		 * append方法用于追加给定字符串
		 * 
		 * 好好学习java,为了找个好工作!
		 */
		builder.append(",为了找个好工作!");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * 好好学习java,为了找个好工作!
		 * 好好学习java,就是为了改变世界!
		 * 
		 * replace替换部分内容
		 */
		builder.replace(9, 16, "就是为了改变世界");
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * 好好学习java,就是为了改变世界!
		 * ,就是为了改变世界!
		 * 
		 * delete删除指定范围内的字符串
		 */
		builder.delete(0, 8);
		str = builder.toString();
		System.out.println(str);
		
		/*
		 * ,就是为了改变世界!
		 * 活着,就是为了改变世界!
		 * 
		 * insert将给定内容插入到指定位置
		 */
		builder.insert(0,"活着");
		str = builder.toString();
		System.out.println(str);
	}
}








