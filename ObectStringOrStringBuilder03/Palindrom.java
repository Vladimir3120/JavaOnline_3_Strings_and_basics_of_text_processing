package ObectStringOrStringBuilder03;

public class Palindrom {

	private String text;

	public Palindrom() {
		super();
	}

	public void chek(String text) {

		boolean isPolindrom = false;

		text = text.toLowerCase();

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == text.charAt(text.length() - 1 - i)) {

				isPolindrom = true;

			} else {
				isPolindrom = false;
				break;
			}
		}
		System.out.println(isPolindrom);

	}

	@Override
	public String toString() {
		return "Palindrom [text=" + text + "]";
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
		Palindrom other = (Palindrom) obj;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}
	
	

}
