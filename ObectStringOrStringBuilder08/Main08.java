package ObectStringOrStringBuilder08;

public class Main08 {

	/*
	 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и
	 * вывести его на экран. Случай, когда самых длинных слов может быть несколько,
	 * не обрабатывать.
	 */

	public static void main(String[] args) {

		String text = "I have to go to the university now but I will come back soon.";

		String longWord = Count.longWord(text);

		System.out.println(longWord);

	}
}
