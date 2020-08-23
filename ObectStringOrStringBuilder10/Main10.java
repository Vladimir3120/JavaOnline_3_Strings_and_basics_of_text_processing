package ObectStringOrStringBuilder10;

public class Main10 {

	/*
	 * Строка X состоит из нескольких предложений, каждое из которых кончается
	 * точкой, восклицательным или вопросительным знаком. Определить количество
	 * предложений в строке X.
	 */

	public static void main(String[] args) {

		String x = "Hello Java. Java is realy good! I like Java.";

		System.out.println("Number of sentence = " + Count.countSentence(x));
	}

}
