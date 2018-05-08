package recursion;

/**
 * 2个瓶子换一瓶汽水，3个瓶盖换一瓶汽水
 * 
 * @author StevenBing Created in 2018/5/2 16:36
 */
public class BottleCap {


	public static void main(String[] args) {

		int money = 20;
		BottleCap bottleCap = new BottleCap();
		System.out.println(bottleCap.getSoda(money,money) + money);
	}

	private int getSoda(int lid, int bottle) {
		int sum = lid/3 + bottle/2;
		lid = sum + lid % 3;
		bottle = sum + bottle % 2;

		if (lid > 2 || bottle >1){
			sum += getSoda(lid, bottle);
		}
		return sum;
	}
}
