package fr.ex2;

import java.util.HashMap;

import fr.ex1.TimeDuration;
import fr.exceptions.BadBadValueException;

public class RaceResults {
	private final HashMap<TimeDuration,String > mapResult;
	
	public RaceResults() {
		mapResult = new HashMap<>();
	}
	
	public void onNewResult(String tagNumber, TimeDuration resultTime) throws BadBadValueException {
		if(resultTime == null) {
			throw new BadBadValueException("resultTime is null");
		}
		mapResult.put(resultTime,tagNumber );
	}
	
	public void printResults() {
		for(TimeDuration item : mapResult.keySet()) {
			System.out.println("duration: " +item.toString() + "  tagNumber: "+ mapResult.get(item));
		}

	}
	
}
