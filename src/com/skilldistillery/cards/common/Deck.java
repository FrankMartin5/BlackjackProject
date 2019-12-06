package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// F i e l d s
	List<Card> cards;
	
	// C o n s t r u c t o r s	
	public Deck() {
		cards = createDeck();
		shuffle();
	}
	
	public List<Card> createDeck(){
		List<Card> deck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				deck.add(new Card(rank, suit));
			}
		}	
		return deck;
	}
	// M e t h o d s
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
}
