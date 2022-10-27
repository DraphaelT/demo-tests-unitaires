package fr.diginamic.enumerations;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class SaisonTest {

	@Test
	public void valueOfLibelleTest1() {
		
		String libelle = "PRINTEMPS";
		
		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				assertEquals("Printemps",saison.getLibelle());
			}	
		}
	}
	
	@Test
	public void valueOfLibelleTest2() {
		
		String libelle = "HIVER";
		
		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				assertEquals("Hiver",saison);
			}
		}
	}
	@Test
	public void valueOfLibelleTest3() {
		
		String libelle = "ETE";
		
		Saison[] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				assertEquals("Eté",saison);
			}
		}
	}
	
}
