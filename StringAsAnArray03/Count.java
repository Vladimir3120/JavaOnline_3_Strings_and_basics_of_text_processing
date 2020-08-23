package StringAsAnArray03;

public class Count {

	private String text;

	public Count(String text) {
		super();
		this.text = text;
	}

	public int digit() {

		int count = 0;

		char[] ch = text.toCharArray();

		for (char c : ch) {

			if (Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public String toString() {
		return "Count [text=" + text + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Count other = (Count) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

}
