package com;

public class CharAtExample {
	private char value[];

	public CharAtExample(String value) {
		this.value = value.toCharArray();
	}

	public char charAt(int index) {
		if ((index < 0) || (index >= value.length)) {
			throw new StringIndexOutOfBoundsException(index);
		}
		return value[index];
	}

}
