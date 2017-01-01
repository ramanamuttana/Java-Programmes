package Arrayacollections;

import java.util.ArrayList;
import java.util.List;

public class Spell {
	
	public String name;
	public SpellType type;
	public String desc;
	public enum SpellType {SPELL,CHARM,CURSE}
	
	public Spell(String spellName,SpellType spell,String description)
	{
		name=spellName;
		type=spell;
		desc=description;
	}
	public String toString()
	{
		return name;
	}

	public static void main(String[] args) 
	{
	
		ArrayList<Spell> spellss=new ArrayList<>();
		spellss.add(new Spell("Aparecium",Spell.SpellType.SPELL,"Makes invisible ink appear"));
		spellss.add(new Spell("America",Spell.SpellType.SPELL," It is also same"));
		spellss.add(new Spell("Singapore",Spell.SpellType.CURSE,"More developed"));
		/* By using for enhanced loop
		for(Spell value:spellss)
			System.out.println(value.name);
        */
		//here we are using Lamba expressions and filtering only type SPELL
		spellss.stream()
		.filter(s -> s.type==Spell.SpellType.SPELL)
		.forEach(s -> System.out.println(s));
	}

}
