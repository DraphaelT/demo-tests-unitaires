package fr.diginamic.immobilier;
import fr.diginamic.immobilier.entites.*;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class MaisonTest {
	Piece[] pieces = new Piece[1];
	//////////////////////////////////
	@Test
	public void ajouterPieceTest() {
		
		Piece nvPiece = new WC(1,50);
		
		Piece[] newTab = new Piece[pieces.length+1];
		
		for (int i=0; i<pieces.length; i++){
			newTab[i]=pieces[i];
		}
		newTab[newTab.length-1]=nvPiece;
		
		assertNotNull(newTab);	
	}
	@Test
	public void ajouterPieceTestNull() {
		
		Piece nvPiece = null;
		
		Piece[] newTab = new Piece[pieces.length+1];
		
		for (int i=0; i<pieces.length; i++){
			newTab[i]=pieces[i];
			assertNotNull(newTab);	
		}
		newTab[newTab.length-1]=nvPiece;
		
		
	}
	////////////////////////////////
	@Test
	public void superficieEtageTest(){
		//Creation pour test la methode
		Piece nvPiece = new WC(1,50.5);
		pieces[0] = nvPiece;
		//
		int choixEtage = 1;
		double superficieEtage = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if (choixEtage == this.pieces[i].getNumEtage()) {
				superficieEtage = this.pieces[i].getSuperficie();
			}
		}
		
		assertEquals(50,superficieEtage,0.50);
	}
	@Test
	public void superficieEtageTestNull(){
		//Creation pour test la methode
		pieces[0] = null;
		//
		int choixEtage = 1;
		double superficieEtage = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			//Part de la methode si une piece est vide(ce qui n'est pas le cas Normalement) 
			if (pieces[i]!=null && choixEtage == pieces[i].getNumEtage()) {
				superficieEtage = pieces[i].getSuperficie();
			}
		}
		
		assertEquals(0,superficieEtage,0.50);
	}
	// TEST DE superficieTypePiece
	@Test
	public void superficieTypePieceTest() {
		pieces = new Piece[2];
		String typePiece = "WC";
		pieces[0] = new WC(1,50.5);
		pieces[1] = new Cuisine(1,50.5);
		
		double superficie = 0;

		for (int i = 0; i < pieces.length; i++) {
		
			if (typePiece!=null && typePiece.equals(pieces[i].getType())) {
				superficie = superficie + pieces[i].getSuperficie();
			}
		}
		
		assertEquals(50,superficie,0.50);
	}
	
	@Test
	public void superficieTypePieceTestNull() {
		pieces = new Piece[2];
		String typePiece = "WC";
		pieces[0] = null;
		pieces[1] = new Cuisine(1,50.5);
		
		double superficie = 0;

		for (int i = 0; i < pieces.length; i++) {
			if (pieces[i]!=null && typePiece!=null && typePiece.equals(pieces[i].getType())) {
				superficie = superficie + pieces[i].getSuperficie();
			}
		}
		
		assertEquals(0,superficie,0.50);
	}
	
	
	@Test
	public void calculerSurfaceTest() {
		pieces = new Piece[2];
		pieces[0] = null;
		pieces[1] = new Cuisine(1,50.5);
		
		double superficieTot = 0;
		
		for (int i = 0; i < pieces.length; i++) {
			if(pieces[i]!=null) {
				superficieTot = superficieTot + this.pieces[i].getSuperficie();
			}
		}

		assertEquals(50,superficieTot,0.50);
	}
	
}
