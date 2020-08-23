package RegularExpressions01;

public class Creator {

	public static String sortLetter(String text, char letter) {

		StringBuilder builder = new StringBuilder();

		String[] s = text.split("(\\.)");

		for (String string : s) {

			String[] ds = string.split("\\W");

			for (int i = 0; i < ds.length; i++) {
				for (int j = 0; j < ds.length - 1 - i; j++) {

					if (count(ds[j], letter) > count(ds[j + 1], letter)) {
						String temp = ds[j];
						ds[j] = ds[j + 1];
						ds[j + 1] = temp;
					}
				}
			}

			for (int i = 0; i < ds.length; i++) {
				for (int j = 0; j < ds.length - 1 - i; j++) {

					if (count(ds[j], letter) == count(ds[j + 1], letter) && ds[j].compareTo(ds[j + 1]) > 0) {

						String temp = ds[j];
						ds[j] = ds[j + 1];
						ds[j + 1] = temp;
					}
				}
			}

			for (String string2 : ds) {
				if (string2.indexOf(letter) != -1) {

					builder.append(string2);
					builder.append(" ");
				}
			}
			builder.append("\n");
		}

		return text = builder.toString();

	}

	private static int count(String s, char l) {
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == l) {
				count++;
			}

		}

		return count;

	}

	public static String sortWordLength(String text) {

		String[] ar = text.split("(\\. ?)");

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < ar.length; i++) {

			String[] sort = ar[i].split(" ");

			for (int j = 0; j < sort.length; j++) {
				for (int j2 = 0; j2 < sort.length - 1 - j; j2++) {

					if (sort[j2].length() > sort[j2 + 1].length()) {
						String temp = sort[j2];
						sort[j2] = sort[j2 + 1];
						sort[j2 + 1] = temp;
					}
				}
			}

			for (int j = 0; j < sort.length; j++) {

				builder.append(sort[j]);
				builder.append(" ");

			}

			builder.append(".");
		}

		return text = builder.toString();

	}

	public static String sortSentenceLength(String text) {

		String[] arrayText = text.split("\n");
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arrayText.length; i++) {

			for (int j = 0; j < arrayText.length - 1 - i; j++) {

				if (arrayText[j].length() > arrayText[j + 1].length()) {
					String s = arrayText[j];

					arrayText[j] = arrayText[j + 1];
					arrayText[j + 1] = s;

				}
			}
		}

		for (int i = 0; i < arrayText.length; i++) {

			builder.append(arrayText[i]);
			builder.append("\n");
		}

		return text = builder.toString();

	}
}
