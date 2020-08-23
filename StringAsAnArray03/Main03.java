package StringAsAnArray03;

public class Main03 {

	/*
	 * В строке найти количество цифр.
	 */

	public static void main(String[] args) {

		String text = "123 plus 99 equal 222";

		Count count = new Count(text);

		System.out.println(count.digit());

	}

}
