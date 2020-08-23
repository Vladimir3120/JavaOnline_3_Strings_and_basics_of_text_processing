package ObectStringOrStringBuilder08;

public class Count {

	public static String longWord(String text) {

		String[] s = text.split(" ");
		int max = 0;

		for (int i = 0; i < s.length; i++) {

			if (s[i].length() > max) {
				max = s[i].length();
				text = s[i];
			}
		}
		return text;
	}

}
