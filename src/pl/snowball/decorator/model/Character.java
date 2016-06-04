package pl.snowball.decorator.model;

import java.util.List;

public abstract class Character {

	private static final String NEW_LINE = System.getProperty("line.separator");
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String introduceCharacter() {
		StringBuilder sb = new StringBuilder();
		sb.append("Imiê: " + name + NEW_LINE);
		sb.append("Skills: " + NEW_LINE);
		for(String skill : getSkills()) {
			sb.append(" - " + skill + NEW_LINE);
		}
		return sb.toString();
	}
	
	public abstract List<String> getSkills();
}
