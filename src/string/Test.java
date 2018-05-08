package string;
/**
 * 截取域名
 * @author adminitartor
 *
 */
public class Test {
	public static void main(String[] args) {
		//截取出域名“baidu”
		String name = getHostName("www.baidu.com");
		System.out.println("name:"+name);//baidu
		
		name = getHostName("www.sohu.com.cn");
		System.out.println("name:"+name);//sohu
	}
	
	public static String getHostName(String str){
		//截取两个点之间的内容
		int start = str.indexOf(".")+1;
		int end = str.indexOf(".",start);
		return str.substring(start,end);
	}
}




