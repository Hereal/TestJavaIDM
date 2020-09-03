package fr.ex1;

import fr.exceptions.BadBadValueException;

public class TimeDuration {
	private final int numberOfSeconds;

	public TimeDuration(int numberOfSeconds) throws BadBadValueException { // Constructor
		if (numberOfSeconds < 0) {
			throw new BadBadValueException();
		}
		this.numberOfSeconds = numberOfSeconds;
	}

	@Override
	public String toString() {
		int s = numberOfSeconds;
		int h = s / 3600;
		s -= h * 3600;
		int m = s / 60;
		s -= m * 60;
		String output = "";
		if (h > 0) {
			output += h + "h ";
		}
		if (m > 0 || h > 0) {
			output += m + "m ";
		}
		return output + s + "s";
	}
}
