package string;
/**
 * String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分
 * 返回所有被拆分后的部分。
 * @author adminitartor
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String str = "1111abc123def456ghi1111";
		/*
		 * 按照数字部分进行拆分
		 * abc def ghi
		 */
//		String[] array = str.split("[0-9]+");
		/*
		 * 若拆分是连续匹配了拆分内容,那么会拆分出
		 * 空字符串。但是若在字符串末尾连续匹配了
		 * 拆分内容，那么所有拆分的空字符串都被忽略
		 */
		String[] array = str.split("[0-9]");
		System.out.println("len:"+array.length);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}








