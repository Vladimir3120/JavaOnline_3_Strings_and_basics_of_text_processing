package StringAsAnArray01;

import java.util.Arrays;

public class Editor {

	private String[] camelCase;

	public Editor(String[] camelCase) {
		super();
		this.camelCase = camelCase;
	}

	public String[] snakeCase() {

		for (int i = 0; i < camelCase.length; i++) {

			StringBuilder builder = new StringBuilder();

			char[] ch = camelCase[i].toCharArray();

			for (char c : ch) {

				if (Character.isUpperCase(c)) {

					builder.append("_");
					builder.append(Character.toLowerCase(c));

				} else {
					builder.append(c);
				}

			}

			camelCase[i] = builder.toString();

		}

		return camelCase;

	}

	@Override
	public String toString() {
		return "camelCase=" + Arrays.toString(camelCase) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(camelCase);
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
		Editor other = (Editor) obj;
		if (!Arrays.equals(camelCase, other.camelCase))
			return false;
		return true;
	}

}