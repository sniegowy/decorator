package pl.snowball.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Human implements Character {
	
	private List<String> raceSkills = new ArrayList<>();
	
	public Human() {
		init();
	}

	private void init() {
		raceSkills.add("Cz³owiek nie ma zdolnoœci :(");
	}

	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}
