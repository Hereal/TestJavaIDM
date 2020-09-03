package fr.main;

import fr.ex1.TimeDuration;
import fr.ex2.RaceResults;
import fr.exceptions.BadBadValueException;

public class Main {
	
	

	public static void main(String[] args) throws BadBadValueException {
		System.out.println( new TimeDuration(0).toString());
		System.out.println( new TimeDuration(732).toString());
		System.out.println( new TimeDuration(7242).toString());
		
		RaceResults r1 = new RaceResults();
		r1.onNewResult("ABCD", new TimeDuration(732));
		r1.onNewResult("12DB", new TimeDuration(823));
		r1.onNewResult("DM78", new TimeDuration(1023));
		r1.onNewResult("7P5G", new TimeDuration(402));
		r1.printResults();

	}

}
