package pl.snowball.decorator;

import java.util.ArrayList;
import java.util.List;

import pl.snowball.decorator.model.Character;
import pl.snowball.decorator.model.Elf;
import pl.snowball.decorator.model.Human;
import pl.snowball.decorator.model.Pterodaktyl;
import pl.snowball.decorator.model.Worrior;

public class Main {
	public static void main(String[] args) {
		List<Character> characters = new ArrayList<>();
		
		Character czlowiekPterodaktyl = new Worrior(new Pterodaktyl(new Human())); //mo¿emy dodaæ 2 profesje
		czlowiekPterodaktyl.setName("Zenek");
		System.out.println(czlowiekPterodaktyl.introduceCharacter());
		characters.add(czlowiekPterodaktyl);
		
		Character elfPterodaktyl = new Pterodaktyl(new Elf());
		elfPterodaktyl.setName("Franek");
		System.out.println(elfPterodaktyl.introduceCharacter());
		characters.add(elfPterodaktyl);
	}
}
