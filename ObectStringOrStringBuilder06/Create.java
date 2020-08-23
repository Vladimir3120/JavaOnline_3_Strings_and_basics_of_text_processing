package ObectStringOrStringBuilder06;

public class Create {

	public static String newLine(String text) {

		String newLine = text;

		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < newLine.length(); i++) {
			builder.append(newLine.charAt(i));
			builder.append(newLine.charAt(i));
		}

		return newLine = builder.toString();

	}

}
