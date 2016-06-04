package pl.snowball.decorator;

import pl.snowball.decorator.model.Character;
import pl.snowball.decorator.model.Human;
import pl.snowball.decorator.model.Pterodaktyl;

public class Main {
	public static void main(String[] args) {
		Character czlowiekPterodaktyl = new Pterodaktyl(new Human());
		
		for(String skill : czlowiekPterodaktyl.getSkills()) {
			System.out.println(skill);
		}
	}
}
