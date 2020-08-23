package ObectStringOrStringBuilder10;

public class Count {

	public static int countSentence(String x) {

		int count = 0;

		for (int i = 0; i < x.length(); i++) {

			if (x.charAt(i) == '.' || x.charAt(i) == '!') {
				count++;
			}
		}

		return count;
	}

}
