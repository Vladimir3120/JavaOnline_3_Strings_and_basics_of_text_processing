package StringAsAnArray04;

public class Main04 {

	/*
	 * В строке найти количество чисел
	 */

	public static void main(String[] args) {

		String text = "99 chicken and 1001 dalmatin 12";

		Count count = new Count(text);

		System.out.println(count.numbers());

	}
}
