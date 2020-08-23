package ObectStringOrStringBuilder01;

public class Count {

	public static int maxCountSpace(String text) {

		int max = 0;
		int count = 0;
		int[] ar = new int[text.length()];

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ') {

				count++;
				ar[i] = count;

			} else {
				count = 0;
			}
		}

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}

}
