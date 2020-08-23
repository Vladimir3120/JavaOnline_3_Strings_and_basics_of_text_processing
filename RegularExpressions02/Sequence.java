package RegularExpressions02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sequence {

	private String xml;

	public Sequence(String xml) {
		super();
		this.xml = xml;
	}

	public String createXml() {

		String[] s = xml.split("\n");
		StringBuilder builder = new StringBuilder();

		Pattern openTag = Pattern.compile("<[^>/]+>");
		Pattern closeTag = Pattern.compile("</[^>]+>");
		Pattern wihtoutTag = Pattern.compile("<[^>]+/>");
		Pattern containTag = Pattern.compile("[А-Яа-я\\s*]+[!.?,]?");

		for (String string : s) {

			Matcher openTagMatcher = openTag.matcher(string);
			Matcher withoutTagMatcher = wihtoutTag.matcher(string);
			Matcher containTagMatcher = containTag.matcher(string);
			Matcher closeTagMatcher = closeTag.matcher(string);

			if (openTagMatcher.find()) {
				builder.append("Открывающий Тег ");
				builder.append(openTagMatcher.group());

			}

			if (withoutTagMatcher.find()) {
				builder.append(withoutTagMatcher.group());
				builder.append("Без Тела ");

			}

			if (containTagMatcher.find()) {
				builder.append(" Содержимое тега: ");
				builder.append(containTagMatcher.group());
				builder.append(" ");

			}

			if (closeTagMatcher.find()) {

				builder.append(closeTagMatcher.group());
				builder.append("Закрывающий Тег ");

			}
			builder.append("\n");

		}
		return builder.toString();

	}

	@Override
	public String toString() {
		return "Sequence [xml=" + xml + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((xml == null) ? 0 : xml.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sequence other = (Sequence) obj;
		if (xml == null) {
			if (other.xml != null)
				return false;
		} else if (!xml.equals(other.xml))
			return false;
		return true;
	}

}
