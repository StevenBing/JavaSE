package recursion;

/**
 * 用递归算法计算1+2+...+100的和
 *
 * @author StevenBing
 * Created in 2018/5/2 15:20
 */
public class Sum {
    private static int sum = 0;
    public static void main(String[] args) {

        new Sum().getSum(1);
        System.out.println(sum);
    }
    private void getSum(int num){
        if (num != 100){
            getSum(++num);
            num--;
        }
        System.out.println("num: " + num);
        sum += num;
    }
}
