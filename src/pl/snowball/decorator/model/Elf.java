package pl.snowball.decorator.model;

import java.util.ArrayList;
import java.util.List;

public class Elf implements Character {
	
	private List<String> raceSkills = new ArrayList<>();
	
	public Elf() {
		init();
	}

	private void init() {
		raceSkills.add("Widzenie w ciemno�ci");
		raceSkills.add("i inne magiczne zdolno�ci elf�w");
	}
	
	@Override
	public List<String> getSkills() {
		return getRaceSkills();
	}
	
	public List<String> getRaceSkills() {
		return raceSkills;
	}
}
