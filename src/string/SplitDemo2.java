package string;

public class SplitDemo2 {
	public static void main(String[] args) {
		/*
		 * 图片重命名
		 * 1862867763123.jpg
		 */
		String image = "123.jpg";
		String[] names = image.split("\\.");
		image = System.currentTimeMillis()+"."+names[1];
		System.out.println(image);
		
	}
}
