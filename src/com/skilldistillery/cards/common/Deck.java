package com.skilldistillery.cards.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	// F i e l d s
	List<Card> cards;
	
	// C o n s t r u c t o r s	
	public Deck() {
		this.cards = new ArrayList<Card>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank: Rank.values()) {
				this.cards.add(new Card(rank, suit));
			}
		}
		shuffle();
	}
	
	// M e t h o d s
	
	public int checkDeckSize() {
		return cards.size();
	}
	
	public Card dealCard() {
		return cards.remove(0);
	}
	public void dealCard(Hand hand) {
		hand.addCard(cards.remove(0));
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
}
