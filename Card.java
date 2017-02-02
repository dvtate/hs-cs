import java.util.*;

public class Card {

	private static final String[] faces = { "ace", "2", "3", "4", "5", "6", "7",
						"8", "9", "10", "jack", "queen", "king" };
	private static final String[] suits = { "hearts", "clubs", "spades", "diamonds" };

	private int face, suit;

	public Card(){
		Random rand  = new Random();
		face = rand.nextInt();
		suit = rand.nextInt();
	}

	public Card random(){
		Random rand  = new Random();
		face = Math.abs(rand.nextInt()) % 13;
		suit = Math.abs(rand.nextInt()) % 4;
		return this;
	}


	public void print(){
		System.out.println(faces[face] + " of " + suits[suit]);
	}


};
