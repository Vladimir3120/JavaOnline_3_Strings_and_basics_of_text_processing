package ObectStringOrStringBuilder09;

public class Main09 {

	/*
	 * Посчитать количество строчных (маленьких) и прописных (больших) букв в
	 * введенной строке. Учитывать только английские буквы.
	 */

	public static void main(String[] args) {

		String text = "Hello Java. Привет Java";

		Count count = new Count();

		int smallLetterCount = count.countSmallLetter(text);
		int bigLetterCount = count.countBigLetter(text);

		System.out.println("smallLetterCount (only English letter) = " + smallLetterCount);

		System.out.println("bigLetterCount (only English letter) = " + bigLetterCount);

	}

}
