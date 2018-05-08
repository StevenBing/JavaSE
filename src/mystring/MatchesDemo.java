package mystring;

import java.util.Scanner;

/**
 *
 * @author StevenBing
 *
 *
 *         Date Created in 2018/4/28 9:42
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 *email 对应的正则表达式
		 * \w+@[\w&&[^_]]+(\.[\w&&[^\d_]]+)+
		 *
		 */
        Scanner scanner = new Scanner(System.in);
        String tes;
        do{
            tes = scanner.next();
            String re = "(\\.[\\w&&[^\\d_]]+)+";
            System.out.println(tes.matches(re));

        }while(!tes.equals("exit"));
		String regex = "\\w+@[\\w&&[^_]]+(\\.[\\w&&[^\\d_]]+)+";
		boolean match = email.matches(regex);
		if (match) {
			System.out.println("是邮箱");
		} else {
			System.out.println("不是邮箱");
		}
	}
}
