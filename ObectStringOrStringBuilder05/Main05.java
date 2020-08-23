package ObectStringOrStringBuilder05;

public class Main05 {

	/*
	 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
	 */

	public static void main(String[] args) {

		String text = "Abracham Linkoln";

		Count count = new Count();

		int countA = count.letter(text);

		System.out.println(countA);

	}

}
