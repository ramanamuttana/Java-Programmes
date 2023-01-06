package arrayacollections;

import java.util.ArrayList;
import java.util.List;

public class Spell {

	public String name;
	public SpellType spellType;
	public String description;

	public enum SpellType {
		SPELL, CHARM, CURSE
	}

	public Spell(String spellName, SpellType spellType, String description) {
		name = spellName;
		this.spellType = spellType;
		this.description= description;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {

		List<Spell> spellss = new ArrayList<>();
		spellss.add(new Spell("Aparecium", Spell.SpellType.SPELL, "Makes invisible ink appear"));
		spellss.add(new Spell("America", Spell.SpellType.CHARM, " It is also same"));
		spellss.add(new Spell("Singapore", Spell.SpellType.CURSE, "More developed"));
		/*
		 * By using for enhanced loop for(Spell value:spellss)
		 * System.out.println(value.name);
		 */
		// here we are using Lambda expressions and filtering only type SPELL
		spellss.stream().filter(s -> s.spellType == Spell.SpellType.SPELL).forEach(s -> System.out.println(s));
	}

}
